package team5.miniProject.chapter.chap06.test;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;



public class Chap06Test2Ans2 extends JPanel{

	
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	public Chap06Test2Ans2(PanelChange win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/xheap.png").getImage();
		
		JButton next = new JButton();
		next.setSize(50,25);
		next.setLocation(280,570);
		add(next);
		next.addActionListener(new Next());
		next .setBorderPainted(false);
		next .setFocusPainted(false);
		next .setContentAreaFilled(false);
		
		
		
		
		
	}
	
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist"); 
		

		}
	
	}
}