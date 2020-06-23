package com.kh.model.test;

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

public class Chap05Test1 extends JPanel {
	JFrame f = new JFrame();
	private ChangePanel ch;
	private JTextField textField;
	Image imageMain;

	private JButton reset; //¸ñÂ÷
	private JButton next; // >
	private JButton Last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton ans;
	
	public Chap05Test1(ChangePanel ch) {
		this.ch = ch;
		setLayout(null);

		next= new JButton();
		next.setSize(75,15);
		next.setLocation(215,585);
		next.addActionListener(new MyActionListener());
		
		back = new JButton();
		back.setSize(25,25);
		back.setLocation(10,35);
		back.addActionListener(new MyActionListener2());
		
		imageMain = new ImageIcon("images/ArrayTest1.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(true);
		this.add(next);
		
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(true);
		this.add(back);
			
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
			ch.change("panel10");

		}
	}


	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel7");
		}
	}
}
