package miniProject.chapter.chap02.quiz;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import miniProject.chapter.chap02.quiz.Chap02Quiz10Ans.MyActionListener;

public class Chap02Quiz11Ans extends JPanel {
	
	private ChangePanel ch;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	public Chap02Quiz11Ans() {}
	
	public Chap02Quiz11Ans(ChangePanel ch) {
		
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
		
		ImageIcon nextImg= new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(100,100);
		next.addActionListener(new MyActionListener());
		//버튼 투명하게 3줄
		next.setBorderPainted(false);
		next.setFocusPainted(false);
	    next.setContentAreaFilled(false);
	    this.add(next);
	    
	    imageMain = new ImageIcon("images/chapter2-dap2.png").getImage();
			
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
				ch.change("quiz2");
				
			}
		}
	
	
	//back
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("ans10");
		}
	}
		
	
	
}

