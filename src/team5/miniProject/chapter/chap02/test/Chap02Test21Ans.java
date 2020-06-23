package miniProject.chapter.chap02.test;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Chap02Test21Ans extends JPanel {


	private ChangePanel ch;
	Image imageMain;
	
	private JButton next; // >, MyActionListener
	private JButton last; // >>, MyActionListener2
	private JButton back; // <, MyActionListener3
	private JButton start; // <<, MyActionListener4
	private JButton reset; //목차, MyActionListener5
	
	public Chap02Test21Ans() {}
	
	public Chap02Test21Ans(ChangePanel ch) {
		
		this.ch = ch;
		setLayout(null);
		
		ImageIcon nextImg= new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(100,100);
		next.addActionListener(new MyActionListener());
		next.setBorderPainted(false);
		next.setFocusPainted(false);
	    next.setContentAreaFilled(false);
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
