package team5.miniProject.chat.server;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class Server extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField port_tf;
	private JTextArea textArea = new JTextArea();
	private JButton start_btn = new JButton("서버 실행");
	private JButton stop_btn = new JButton("서버 중지");

	//network 자원
	private ServerSocket server_socket;
	private Socket socket;
	private int port;

	private Vector user_vc = new Vector();
	private Vector room_vc = new Vector();


	private StringTokenizer st;

	Server()
	{
		init();//화면 메소드
		start();
	}
	public void start()
	{
		start_btn.addActionListener(this);
		stop_btn.addActionListener(this);
	}

	private void init()  //화면 구성
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,319,370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12,10,279,205);
		contentPane.add(scrollPane);


		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);

		JLabel label = new JLabel("포트번호");
		label.setBounds(12,238,57,15);
		contentPane.add(label);

		port_tf = new JTextField();
		port_tf.setBounds(81,235,210,21);
		contentPane.add(port_tf);
		port_tf.setColumns(10);


		start_btn.setBounds(12,280,138,23);
		contentPane.add(start_btn);



		stop_btn.setBounds(151, 280, 140, 23);
		contentPane.add(stop_btn);
		stop_btn.setEnabled(false);


		this.setVisible(true);//true= 화면에 보이게
	}
	private void Server_start()
	{
		try {
			server_socket = new ServerSocket(port);//12345포트 사용
		} catch (IOException e) {

			e.printStackTrace();
		}
		if(server_socket != null)//장상적으로 포트가 열렸을 경우
		{
			Connection();
		}


	}
	public void Connection()
	{


		//1가지의 스레드에서는 1가지의 일만 처리 할 수 있다.
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {//스레드에서 처리 할 일을 기재한다.

				while(true) {	
					try {
						textArea.append("사용자 접속 대기중\n");
						socket = server_socket.accept(); //사용자 접속 대기 무한 대기
						textArea.append("사용자 접속!!\n");

						UserInfo user = new UserInfo(socket);
						user.start(); //객체의 스레드 실행


					} catch (IOException e) {
						
						break;
					}

				}//while 문 끝
			}
		});

		th.start();

	}
	public static void main(String[] args) {
		new Server();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==start_btn)
		{
			System.out.println("서버 스타트 버튼 클릭");
			port = Integer.parseInt(port_tf.getText().trim());
			Server_start();//소켓 생성 및 사용자 접속 대기
			start_btn.setEnabled(false);
			port_tf.setEditable(false);
			stop_btn.setEnabled(true);
			
		}
		else if(e.getSource() == stop_btn)
		{
			start_btn.setEnabled(true);
			port_tf.setEditable(true);
			stop_btn.setEnabled(false);
			
			try {
				server_socket.close();
				user_vc.removeAllElements();
				room_vc.removeAllElements();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("서버 스탑 버튼 클릭");
		}

	}// 액션 이벤트 끝

	class UserInfo extends Thread
	{
		private InputStream is;
		private OutputStream os;
		private DataInputStream dis;
		private DataOutputStream dos;


		private Socket user_socket; 
		private String Nickname ="";

		private boolean Roomch = true;

		UserInfo(Socket soc) //생정자 메소드
		{
			this.user_socket = soc;
			UserNetwork();

		}
		private void UserNetwork()
		{
			try {
				is = user_socket.getInputStream();
				dis = new DataInputStream(is);

				os = user_socket.getOutputStream();
				dos =new DataOutputStream(os);

				Nickname = dis.readUTF(); //사용자의 닉네임을 받는다.
				textArea.append(Nickname + " : 사용자 접속! ");

				//기존사용자에세 새로운 사용자 알림
				System.out.println("현재 접속된 사용자 수 : "+user_vc.size());


				BroadCast("NewUser/"+Nickname); //기존 사용자에게 자신울 알린다.

				//자신에세 기존 사용자를 받아 오는 부분

				for(int i =0 ;i < user_vc.size(); i++)
				{
					UserInfo u = (UserInfo)user_vc.elementAt(i);


					send_Message("OldUser/"+u.Nickname);
				}
				//자신에게 기존 방 목록 받아 오는 부분
				for(int i =0; i<room_vc.size(); i++)
				{
					RoomInfo r = (RoomInfo)room_vc.elementAt(i);
					send_Message("OldRoom/"+r.Room_name);
				}
				
				
				send_Message("room_list_update/ ");

				//자신에게 기존 방 목록을 받아오는 부분
				for(int i =0;  i<room_vc.size(); i++)
				{
					RoomInfo r = (RoomInfo)room_vc.elementAt(i);
					
					send_Message("OldRoom/"+r.Room_name);
				}
				
				send_Message("room_list_update/ ");

				user_vc.add(this); //사용자에게 알린 후 Vector에 자신을 추가 

				BroadCast("user_list_update/ ");

			}
			catch(IOException e) {}


		}
		public void run() //Thread에서 처리할 내용
		{
			while(true)
			{
				try {
					String msg =dis.readUTF();
					textArea.append(Nickname + ": 사용자도 부터 들어온 메세지"+msg +"\n");
					InMessage(msg);
				} catch (IOException e) {

					e.printStackTrace();
				}//메서지 수신
			}
		}//run메소드 끝
		private void InMessage(String str)// 클라이언트로 부터 들어오는 메세지 처리 
		{
			st = new StringTokenizer(str,"/");
			String protocol = st.nextToken();
			String message = st.nextToken();

			System.out.println("프로토콜 : " +protocol);
			System.out.println("메세지 : "+message);



			if(protocol.equals("Note"))
			{

				//protocol = Note
				//message =user2@~~~~
				//note = 받는 내용


				String note = st.nextToken();


				System.out.println("받는 사람: "+message);
				System.out.println("보낼 내용: "+note);

				//백터에서 해당 사용자를 찾아서 메서지 전송

				for(int i = 0;i <user_vc.size(); i++)
				{
					UserInfo u =(UserInfo) user_vc.elementAt(i);

					if(u.Nickname.equals(message))
					{	
						u.send_Message("Note/"+Nickname+"/"+note);
						//이거는 쪽지인데 Note /User1 이 유저야 @~~~~
					}

				}
			}//if 문 끝
			else if(protocol.equals("CreateRoom"))
			{
				//현재 같은 방이 존재 하는지 확인 
				for(int i = 0; i<room_vc.size(); i++)
				{
					RoomInfo r =(RoomInfo) room_vc.elementAt(i);
					if(r.Room_name.equals(message))
					{
						send_Message("CreateRoomFil/ok");
						Roomch = false;
						break;
					}
				}//for 끝
				if(Roomch)
				{
					RoomInfo new_room = new RoomInfo(message ,this);
					room_vc.add(new_room);
					send_Message("CreateRoom/"+message);
					
					BroadCast("New_Room/"+message);
				}
				Roomch = true;
			}//else if 문 끝
			
			else if(protocol.equals("Chatting"))
			{
				String msg = st.nextToken();
				
				for(int i = 0; i<room_vc.size(); i++)
				{
					RoomInfo r = (RoomInfo)room_vc.elementAt(i);
					
					if(r.Room_name.equals(message))
					{
						r.BroadCast_Room("Chatting/"+Nickname+"/"+msg);
					}
				}
			}//else if 
			
			else if(protocol.equals("JoinRoom"))
			{
				for(int i =0 ; i<room_vc.size(); i++)
				{
					RoomInfo r = (RoomInfo)room_vc.elementAt(i);
					if(r.Room_name.equals(message))
					{
						
						r.BroadCast_Room("Chatting/알림/****"+ Nickname+"님이 입장하셨습니다****");
						//사용자 추가
						r.Add_User(this);
						send_Message("JoinRoom/"+message);
					}
				}
			}
			
			
		}



		private void BroadCast(String str )//전체 사용자에세 메세지 보내는 부분
		{

			for(int i=0; i<user_vc.size(); i++)
			{
				UserInfo u = (UserInfo) user_vc.elementAt(i); 
				u.send_Message(str);

			}

		}

		private void send_Message(String str) //문자열을 받아서 전송
		{
			try {
				dos.writeUTF(str);
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	class RoomInfo
	{
		private String Room_name;
		private Vector Room_user_vc = new Vector();

		RoomInfo(String str,UserInfo u)
		{
			this.Room_name =str;
			this.Room_user_vc.add(u);
		}
		public void BroadCast_Room(String str)
		{
			for(int i=0; i<Room_user_vc.size(); i++)
			{
				UserInfo u = (UserInfo)Room_user_vc.elementAt(i);
				
				u.send_Message(str);
			}
		}
		
		private void Add_User(UserInfo u)
		{
			this.Room_user_vc.add(u);
		}
	}
	
	
	//Protocol
	//1.통신 규약
	//사용자 추가 = Newuser/사용자ID
	//기존 사용자 = OldUser/사용자ID
	//쪽지 = client입장  Note/받는사람/내용
	//       Server입장 Note/받는사람/내용
	//  	 		    Note/보낸사람/내용
	//					Note/User@내용
	
	
	
	
	
	
	
	
}
