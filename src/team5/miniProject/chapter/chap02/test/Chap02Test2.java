package miniProject.chapter.chap02.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Chap02Test2 extends JPanel {
	
	private ChangePanel ch;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton check; // 정답확인 버튼
	private JTextArea answerField; //정답란
	
	
	public Chap02Test2() {}
	
	public Chap02Test2(ChangePanel ch) {
		
		this.ch = ch;
		setLayout(null);

		 
		ImageIcon backImg= new ImageIcon("images/back.png");
		back= new JButton(backImg);
		back.setSize(20,20);
		back.setLocation(180,620);
		back.addActionListener(new MyActionListener3());
		//버튼 투명하게 3줄
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		
		ImageIcon checkImg = new ImageIcon("images/answerCheck.png");
		check= new JButton(checkImg);
		check.setSize(88,34);
		check.setLocation(248,448);
		check.addActionListener(new Answer());
		check.setBorderPainted(false);
		check.setFocusPainted(false);
		check.setContentAreaFilled(false);
		this.add(check);
	
		answerField = new JTextArea();
		answerField.setBounds(50,520,280,100);
		answerField.setOpaque(false);
		answerField.setForeground(Color.WHITE);
		answerField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		add(answerField);
		
		imageMain = new ImageIcon("images/chap2Level2.png").getImage();
			
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	
	//back
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("test1");
		}
	}
	
	class Answer implements ActionListener{
	   @Override
		 public void actionPerformed(ActionEvent e){
		 System.out.println(e.getActionCommand());
			 String str = answerField.getText();
			 str = str.trim();
			 System.out.println(str);
			            
			       
			 if(str.equals("-124")){
				 JOptionPane.showMessageDialog(null,"정답입니다");
				 ch.change("operator_testAnswer1");
			 } else {
				 JOptionPane.showMessageDialog(null,"틀렸습니다.");
				 ch.change("test1");
			 }
			           
			            
	   	}	  
	}
	
	
}
