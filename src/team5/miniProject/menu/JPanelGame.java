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
		
		Image SpeedImg = new ImageIcon("images/b.png").getImage().getScaledInstance(230, 83, 0);
		speed = new JButton(new ImageIcon(SpeedImg));
		speed.setSize(100,83);
		//speed.setBorderPainted(false);
		//speed.setFocusPainted(false);
		//speed.setContentAreaFilled(false);
		speed.addActionListener(new SpeedGame());
		add(speed);

		Image MiniImg = new ImageIcon("images/a.png").getImage().getScaledInstance(230, 83, 0);
		mini = new JButton(new ImageIcon(MiniImg));
		mini.setSize(230,83);
		//mini.setBorderPainted(false);
		//mini.setFocusPainted(false);
		//mini.setContentAreaFilled(false);
		mini.addActionListener(new MiniGame());
		add(mini);
		
		Image MouseImg = new ImageIcon("images/c.png").getImage().getScaledInstance(230, 83, 0);
		mouse = new JButton(new ImageIcon(MouseImg));
		mouse.setSize(500,83);
		//mouse.setBorderPainted(false);
		//mouse.setFocusPainted(false);
		//mouse.setContentAreaFilled(false);
		mouse.addActionListener(new MouseGame());
		add(mouse);

		ImageIcon backImg= new ImageIcon("images/back.png");
		back= new JButton(backImg);
		back.setSize(20,20);
		back.setLocation(180,620);
		back.addActionListener(new Back());
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		
		imageMain = new ImageIcon("images/quizMain.png").getImage();
		
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
			win.change("mousecatch");
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
