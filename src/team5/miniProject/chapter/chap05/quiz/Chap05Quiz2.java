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
import com.kh.model.quiz.Chap05Quiz1.MyActionListener;
import com.kh.model.quiz.Chap05Quiz1.MyActionListener2;

public class Chap05Quiz2 extends JPanel {
	JFrame f = new JFrame();
	private ChangePanel ch;
	private JTextField textField;
	Image imageMain;

	private JButton reset; //¸ñÂ÷
	private JButton next; // >
	private JButton Last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	public Chap05Quiz2(ChangePanel ch) {
		this.ch = ch;
		setLayout(null);

		next= new JButton();
		next.setSize(20,20);
		next.setLocation(40,450);
		next.addActionListener(new MyActionListener());
		
		back = new JButton();
		back.setSize(20,20);
		back.setLocation(125,450);
		back.addActionListener(new MyActionListener2());
		
		start = new JButton();
		start.setSize(20,20);
		start.setLocation(200,450);
		start.addActionListener(new MyActionListener3());
		
		Last = new JButton();
		Last.setSize(20,20);
		Last.setLocation(270,450);
		Last.addActionListener(new MyActionListener4());
		
		

		imageMain = new ImageIcon("images/ArrayQuiz2.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);
		
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);
		
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
			ch.change("panel11");

		}
	}


	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel12");
		}
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel12");
		}
	}
	
	class MyActionListener4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel12");
		}
	}


}



