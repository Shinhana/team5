package team5.miniProject.chapter.chap04.test;
import team5.miniProject.run.PanelChange;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.chapter.chap04.JPanelTest;
import team5.miniProject.chapter.chap04.test.Chap04Test1.Back;
import team5.miniProject.chapter.chap04.test.Chap04Test1.Last;
import team5.miniProject.chapter.chap04.test.Chap04Test1.Next;
import team5.miniProject.chapter.chap04.test.Chap04Test1.Reset;
import team5.miniProject.chapter.chap04.test.Chap04Test1.Start;

public class Chap04Test2 extends JPanel{

	Image image;
	private JPanelTest win;
	private JTextArea memoTextField;
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	public Chap04Test2 (JPanelTest win) {
		
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/JP_test2.png").getImage().getScaledInstance(360, 640, 0);
		
		reset = new JButton("1");
		reset.setSize(20,20);
		reset.setLocation(115,626);
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		add(reset);
		reset.addActionListener(new Reset());

		start = new JButton("2");
		start.setSize(20,20);
		start.setLocation(150,626);
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		add(start);
		start.addActionListener(new Start());

		back = new JButton("3");
		back.setSize(20, 20);
		back.setLocation(185, 626);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		add(back);
		back.addActionListener(new Back());

		next = new JButton("4");
		next.setSize(20, 20);
		next.setLocation(215, 626);
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		add(next);
		next.addActionListener(new Next());


		last = new JButton("5");
		last.setSize(20, 20);
		last.setLocation(240, 626);
		add(last);
		last.setBorderPainted(false);
		last.setFocusable(false);
		last.setContentAreaFilled(false);
		last.addActionListener(new Last());


		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		add(memoTextField);
		
		
		
	}
	
	@Override
	public void paint (Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
		
	}
	
	class Reset implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("jpanelList");
		}
		
	}
	
	class Start implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04QuizTime");
		}
		
	}
	class Back implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04Test1");
		}
		
	}
	class Next implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("Chap04Test1Ans1");
		}
		
	}
	class Last implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("jpanelList");
		}
		
	}
}














