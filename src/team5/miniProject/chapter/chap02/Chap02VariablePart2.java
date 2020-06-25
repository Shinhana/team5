package team5.miniProject.chapter.chap02;

import java.awt.Color;

import team5.miniProject.run.PanelChange;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chap02VariablePart2 extends JPanel {
	
	private PanelChange win;
	Image imageMain;
	
	private JButton reset;
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JTextArea memoTextField;
	
	public Chap02VariablePart2() {}
	
	public Chap02VariablePart2(PanelChange win) {
		this.win = win;
		setLayout(null);
		
		ImageIcon nextImg = new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(210,620);
		next.addActionListener(new Next());
		next.setBorderPainted(false);
		next.setFocusPainted(false);
	    next.setContentAreaFilled(false);
	    this.add(next);
	    
		ImageIcon lastImg= new ImageIcon("images/last.png");
		last= new JButton(lastImg);
		last.setSize(20,20);
		last.setLocation(239,622);
		last.addActionListener(new Last());
		last.setBorderPainted(false);
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);
		this.add(last);
	    
		ImageIcon backImg= new ImageIcon("images/back.png");
		back= new JButton(backImg);
		back.setSize(20,20);
		back.setLocation(180,620);
		back.addActionListener(new Back());
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
		
		ImageIcon startImg = new ImageIcon("images/start.png");
		start = new JButton(startImg);
		start.setSize(20,20);
		start.setLocation(150,620);
		start.addActionListener(new Start());
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);
		
		ImageIcon resetImg= new ImageIcon("images/reset.png");
		reset= new JButton(resetImg);
		reset.setSize(20,20);
		reset.setLocation(116,620);
		reset.addActionListener(new Reset());
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		this.add(reset);
		
	    memoTextField =  new JTextArea();
	    memoTextField.setBounds(50,520,280,100);
	    memoTextField.setOpaque(false);
	    memoTextField.setForeground(Color.WHITE);
	    memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    add(memoTextField);
		
		imageMain = new ImageIcon("images/chapter2-2.png").getImage();

	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	//next
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("variable_part3");
			
		}
	}

	//last
	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("variable_part5");
		}
	}
	
	//back
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("variable_part1");
		}
	}
	
	//start
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("variable_main");
		}
	}

	//reset
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");
		}
	}
	
}
