package team5.miniProject.chapter.chap06.quiz;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import game.practice.chap06.Chap06Run;



public class Chap06Ans1 extends JPanel{

	
	Image image;
	private Chap06Run win;
	private JTextArea memoTextField;
	public Chap06Ans1(Chap06Run win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/연습문제2정답.png").getImage();
		
		JButton next = new JButton();
		next.setSize(60,30);
		next.setLocation(300,540);
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
			win.change("ch1"); 
		

		}
	
	}

}
