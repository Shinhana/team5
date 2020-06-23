package game.practice.quiz;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import game.practice.chap06.Chap06Run;



public class Chap06AnsO extends JPanel{

	
	Image image;
	private Chap06Run win;
	private JTextArea memoTextField;
	public Chap06AnsO(Chap06Run win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/연습문제1오답.png").getImage();
		
		JButton next = new JButton();
		next.setSize(120,30);
		next.setLocation(240,540);
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
			win.change("jea1"); 
		

		}
	
	}

}

	
	