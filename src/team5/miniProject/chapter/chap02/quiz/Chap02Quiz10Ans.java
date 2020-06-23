package miniProject.chapter.chap02.quiz;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import miniProject.chapter.chap02.quiz.Chap02Quiz1.MyActionListener;

public class Chap02Quiz10Ans extends JPanel {
	
	private ChangePanel ch;
	Image imageMain;
	
	private JButton next; // >, MyActionListener
	private JButton last; // >>, MyActionListener2
	private JButton back; // <, MyActionListener3
	private JButton start; // <<, MyActionListener4
	private JButton reset; //목차, MyActionListener5
	
	public Chap02Quiz10Ans() {}
	
	public Chap02Quiz10Ans(ChangePanel ch) {
		
		this.ch = ch;
		setLayout(null);
		
		ImageIcon nextImg= new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(100,100);
		next.addActionListener(new MyActionListener());
		//버튼 투명하게 3줄
//		next.setBorderPainted(false);
//		next.setFocusPainted(false);
//	    next.setContentAreaFilled(false);
	    this.add(next);
	    
	    imageMain = new ImageIcon("images/chapter2-dap1.png").getImage();
		
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
			ch.change("ans11");
			
		}
	}
	
	
	
	
}
