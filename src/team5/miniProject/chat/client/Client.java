package team5.miniProject.chat.client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Client  extends JFrame implements ActionListener,KeyListener{


	//Login GUI 변수
	private JFrame Login_GUI= new JFrame();
	private JPanel Login_Pane;
	private JTextField ip_tf; // id 받는 텍스트 필
	private JTextField port_tf; // port 받는 텍스트 필드
	private JTextField id_tf; // id 받는 텍스트 필드 
	private JButton login_btn = new JButton("접속 "); //접속 버튼

	
	//Main GUI 변수 
	private JPanel contentPane;
	private JTextField message_tf;
	private JButton notesend_btn = new JButton("쪽지 보내기");
	private JButton joinroom_btn = new JButton("채팅방 참여");
	private JButton createroom_btn = new JButton("방만들기");
	private JButton send_btn = new JButton("전송");
	
	private JList User_list = new JList(); //전체 접속자 list
	private JList Room_list = new JList();//전체 방목록 List
	private JTextArea Chat_area = new JTextArea();// 채팅창 변수
	
	//네트워크를 위한 자원 변수
	private Socket socket;
	private String ip = "";// 자기 자신
	private int port ;
	private String id = "";
	private InputStream is; // 바이트 단위: 입력 받을 때 사용
	private OutputStream os ;// 바이트 단위
	private DataInputStream dis;//기본 데이터 형 저장
	private DataOutputStream dos;//기본 데이터형 저장
	
	//그외의 변수들 
	Vector user_list = new Vector();
	Vector room_list = new Vector();
	StringTokenizer st;
	
	private String My_Room; //내가 있는 방 이름
	
	Client() //생성자 메소드 
	{
		Login_init(); //Login창 화면 구성 메소드
		Main_init(); //Main창 화면 구성 메소드
		start();
		
	}
	private void start()
	{
		login_btn.addActionListener(this);//로그인 버튼 리스너
		//원하는 버튼.해당 action리스너
		notesend_btn.addActionListener(this);//쪽지 보내기 리스너
		joinroom_btn.addActionListener(this);//채팅방 참여 리스너
		createroom_btn.addActionListener(this);//채팅방 만들기 버튼 리스너
		send_btn.addActionListener(this);//채팅 전송 버튼 리스너
		message_tf.addKeyListener(this);
	}
	
	private void Main_init()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,516,450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("전체 접속자");
		label.setBounds(12, 10, 86, 15);
		contentPane.add(label);
		
		
		User_list.setBounds(12, 32, 109, 117);
		contentPane.add(User_list);
		User_list.setListData(user_list);
		
		notesend_btn.setBounds(12, 159, 109, 23);
		contentPane.add(notesend_btn);
		
		JLabel label1 = new JLabel("채팅방 목록");
		label1.setBounds(12, 192, 97, 15);
		contentPane.add(label1);
		
		
		Room_list.setBounds(12, 213, 109, 135);
		contentPane.add(Room_list);
		Room_list.setListData(room_list);
		
		
		joinroom_btn.setBounds(12, 358, 109, 23);
		contentPane.add(joinroom_btn);
		
	
		createroom_btn.setBounds(12, 386, 109, 23);
		contentPane.add(createroom_btn);
		
		
		Chat_area.setBounds(133, 29, 344, 347);
		contentPane.add(Chat_area);
		Chat_area.setEditable(false);
		
		
		message_tf = new JTextField();
		message_tf.setBounds(133, 387, 279, 21);
		contentPane.add(message_tf);
		message_tf.setColumns(10);
		message_tf.setEnabled(false);
		
		send_btn.setBounds(414, 386, 63, 23);
		contentPane.add(send_btn);
		send_btn.setEnabled(false);
		
		
		this.setVisible(false);
	}
	
	private void Login_init()
	{
		Login_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login_GUI.setBounds(100,100,287,382);
		Login_Pane = new JPanel();
		Login_Pane.setBorder(new EmptyBorder(5,5,5,5));
		Login_GUI.setContentPane(Login_Pane);
		Login_Pane.setLayout(null);
		
		JLabel label = new JLabel("ServerIP");
		label.setBounds(27,150,57,15);
		Login_Pane.add(label);
		
		
		JLabel label1 = new JLabel("Server Port");
		label1.setBounds(27,193,73,15);
		Login_Pane.add(label1);
		
		JLabel label2 = new JLabel("ID");
		label2.setBounds(27, 247, 57, 15);
		Login_Pane.add(label2);
		
		ip_tf = new JTextField();
		ip_tf.setBounds(97,147,116,21);
		Login_Pane.add(ip_tf);
		ip_tf.setColumns(10);
		
		port_tf =new JTextField();
		port_tf.setBounds(97,190,116,21);
		Login_Pane.add(port_tf);
		port_tf.setColumns(10);
		
		id_tf = new JTextField();
		id_tf.setBounds(97,244,116,21);
		Login_Pane.add(id_tf);
		id_tf.setColumns(10);
		
	
		login_btn.setBounds(27,294,223,23);
		Login_Pane.add(login_btn);
		
		Login_GUI.setVisible(true);//true 경우 화면에 보인다. false = 화면에 보이지 않는다.
	}
	
	private void Network() 
	{
		
		try {
			socket = new Socket(ip,port);
			
			if(socket != null)//정상적으로 소켓이 연력되었을 경우
			{
				Connection();
			}
			
			
		} catch (UnknownHostException e) {
			
			 JOptionPane.showMessageDialog(null, "연결실패","알림",JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
		
			 JOptionPane.showMessageDialog(null, "연결 실패","알림",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	private void Connection() //실제적인 메소드 연결 부분
	{
		try {
		is = socket.getInputStream();
		dis = new DataInputStream(is);
		os= socket.getOutputStream();
		dos = new DataOutputStream(os);
		}
		catch(IOException e)//에러 처리 부분
		{
			
		}//Stream 설정 끝
		
		//처음 접속시에 ID 전송
		
		this.Login_GUI.setVisible(false);
		this.setVisible(true);
		
		send_message(id);
		
		
		//User_list에 사용자 추가
		user_list.add(id);
		//User_list.setListData(user_list);
	
		
	Thread th = new Thread(new Runnable() {

		@Override
		public void run() {
			while(true)
			{
				
				try {
					String msg =dis.readUTF(); //메세지 수신
					
					
					System.out.println("서버로 부터 수신된 메세지 : " +msg);
					
					inmessage(msg);
					
				} catch (IOException e) {
					
				}
			}
			
		}
		
	});
	th.start();
		
	}
	private void inmessage(String str)// 서버로 부터 들어오는 모든 메세지
	{
	 st =new StringTokenizer(str,"/");
	 
	 String protocol =st.nextToken();
	 String Message =st.nextToken();
	 System.out.println("프로토콜 : "+ protocol);
	 System.out.println("내용 : "+Message);
	 
	 
	 if(protocol.equals("NewUser")) //새로운 접속ㅈ
	 {
		 user_list.add(Message);
		// User_list.setListData(user_list);
		 
		// User_list.updateUI();
		 
		 //AWt List add(); 
	 }
	 else if(protocol.equals("OldUser"))
	 {
		 user_list.add(Message);
	
	 }
	 else if(protocol.equals("Note"))
	 {
		 
		
		 String note = st.nextToken();
		 
		 System.out.println(Message + "사용자로 부터 온 쪽지 " + note);
		 
		 JOptionPane.showMessageDialog
		 (null, note ,Message+"님으로 부터 쪽지 ",JOptionPane.CLOSED_OPTION);;
		 
	 }
	 else if (protocol.equals("user_list_update"))
	 {
		 //User_list.updateUI();
		 User_list.setListData(user_list);
		 
	 }
	 else if (protocol.equals("CreateRoom"))//방을 만들었을때 
	 {
		 My_Room = Message;
		 message_tf.setEnabled(true);
		 send_btn.setEnabled(true);
		 joinroom_btn.setEnabled(false);
		 createroom_btn.setEnabled(false);
	 }
	 else if(protocol.equals("CreateRoomFail"))
	 {	 
		 JOptionPane.showMessageDialog(null, "방만들기 실패","알림",JOptionPane.ERROR_MESSAGE);
	 }
	 else if (protocol.equals("New_Room"))
	 {
		 room_list.add(Message);
		 Room_list.setListData(room_list);
	 }
	 else if(protocol.equals("Chatting"))
	 {
		 String msg =st.nextToken();
		 
		 Chat_area.append(Message+":"+msg+"\n");
	 }
	 else if (protocol.equals("OldRoom"))
	 {
		 room_list.add(Message);
	 }
	 else if (protocol.equals("room_list_update"))
	 {
		 Room_list.setListData(room_list);
		
	 }
	 else if(protocol.equals("JoinRoom"))
	 {
		 My_Room = Message;
		 message_tf.setEnabled(true);
		 send_btn.setEnabled(true);
		 joinroom_btn.setEnabled(false);
		 createroom_btn.setEnabled(false);
		 JOptionPane.showMessageDialog(null, "채팅방에 입장했습니다.","알림",JOptionPane.INFORMATION_MESSAGE);
	 }
	 else if (protocol.equals("OldjRoom"))
	 {
		 room_list.add(Message);
	 }
	 else if(protocol.equals("room_list_update"))
	 {
		 Room_list.setListData(room_list);
	 }
	 
	}
	private void send_message(String str)//서버에게 메서지를 보내는 부분
	{
		try {
			dos.writeUTF(str);
		} catch (IOException e) {//에러 처리 부분
	
		}
	}
	
	public static void main(String[] args) {
		new Client();
	}

	

	//버튼을 누르면 작동 
	@Override
	public void actionPerformed(ActionEvent e) {
		//login_btn =로그인 버튼
		
		if(e.getSource() == login_btn)
		{
			
			//누르게 되면 작동뭥하는 메소드 하지만 start 메소드에 연결 시켜줘야 작동
			System.out.println("로그인 버튼 클릭");
			if(ip_tf.getText().length()==0)
			{
				ip_tf.setText("IP를 입력해주세요");
				ip_tf.requestFocus();
			}
			else if(port_tf.getText().length()==0)
			{
				port_tf.setText("port번호를 입력해주세요");
				port_tf.requestFocus();
			}
			else if(id_tf.getText().length()==0)
			{
				id_tf.setText("ID를 입력해주세요");
				id_tf.requestFocus();
			}
			else
			{
				ip  = ip_tf.getText().trim();
				//trim() = 혹시나 공백이 있을 때 없애 준다.
				port = Integer.parseInt(port_tf.getText().trim());
				//int 형으로 형변환
				id = id_tf.getText().trim(); // id 받아오는 부분
				Network();
				
			}
			
			
		}
		else if (e.getSource() == notesend_btn)
		{
			System.out.println("쪽지 보내기 버튼 클릭");
			String user = (String)User_list.getSelectedValue();
			
			String note = JOptionPane.showInputDialog("보낼메세지");
			if(note != null)
			{
				send_message("Note/"+user+"/"+note);
				
				//ex = Note/User2/나는 User1이야
			}
			System.out.println("받는 사람 : "+user+" | 보낼 내용: "+note);
		}
		
		
		else if(e.getSource() == joinroom_btn)
		{
			String JoinRoom = (String)Room_list.getSelectedValue();
			
			send_message("JoinRoom/"+JoinRoom);
			
			
			System.out.println("방 참여 버튼 클릭");
		}
		else if (e.getSource() == createroom_btn)
		{
			String roomname = JOptionPane.showInputDialog("방 이름");
			if(roomname != null)
			{
				send_message("CreateRoom/"+roomname);
			}
			System.out.println("방 만들기 버튼 클릭");
		}
		else if(e.getSource() == send_btn)
		{
			send_message("Chatting/"+My_Room+"/"+message_tf.getText().trim());
			message_tf.setText("");
			message_tf.requestFocus();
			//Chatting +방이름 +내용
			
			System.out.println("채팅 전송 버튼 클릭");
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e);
		if(e.getKeyCode()==10)
		{
			send_message("Chatting/"+My_Room+"/"+message_tf.getText().trim());
			message_tf.setText("");
			message_tf.requestFocus();
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
