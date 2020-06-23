package com.kh.model.quiz;

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

public class Chap05Quiz1 extends JPanel {
	JFrame f = new JFrame();
	private ChangePanel ch;
	private JTextField textField;
	Image imageMain;

	private JButton reset; //목차
	private JButton next; // >
	private JButton Last; // >>
	private JButton back; // <
	private JButton start; // <<

	public Chap05Quiz1(ChangePanel ch) {
		this.ch = ch;
		setLayout(null);

		next= new JButton();
		next.setSize(130,130);
		next.setLocation(25,284);
		next.addActionListener(new MyActionListener());
		
		back = new JButton();
		back.setSize(130,130);
		back.setLocation(180,280);
		back.addActionListener(new MyActionListener2());
		

		imageMain = new ImageIcon("images/배열-6.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);
		
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
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
			ch.change("panel8");

		}
	}


	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel9");
		}
	}


}




