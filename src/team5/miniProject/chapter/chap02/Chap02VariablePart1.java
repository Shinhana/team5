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

import miniProject.chapter.chap02.Chap02VariablePart3.MyActionListener;
import miniProject.chapter.chap02.Chap02VariablePart3.MyActionListener2;

public class Chap02VariablePart1 extends JPanel {
	
	private ChangePanel ch;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JTextArea memoTextField; //메모
	
	public Chap02VariablePart1() {}
	
	public Chap02VariablePart1(ChangePanel ch) {
		
		this.ch = ch;
		setLayout(null);
	    
		ImageIcon nextImg= new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(210,620);
		next.addActionListener(new MyActionListener());
		//버튼 투명하게 3줄
		next.setBorderPainted(false);
		next.setFocusPainted(false);
	    next.setContentAreaFilled(false);
	    this.add(next);
	    
		ImageIcon lastImg= new ImageIcon("images/last.png");
		last= new JButton(lastImg);
		last.setSize(20,20);
		last.setLocation(237,622);
		last.addActionListener(new MyActionListener2());
		//버튼 투명하게 3줄
		last.setBorderPainted(false);
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);
		this.add(last);
		
		
		ImageIcon resetImg= new ImageIcon("images/reset.png");
		reset= new JButton(resetImg);
		reset.setSize(20,20);
		reset.setLocation(116,620);
		reset.addActionListener(new MyActionListener5());
		//버튼 투명하게 3줄
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		this.add(reset);
		

		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		add(memoTextField);
		
		imageMain = new ImageIcon("images/chapter2-1.png").getImage();
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false); //투명하게
		super.paint(g);
	}
	
	//next
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("var2");
			
		}
	}
	
	//last
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("var7");
		}
	}
	
	//reset
	class MyActionListener5 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("list");
		}
	}
	
}
