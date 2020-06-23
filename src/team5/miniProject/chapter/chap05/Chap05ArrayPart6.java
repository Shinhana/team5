package com.kh.model.chap05;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.model.controller.ChangePanel;

public class Chap05ArrayPart6 extends JPanel {
	JFrame f = new JFrame();
	private ChangePanel ch;
	private JTextField textField;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton Last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	public Chap05ArrayPart6(ChangePanel ch) {
		this.ch = ch;
		setLayout(null);
		
		back = new JButton();
		back.setSize(25,25);
		back.setLocation(150,530);
		back.addActionListener(new MyActionListener());
		
		start= new JButton();
		start.setSize(25,25);
		start.setLocation(195,530);
		start.addActionListener(new MyActionListener2());
		
		reset = new JButton();
		reset.setSize(25,25);
		reset.setLocation(100,530);
		reset.addActionListener(new MyActionListener3());
		
		next = new JButton();
		next.setSize(150,60);
		next.setLocation(90,190);
		next.addActionListener(new MyActionListener4());
		
		Last = new JButton();
		Last.setSize(150,60);
		Last.setLocation(90,390);
		Last.addActionListener(new MyActionListener5());
		
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
		
		Last.setBorderPainted(false);
		Last.setFocusPainted(false);
		Last.setContentAreaFilled(false);
		this.add(Last);
		
	}
	
	@Override
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}


	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("panel6");

		}
	}


	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel1");
		}
	}
	class MyActionListener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("panel1");

		}
	}
	class MyActionListener4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel7");
		}
	}
	class MyActionListener5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("panel13");

		}
	}


	}

