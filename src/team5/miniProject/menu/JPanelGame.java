package team5.miniProject.menu;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.run.PanelChange;


public class JPanelGame extends JPanel {


	private PanelChange win;
	private JButton speed;
	private JButton mini;
	private JButton mouse;
	private JButton back;
	Image imageMain;
	
	public JPanelGame() {}
	
	public JPanelGame(PanelChange win) {
		
		this.win = win;
		setLayout(null);
		
		speed = new JButton();
		speed.setSize(100,100);
		speed.setLocation(125,430);
		speed.setBorderPainted(false);
		speed.setFocusPainted(false);
		speed.setContentAreaFilled(false);
		speed.addActionListener(new SpeedGame());
		add(speed);

		mini = new JButton();
		mini.setSize(100,100);
		mini.setLocation(125,150);
		mini.setBorderPainted(false);
		mini.setFocusPainted(false);
		mini.setContentAreaFilled(false);
		mini.addActionListener(new MiniGame());
		add(mini);
		
		mouse = new JButton();
		mouse.setSize(100,100);
		mouse.setLocation(125,300);
		mouse.setBorderPainted(false);
		mouse.setFocusPainted(false);
		mouse.setContentAreaFilled(false);
		mouse.addActionListener(new MouseGame());
		add(mouse);

		back= new JButton();
		back.setSize(50,50);
		back.setLocation(300,550);
		back.addActionListener(new Back());
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		imageMain = new ImageIcon("images/gameMain.png").getImage();
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	
	//speed
	class SpeedGame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("speedquiz1");
		}
	}
	
	//mini
	class MiniGame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("miniquiz1");
		}
	}
	
	//mouse
	class MouseGame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("mousecatch1");
		}
	}
	
	//back
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("mode");
		}
	}
	
	
	
	
}
