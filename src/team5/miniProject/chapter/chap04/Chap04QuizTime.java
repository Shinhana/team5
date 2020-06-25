package team5.miniProject.chapter.chap04;
import team5.miniProject.run.PanelChange;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Chap04QuizTime extends JPanel{

	private PanelChange win ;
	private JButton practice;
	private JButton test;
	Image image;
	
	public Chap04QuizTime(PanelChange win) {
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/JP_QuizTime.png").getImage().getScaledInstance(360, 640, 0);
		
		
		practice = new JButton();
		practice.setSize(280, 50);
		practice.setLocation(55, 220);
		practice.setBorderPainted(false);
		practice.setFocusPainted(false);
		practice.setContentAreaFilled(false);
		add(practice);
		practice.addActionListener(new Practice());
		
		test = new JButton();
		test.setSize(280, 50);
		test.setLocation(55, 380);
		test.setBorderPainted(false);
		test.setFocusPainted(false);
		test.setContentAreaFilled(false);
		add(test);
		test.addActionListener(new Test());
		
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
		
	}
	class Practice implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("control_quiz1");
		}
		
	}
	class Test implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("control_test1");
		}
		
	}
	
}
