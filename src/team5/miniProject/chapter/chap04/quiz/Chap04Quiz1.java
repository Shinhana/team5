package miniProject.chap04.quiz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import miniProject.chap04.JPanelTest;

	public class Chap04Quiz1 extends JPanel{
		
		private JPanelTest win;
		Image image;
		private JTextArea memoTextField;
		private JButton reset; //목차
		private JButton start; // <<
		private JButton back; // <
		private JButton next; // >
		private JButton Last; // >>
		
		public Chap04Quiz1(JPanelTest win) {
			setLayout(null);
			this.win=win;
			
			image = new ImageIcon("images/quiz1.png").getImage().getScaledInstance(360, 640, 0);
			
			reset = new JButton("1");
			reset.setSize(20,20);
			reset.setLocation(130,626);
			reset.setBorderPainted(true);
			reset.setFocusPainted(true);
			reset.setContentAreaFilled(true);
			add(reset);
			reset.addActionListener(new MyActionListener());

			start = new JButton("2");
			start.setSize(20,20);
			start.setLocation(163,626);
			start.setBorderPainted(true);
			start.setFocusPainted(true);
			start.setContentAreaFilled(true);
			add(start);
			start.addActionListener(new MyActionListener2());

			back = new JButton("3");
			back.setSize(20, 20);
			back.setLocation(194, 626);
			back.setBorderPainted(true);
			back.setFocusPainted(true);
			back.setContentAreaFilled(true);
			add(back);
			back.addActionListener(new MyActionListener3());

			next = new JButton("4");
			next.setSize(20, 20);
			next.setLocation(225, 626);
			next.setBorderPainted(true);
			next.setFocusPainted(true);
			next.setContentAreaFilled(true);
			add(next);
			next.addActionListener(new MyActionListener4());


			Last = new JButton("5");
			Last.setSize(20, 20);
			Last.setLocation(255, 626);
			add(Last);
			Last.setBorderPainted(true);
			Last.setFocusable(true);
			Last.setContentAreaFilled(true);
			Last.addActionListener(new MyActionListener5());


			memoTextField =  new JTextArea();
			memoTextField.setBounds(50,505,270,100);
			memoTextField.setOpaque(false);
			memoTextField.setForeground(Color.WHITE);
			memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());

			add(memoTextField);
			
			
}
		@Override
		public void paint(Graphics g) {
			g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
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
				// TODO Auto-generated method stub
				
			}
			
		}
		class MyActionListener3 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("");
			}
			
		}
		class MyActionListener4 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("Chap04Quiz2");
			}
			
		}
		class MyActionListener5 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
}