package team5.miniProject.chapter.chap01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import team5.miniProject.run.PanelChange;



public class Chap01ProgramPart04 extends JPanel{
	private JTextField textField;
	private JTextArea memoTextField;
	private PanelChange win;
	Image image;
	public Chap01ProgramPart04(PanelChange win){
		
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/chapter 1-2-1.png").getImage();
//		JLabel lblLbl = new JLabel("헬로우");
//		lblLbl.setBounds(31,40,67,15);
//		add(lblLbl);
//
//		textField = new JTextField();
//		textField.setBounds(123,40,116,21);
//		add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblLbl_1  = new JLabel("바보");
//		lblLbl_1.setBounds(31,84,67,15);
//		add(lblLbl_1);
//		passwordField = new JPasswordField();
//		passwordField.setBounds(123,84,116,21);
//		add(passwordField);
		
		
		
		JButton reset = new JButton("초기화");
		reset.setSize(20,20);
		reset.setLocation(115,620);
		reset.setBorderPainted(false); //테두리 페인팅
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);//누를 때 표시됨
		add(reset);
		reset.addActionListener(new Reset());
		
		JButton next = new JButton("다음장");
		next.setSize(20,20);
		next.setLocation(205,615);
		next.setBorderPainted(false); //테두리 페인팅
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);//누를 때 표시됨
		add(next);
		next.addActionListener(new Next());
		
		JButton back = new JButton("이전");
		back.setSize(20,20);
		back.setLocation(170,615);
		back.setBorderPainted(false); //테두리 페인팅
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);//누를 때 표시됨
		add(back);
		back.addActionListener(new Back());
	
		JButton start = new JButton("처음");
		start.setSize(20,20);
		start.setLocation(150,615);
		start.setBorderPainted(false); //테두리 페인팅
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);//누를 때 표시됨
		add(start);
		start.addActionListener(new Start());
	
		JButton last = new JButton("끝");
		last.setSize(20,20);
		last.setLocation(230,615);
		last.setBorderPainted(false); //테두리 페인팅
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);//누를 때 표시됨
		add(last);
		last.addActionListener(new Last());
		//메모 텍스트 공간 설정
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
				
		add(memoTextField);
		
		}
	
		@Override 
			public void paint(Graphics g){
			g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
			setOpaque(false);//투명하게
		super.paint(g);
	}
		class Reset implements ActionListener{ 
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panelist");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}
	}
		
		class Next implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("program_part5");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
				//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
			}	
		}
		
		class Back implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("program_part3");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
				//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
			}	
		}
		
		class Start implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("program_part1");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
				//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
			}	
		}
		
		class Last implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("program_part7");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
				//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
			}	
		}
}

