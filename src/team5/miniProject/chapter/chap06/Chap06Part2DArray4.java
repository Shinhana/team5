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

//import game.practice.chap06.Chap06Part2DArray2.MyActionListener5;
//import game.practice.chap06.Chap06Part2DArray2.MyActionListener6;
//import game.practice.chap06.Chap06Part2DArray2.MyActionListener7;
//import game.practice.chap06.Chap06.MyActionListener3;

public class Chap06Part2DArray4 extends JPanel{


	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	public Chap06Part2DArray4(PanelChange win) {
		setLayout(null);
		this.win=win;

		image = new ImageIcon("images/2Â÷¿ø4.png").getImage();

		JButton next = new JButton();
		next.setSize(100,28);
		next.setLocation(260,450);
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
			win.change("jea"); 

		}
	}
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel23"); 

		}
	}
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");//
		}
	}
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel21");//
		}
	}
}



