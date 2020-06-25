package team5.miniProject.menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



import team5.miniProject.run.PanelChange;

public class JPanel_Login extends JPanel{
	//전역 변수로 변수들을 설정(추후 생성자가 아닌 메소드에서 접근해서 이벤트 처리를 해야 되기 때문)
		//BufferedImage img = null;
		JTextField loginTextField;
		JPasswordField passwordField;
		JButton btn;
		//각각 이미지,텍스트필드,비밀번호필드,버튼
		Image image;
		private PanelChange win;
		
		//생성자
		public JPanel_Login(PanelChange win){
			
			this.win=win;
			//setTitle("로그인 테스트");
			setSize(1200,700);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			//레이아웃설정 , 셀로판지처럼 처리를 해줌 JLayeredPane
			setLayout(null);
			JLayeredPane layeredPane = new JLayeredPane();
			layeredPane.setBounds(0,0,1200,700);
			layeredPane.setLayout(null);
			
				
			
			//패널1
			//이미지 받아오기
//			try{
//				img = ImageIO.read(new File("C:\\Users\\JMKIM\\eclipse-workspace\\SoloProject\\src\\game\\practice\\img\\login_redesign2.png"));
//			}catch(IOException e){
//				System.out.println("안녕");
//				System.exit(0);
//				
//			}
			image = new ImageIcon("images/login_redesign2.png").getImage();
			
			MyPanel panel = new MyPanel();
			//setLayout을 null값으로 설정했기때문에 패널위치를 다시 설정
			panel.setBounds(0,0,1200,700);
			
			//로그인 내용
			//로그인 필드 ,15글자 제한
			loginTextField = new JTextField(15);
			//위치 절대값 설정
			loginTextField.setBounds(150,220,280,30);
			//셀로판지 레이어드 필드에 text필드를 넣어달라
			layeredPane.add(loginTextField);
			//커스터마이징 처리
			loginTextField.setOpaque(false);
			//글자 색 설정
			loginTextField.setForeground(Color.WHITE);
			loginTextField.setSize(80, 100);
			//텍스트 필드의 경계선을 없앰
			loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			
			//패스워드
			passwordField = new JPasswordField(15);
			passwordField.setBounds(150,370,280,30);
			//커스터마이징 처리		
			//비밀번호 내용
			passwordField.setOpaque(false);
			//글자 색 설정
			passwordField.setForeground(Color.WHITE);
			loginTextField.setSize(80, 100);
			passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			//셀로판지 레이어드 필드에 패스워드 필드를 넣어달라
			layeredPane.add(passwordField);
			
			
			//로그인 버튼 추가
			btn = new JButton(new ImageIcon("images/Group 63.png"));
			btn.setBounds(40,480,274,58);
			
			
			//로그인 버튼 투명처리
			
			//버튼에서 흰색 배경을 검정색으로 변환
			//btn.setBackground(Color.black);
			
			//경계선을 투명화
			
			btn.addActionListener(new MyActionListener3());
			btn.setBorderPainted(false);
			btn.setFocusPainted(false);
			btn.setContentAreaFilled(false);
			JButton btn1 = new JButton();
			btn1.addActionListener(new MyActionListener4());
			btn1.setBorderPainted(false);
			btn1.setFocusPainted(false);
			btn1.setContentAreaFilled(false);
	//	
			layeredPane.add(btn);
			layeredPane.add(btn1);
			//마지막추가들
			//반드시 layeredPane의 제일 마지막에 add해줘야함. 
			//패널은 jframe에 추가시킴
			layeredPane.add(panel);
			btn1.setBounds(200,610,80,35);
			add(layeredPane);
			setVisible(true);
			
			
		}
		class MyPanel extends JPanel{
			//JPanel에 그림을 그리겠다는 메소드
			public void paint(Graphics g){
				g.drawImage(image,0,0,null);
				//저장한 이미지(img) 불러오기
			}
		}
		
		class MyActionListener3 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				try {
					String s;
					String[]array;
					boolean flag = false;
					BufferedReader bos = new BufferedReader(new FileReader("member.txt"));
					boolean flag = false;
					while((s=bos.readLine())!=null) {
						array= s.split("/");
						if(loginTextField.getText().equals(array[1])&&new String(passwordField.getPassword()).equals(array[2]))	
							{
// //
					bos.close();
					
				}catch(IOException E10) {
					
					E10.printStackTrace();
					
				}
//				finally {
//					JOptionPane.showMessageDialog(null, "You falled to  log in.");
//				}
				//로그인 다 출려됨
				
			}
		}



		class MyActionListener4 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				
				win.change("signup");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
				//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
				
				
			}
		}
}
