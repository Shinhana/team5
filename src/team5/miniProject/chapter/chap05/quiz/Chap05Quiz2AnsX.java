package team5.miniProject.chapter.chap05.quiz;

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

public class Chap05Quiz2AnsX extends JPanel {
	JFrame f = new JFrame();
	private PanelChange win;
	private JTextField textField;
	Image imageMain;

	private JButton reset; //����
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	public Chap05Quiz2AnsX(PanelChange win) {
		this.win = win;
		setLayout(null);

		next= new JButton();
		next.setSize(20,20);
		next.setLocation(180,610);
		next.addActionListener(new Next());
		
		back = new JButton();
		back.setSize(20,20);
		back.setLocation(155,610);
		back.addActionListener(new Back());
		
		last= new JButton();
		last.setSize(20,20);
		last.setLocation(200,610);
		last.addActionListener(new Last());
		
		start= new JButton();
		start.setSize(20,20);
		start.setLocation(130,610);
		start.addActionListener(new Start());
		
		reset = new JButton();
		reset.setSize(20,20);
		reset.setLocation(100,610);
		reset.addActionListener(new Reset());
		
	

		imageMain = new ImageIcon("images/ArrayQuiz2X.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);
		
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		last.setBorderPainted(false);
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);
		this.add(last);
		
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);
		
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		this.add(reset);
	
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
			win.change("array_part6");

		}
	}


	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("array_quiz2");
		}
	}
	class Last implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("array_part6");

		}
	}
	class Start implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("array_main");

		}
	}
	class Reset implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("panellist");

		}
	}
}
