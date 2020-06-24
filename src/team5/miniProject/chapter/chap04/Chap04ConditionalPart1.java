package team5.miniProject.chapter.chap04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Chap04ConditionalPart1 extends JPanel{
	
	Image image;
	private JPanelTest win;
	private JTextArea memoTextField;
	private JButton reset; //목차
	private JButton next; // >
	private JButton Last; // >>
	private JButton back; // <
	private JButton start; // <<

	public Chap04ConditionalPart1(JPanelTest win){
		//기초설
		setLayout(null);
		//
		this.win = win;

		//이거는 배경이미지요
		image = new ImageIcon("/Users/jess/Desktop/images/if1.png").getImage().getScaledInstance(360, 640, 0);;


		reset = new JButton("1");
		reset.setSize(20,20);
		reset.setLocation(115,626);
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

		back = new JButton("3");
		back.setSize(20, 20);
		back.setLocation(185, 626);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		add(back);
		back.addActionListener(new MyActionListener3());

		next = new JButton("4");
		next.setSize(20, 20);
		next.setLocation(215, 626);
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		add(next);
		next.addActionListener(new MyActionListener4());


		Last = new JButton("5");
		Last.setSize(20, 20);
		Last.setLocation(240, 626);
		add(Last);
		Last.setBorderPainted(false);
		Last.setFocusable(false);
		Last.setContentAreaFilled(false);
		Last.addActionListener(new MyActionListener5());


		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		add(memoTextField);
		//		


	}
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}

	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanelList");
		}
	}
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("Chap04ControlStatement");
		}
	}
	class MyActionListener3  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04ControlStatement");
		}

	}
	class MyActionListener4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04ConditionalPart2");
		}

	}
	class MyActionListener5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04QuizTime");//조건문
 		}

	}


}
