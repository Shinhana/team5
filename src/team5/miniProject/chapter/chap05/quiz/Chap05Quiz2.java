package team5.miniProject.chapter.chap05.quiz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;

public class Chap05Quiz2 extends JPanel {
	JFrame f = new JFrame();
	private PanelChange win;
	private JTextArea textField;
	Image imageMain;

	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	public Chap05Quiz2(PanelChange win) {
		this.win = win;
		setLayout(null);

		next= new JButton();
		next.setSize(20,20);
		next.setLocation(40,450);
		next.addActionListener(new Next());
		
		back = new JButton();
		back.setSize(20,20);
		back.setLocation(125,450);
		back.addActionListener(new Back());
		
		start = new JButton();
		start.setSize(20,20);
		start.setLocation(200,450);
		start.addActionListener(new Start());
		
		last = new JButton();
		last.setSize(20,20);
		last.setLocation(270,450);
		last.addActionListener(new Last());
		
		

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
		
		last.setBorderPainted(false);
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);
		this.add(last);
		
		textField =  new JTextArea();
		textField.setBounds(50,550,230,50);
		textField.setOpaque(false);
		textField.setForeground(Color.black);
		//테스트 공간 테두리 숨기기 
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());	      
		add(textField);
		
	}

	@Override
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}


	class Next implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("panel11");

		}
	}


	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel12");
		}
	}
	
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel12");
		}
	}
	
	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel12");
		}
	}


}



