package miniProject.chapter.chap02;

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

public class Chap02VariablePart5 extends JPanel {
	
	private ChangePanel ch;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JTextArea memoTextField; //메모

	public Chap02VariablePart5() {}
	
	public Chap02VariablePart5(ChangePanel ch) {
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
	    
		ImageIcon startImg = new ImageIcon("images/start.png");
		start = new JButton(startImg);
		start.setSize(20,20);
		start.setLocation(150,620);
		start.addActionListener(new MyActionListener4());
		//버튼 투명하게 3줄
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);
		
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		add(memoTextField);
		
		
		imageMain = new ImageIcon("images/chapter2-5.png").getImage();
		
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false); //투명하게
		super.paint(g);
	}
	

	//back
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("var4");
		}
	}
			
	//start
	class MyActionListener4 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("var1");
			
		}
	}

}
