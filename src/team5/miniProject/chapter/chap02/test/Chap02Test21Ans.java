package team5.miniProject.chapter.chap02.test;

import java.awt.Graphics;
import team5.miniProject.run.PanelChange;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.chapter.chap02.test.Chap02Test1Ans.Reset;
import team5.miniProject.chapter.chap02.test.Chap02Test2.MyActionListener3;
import team5.miniProject.chapter.chap02.test.Chap02Test20Ans.Start;

public class Chap02Test21Ans extends JPanel {


	private PanelChange win;
	Image imageMain;
	
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton reset;
	
	public Chap02Test21Ans() {}
	
	public Chap02Test21Ans(PanelChange win) {
		
		this.win = win;
		setLayout(null);
		imageMain = new ImageIcon("images/chap2Test2ans2.png").getImage();
			
		//ImageIcon startImg = new ImageIcon("images/start.png");
		start = new JButton();
		start.setSize(20,20);
		start.setLocation(150,620);
		start.addActionListener(new Start());
		start.setBorderPainted(true);
		start.setFocusPainted(false);
		start.setContentAreaFilled(true);
		this.add(start);
		
		//ImageIcon backImg= new ImageIcon("images/back.png");
		back= new JButton();
		back.setSize(20,20);
		back.setLocation(180,620);
		back.addActionListener(new Back());
		back.setBorderPainted(true);
		back.setFocusPainted(false);
		back.setContentAreaFilled(true);
		this.add(back);
		
	   // ImageIcon resetImg= new ImageIcon("images/reset.png");
	    reset= new JButton();
	    reset.setSize(20,20);
	    reset.setLocation(116,620);
	    reset.addActionListener(new Reset());
	    reset.setBorderPainted(true);
	    reset.setFocusPainted(false);
	    reset.setContentAreaFilled(true);
	    this.add(reset);
	    
	   
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	//start
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("variable_test1");
		}
	}

	
	//back
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("variable_test2Answer20");
			
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
