package miniProject.chap04.quiz;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import miniProject.chap04.JPanelTest;

public class Chap04Quiz1Ans extends JPanel{

	private JPanelTest win;
	Image image;
	private JTextArea memoTextField;
	private JButton reset; //목차
	private JButton start; // <<
	private JButton back; // <
	private JButton next; // >
	private JButton Last; // >>
	
	public Chap04Quiz1Ans(JPanelTest win) {
		
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("/Users/jess/Desktop/images/answer1.png").getImage().getScaledInstance(360, 640, 0);
		
		reset = new JButton("1");
		reset.setSize(20, 20);
		reset.setLocation(115, 626);
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		add(reset);
		reset.addActionListener(new MyActionListener());

		start = new JButton("2");
		start.setSize(20,20);
		start.setLocation(150,626);
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		add(start);
		start.addActionListener(new MyActionListener2());
		
		
		back = new JButton();
		back.setSize(20, 20);
		back.setLocation(185, 626);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		add(back);
		back.addActionListener(new MyActionListener3());
		
		
		next = new JButton();
		next.setSize(20, 20);
		next.setLocation(215, 626);
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		add(next);
		next.addActionListener(new MyActionListener4());
		
		Last = new JButton();
		Last.setSize(20, 20);
		Last.setLocation(240, 626);
		Last.setBorderPainted(false);
		Last.setFocusPainted(false);
		Last.setContentAreaFilled(false);
		add(Last);
		Last.addActionListener(new MyActionListener5());
		
		
	}
	@Override
	public void paint (Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04ControlStatement");
		}
		
	}
	class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("");
		}
		
	}
	class MyActionListener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04Quiz2");
		}
		
	}
	class MyActionListener4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class MyActionListener5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
