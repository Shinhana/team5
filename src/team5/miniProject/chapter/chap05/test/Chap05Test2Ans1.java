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
import com.kh.model.test.Chap05Test2.MyActionListener;
import com.kh.model.test.Chap05Test2.MyActionListener2;
import com.kh.model.test.Chap05Test2.MyActionListener3;
import com.kh.model.test.Chap05Test2.MyActionListener4;
import com.kh.model.test.Chap05Test2.MyActionListener5;
import com.kh.model.test.Chap05Test2.MyActionListener6;

public class Chap05Test2Ans1 extends JPanel {
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
	
	public Chap05Test2Ans1(ChangePanel ch) {
		this.ch = ch;
		setLayout(null);

		next= new JButton();
		next.setSize(20,20);
		next.setLocation(180,610);
		next.addActionListener(new MyActionListener());
		
		back = new JButton();
		back.setSize(20,20);
		back.setLocation(155,610);
		back.addActionListener(new MyActionListener2());
		
		Last= new JButton();
		Last.setSize(20,20);
		Last.setLocation(200,610);
		Last.addActionListener(new MyActionListener3());
		
		start= new JButton();
		start.setSize(20,20);
		start.setLocation(130,610);
		start.addActionListener(new MyActionListener4());
		
		reset = new JButton();
		reset.setSize(20,20);
		reset.setLocation(100,610);
		reset.addActionListener(new MyActionListener5());
		
		ans = new JButton();
		ans.setSize(70,20);
		ans.setLocation(130,573);
		ans.addActionListener(new MyActionListener6());
		
	

		imageMain = new ImageIcon("images/ArrayTest2Ans.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);
		
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		Last.setBorderPainted(false);
		Last.setFocusPainted(false);
		Last.setContentAreaFilled(false);
		this.add(Last);
		
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);
		
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		this.add(reset);
		
		ans.setBorderPainted(false);
		ans.setFocusPainted(false);
		ans.setContentAreaFilled(false);
		this.add(ans);
	
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
	class MyActionListener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("panel10");

		}
	}
	class MyActionListener4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("panel1");

		}
	}
	class MyActionListener5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("panel1");

		}
	}
	class MyActionListener6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("panel14");

		}
	}


}
