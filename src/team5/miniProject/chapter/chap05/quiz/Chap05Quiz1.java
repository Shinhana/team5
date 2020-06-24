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

public class Chap05Quiz1 extends JPanel {
	JFrame f = new JFrame();
	private PanelChange win;
	private JTextArea textField;
	Image imageMain;

	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<

	public Chap05Quiz1(PanelChange win) {
		this.win = win;
		setLayout(null);

		next= new JButton();
		next.setSize(130,130);
		next.setLocation(25,284);
		next.addActionListener(new Next());

		back = new JButton();
		back.setSize(130,130);
		back.setLocation(180,280);
		back.addActionListener(new Back());


		imageMain = new ImageIcon("images/배열-6.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);

		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);

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
			win.change("panel8");

		}
	}


	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel9");
		}
	}


}




