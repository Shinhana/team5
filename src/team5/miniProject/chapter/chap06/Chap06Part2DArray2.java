package team5.miniProject.chapter.chap06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;

//import game.practice.chap06.Chap06Part1NLoop4.MyActionListener6;
//import game.practice.chap06.Chap06Part2DArray1.MyActionListener5;
//import game.practice.chap06.Chap06Part2DArray1.MyActionListener7;
//import game.practice.chap06.Chap06.MyActionListener3;

public class Chap06Part2DArray2 extends JPanel{

	
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	public Chap06Part2DArray2(PanelChange win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/DA2.png").getImage();
		
		JButton next = new JButton();
		next.setSize(20,20);
		next.setLocation(205,615);
		add(next);
		next.addActionListener(new Next());
		next .setBorderPainted(false);
		next .setFocusPainted(false);
		next .setContentAreaFilled(false);
		
		JButton back = new JButton();
		back.setSize(20,20);
		back.setLocation(170,615);
		add(back);
		back.addActionListener(new Back());
		back .setBorderPainted(false);
		back .setFocusPainted(false);
		back .setContentAreaFilled(false);
		
		JButton last = new JButton();
		last.setSize(20,20);
		last.setLocation(230,615);
		add(last);
		last.addActionListener(new Last());
		last .setBorderPainted(false);
		last .setFocusPainted(false);
		last .setContentAreaFilled(false);
		
		JButton reset  = new JButton();
		reset .setSize(20,20);
		reset .setLocation(115,615);
		add(reset );
		reset .addActionListener(new Reset());
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		
		JButton start  = new JButton();
		start .setSize(20,20);
		start .setLocation(150,615);
		add(start);
		start .addActionListener(new Start());
		start  .setBorderPainted(false);
		start  .setFocusPainted(false);
		start  .setContentAreaFilled(false);
		
		memoTextField =  new JTextArea();
	    memoTextField.setBounds(50,520,280,100);
	    memoTextField.setOpaque(false);
	    memoTextField.setForeground(Color.WHITE);
	    memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	 
	    add(memoTextField);
		
		
		
	}
	
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel23"); 
		
		}
	}
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel21"); 
		}
		
	}
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");//
		}
	}
	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel24");//
		}
	
	}
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel21");//
		}
	}

}





