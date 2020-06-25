package team5.miniProject.menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import team5.miniProject.run.PanelChange;

public class JPanelSignUp extends JPanel {
	Image image;
	private PanelChange win;
	JTextField loginTextField;
	JTextField emailTextField;
	JPasswordField passwordField;
	
	public JPanelSignUp(PanelChange win) {
		setLayout(null);
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,1200,700);
		layeredPane.setLayout(null);
		setSize(1200,700);
		this.win = win;
		image =new ImageIcon("images/makeAccount.png").getImage();
		MyPanel panel = new MyPanel();
		panel.setBounds(0,0,1200,700);
		loginTextField = new JTextField(15);
		loginTextField.setBounds(100,220,400,100);
		layeredPane.add(loginTextField);
		loginTextField.setOpaque(false);
		loginTextField.setForeground(Color.WHITE);
		loginTextField.setSize(150, 50);
		loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	
		add(layeredPane);
		
		
		setVisible(true);
		
		emailTextField = new JTextField(15);
		emailTextField.setBounds(100,315,400,100);
		layeredPane.add(emailTextField);
		emailTextField.setOpaque(false);
		emailTextField.setForeground(Color.WHITE);
		emailTextField.setSize(250, 50);
		emailTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		passwordField = new JPasswordField(15);
		passwordField.setBounds(100,410,140,30);
		passwordField.setOpaque(false);
		passwordField.setForeground(Color.WHITE);
		passwordField.setSize(300, 50);
		passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		layeredPane.add(passwordField);
		
		
		JButton btn = new JButton(new ImageIcon("images/Signin.png"));
		btn.setBounds(45,500,274,58);
		
		btn.addActionListener(new MyActionListener3());
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(false);
		layeredPane.add(btn);
		
		JButton btn1 = new JButton();
		btn1.setBounds(45,600,274,58);
		
		btn1.addActionListener(new MyActionListener1());
		btn1.setBorderPainted(false);
		btn1.setFocusPainted(false);
		btn1.setContentAreaFilled(false);
		layeredPane.add(btn1);
		

		layeredPane.add(panel);
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent T){
			try {
				BufferedWriter bos = new BufferedWriter(new FileWriter("member.txt",true));
				bos.write(loginTextField.getText()+"/");
				bos.write(emailTextField.getText()+"/");
				bos.write(passwordField.getText()+"\r\n");
				bos.close();
				JOptionPane.showMessageDialog(null, "You have Signed up in successfully");
			
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "You failed to Sign up");
			}
		}
	}
	
	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel_login");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}
	}
	
	
	
	class MyPanel extends JPanel{
		//JPanel에 그림을 그리겠다는 메소드
		public void paint(Graphics g){
			g.drawImage(image,0,0,null);
			
		}
	}
	
	//고객수를 늘리자
	
	
	
}
