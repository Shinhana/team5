package team5.miniProject.chapter.chap06.quiz;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.chapter.chap06.Chap06Run;

public class Chap06Quiz1 extends JPanel{

	
	Image image;
	private Chap06Run win;
	private JTextArea memoTextField;
	public Chap06Quiz1(Chap06Run win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/연습문제1.png").getImage();
		
		JButton O = new JButton();
		O.setSize(100,100);
		O.setLocation(50,350);
		add(O);
		O.addActionListener(new O());
		O .setBorderPainted(false);
		O .setFocusPainted(false);
		O .setContentAreaFilled(false);
		
		JButton X = new JButton();
		X.setSize(100,100);
		X.setLocation(200,350);
		add(X);
		X.addActionListener(new X());
		X .setBorderPainted(false);
		X .setFocusPainted(false);
		X .setContentAreaFilled(false);
		
		
		
		
	}
	
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	class O implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jeao"); 
		
		}
	}
	class X implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jeax"); 
			
		}
	
	}

}

	
	