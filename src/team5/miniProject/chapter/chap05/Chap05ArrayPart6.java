package team5.miniProject.chapter.chap05;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import team5.miniProject.run.PanelChange;

public class Chap05ArrayPart6 extends JPanel {
	JFrame f = new JFrame();
	private PanelChange win;
	private JTextField textField;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	public Chap05ArrayPart6(PanelChange win) {
		this.win = win;
		setLayout(null);
		
		back = new JButton();
		back.setSize(25,25);
		back.setLocation(150,530);
		back.addActionListener(new Back());
		
		start= new JButton();
		start.setSize(25,25);
		start.setLocation(195,530);
		start.addActionListener(new Start());
		
		reset = new JButton();
		reset.setSize(25,25);
		reset.setLocation(100,530);
		reset.addActionListener(new Reset());
		
		next = new JButton();
		next.setSize(150,60);
		next.setLocation(90,190);
		next.addActionListener(new Next());
		
		last = new JButton();
		last.setSize(150,60);
		last.setLocation(90,390);
		last.addActionListener(new Last());
		
		imageMain = new ImageIcon("images/Array문제.PNG").getImage();

		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);
		
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		this.add(reset);
		
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);
		
		last.setBorderPainted(false);
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);
		this.add(last);
		
	}
	
	@Override
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}


	class Back implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("panel6");

		}
	}


	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel1");
		}
	}
	class Reset implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("panel1");

		}
	}
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel7");
		}
	}
	class Last implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("panel13");

		}
	}


	}

