package team5.miniProject.chapter.chap02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import team5.miniProject.run.PanelChange;

public class Chap02VariablePart5 extends JPanel {
	
	private PanelChange win;
	Image imageMain;
	
	private JButton reset; 
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JTextArea memoTextField; 

	public Chap02VariablePart5() {}
	
	public Chap02VariablePart5(PanelChange win) {
		this.win = win;
		setLayout(null);
	    
		//ImageIcon backImg= new ImageIcon("images/back.png");
		//back= new JButton(backImg);
		back= new JButton();
		back.setSize(20,20);
		back.setLocation(170,615);
		back.addActionListener(new Back());
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);
	    
		//ImageIcon startImg = new ImageIcon("images/start.png");
		//start = new JButton(startImg);
		start = new JButton();
		start.setSize(20,20);
		start.setLocation(150,615);
		start.addActionListener(new Start());
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);
		
		//ImageIcon resetImg= new ImageIcon("images/reset.png");
		//reset= new JButton(resetImg);
		reset= new JButton();
		reset.setSize(20,20);
		reset.setLocation(115,615);
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
		
		
		imageMain = new ImageIcon("images/chapter2-5.png").getImage();
		
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	

	//back
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("variable_part4");
		}
	}
			
	//start
	class Start implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
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
