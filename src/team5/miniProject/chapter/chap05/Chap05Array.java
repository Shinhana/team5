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

public class Chap05Array extends JPanel {
	JFrame f = new JFrame();
	private ChangePanel ch;
	private JTextField textField;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton Last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	
	public Chap05Array() {}
	
	public Chap05Array(ChangePanel ch) {
		
		this.ch = ch;
		setLayout(null);
		
		
		
		next= new JButton();
		next.setSize(282,95);
		next.setLocation(25,275);
		next.addActionListener(new MyActionListener());
		
		
		
		imageMain = new ImageIcon("images/배열Main.PNG").getImage();
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);

		this.add(next);
		f.add(this);
		
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
			ch.change("panel2");
			
		}
	}

	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			ch.change("panel2");
		}
	}

}
