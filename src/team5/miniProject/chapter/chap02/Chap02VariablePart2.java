package miniProject.chapter.chap02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chap02VariablePart2 extends JPanel {
	
	private ChangePanel ch;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JTextArea memoTextField; //메모
	
	public Chap02VariablePart2() {}
	
	public Chap02VariablePart2(ChangePanel ch) {
		this.ch = ch;
		setLayout(null);
		
		ImageIcon nextImg = new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(210,620);
		next.addActionListener(new MyActionListener());
		//버튼 투명하게 아래 3줄
		next.setBorderPainted(false);
		next.setFocusPainted(false);
	    next.setContentAreaFilled(false);
	    this.add(next);
	    
		ImageIcon lastImg= new ImageIcon("images/last.png");
		last= new JButton(nextImg);
		last.setSize(20,20);
		last.setLocation(239,622);
		last.addActionListener(new MyActionListener2());
		//버튼 투명하게 3줄
		last.setBorderPainted(false);
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);
		this.add(last);
	    
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
		
		imageMain = new ImageIcon("images/chapter2-2.png").getImage();

	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	
	//next
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("var3");
			
		}
	}

	//last
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("var7");
		}
	}
	
	//back
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("var1");
		}
	}
	
	//start
	class MyActionListener4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel1");
		}
	}

}
