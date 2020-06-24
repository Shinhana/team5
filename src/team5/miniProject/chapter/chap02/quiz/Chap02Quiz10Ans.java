package team5.miniProject.chapter.chap02.quiz;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.chapter.chap02.PanelChange;

public class Chap02Quiz10Ans extends JPanel {
	
	private PanelChange win;
	Image imageMain;
	
	private JButton next;
	private JButton last;
	private JButton back;
	private JButton start;
	private JButton reset;
	
	public Chap02Quiz10Ans(PanelChange win) {
		
		this.win = win;
		setLayout(null);
		
		ImageIcon nextImg= new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(100,100);
		next.addActionListener(new Next());
		next.setBorderPainted(true);
		next.setFocusPainted(true);
	    next.setContentAreaFilled(true);
	    this.add(next);
	    
	    ImageIcon resetImg= new ImageIcon("images/reset.png");
	    reset= new JButton(resetImg);
	    reset.setSize(20,20);
	    reset.setLocation(116,620);
	    reset.addActionListener(new Reset());
	    reset.setBorderPainted(false);
	    reset.setFocusPainted(false);
	    reset.setContentAreaFilled(false);
	    this.add(reset);
	    
	    
	    imageMain = new ImageIcon("images/chap2Quiz1ans1.png").getImage();
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
			
	//next
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("qans11");
			
		}
	}
	
	//reset
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("list");
		}
	}
	
	
}
