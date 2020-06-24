package team5.miniProject.chapter.chap02.test;

import java.awt.Graphics;
import team5.miniProject.run.PanelChange;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.chapter.chap02.test.Chap02Test20Ans.Start;

public class Chap02Test21Ans extends JPanel {


	private PanelChange win;
	Image imageMain;
	
	private JButton next; // >, MyActionListener
	private JButton last; // >>, MyActionListener2
	private JButton back; // <, MyActionListener3
	private JButton start; // <<, MyActionListener4
	private JButton reset; //목차, MyActionListener5
	
	public Chap02Test21Ans() {}
	
	public Chap02Test21Ans(PanelChange win) {
		
		this.win = win;
		setLayout(null);
	    
		ImageIcon startImg = new ImageIcon("images/start.png");
		start = new JButton(startImg);
		start.setSize(20,20);
		start.setLocation(150,620);
		start.addActionListener(new Start());
		//버튼 투명하게 3줄
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
	    
	    imageMain = new ImageIcon("images/chap2Test2ans2.png").getImage();
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	
	//start
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("test1");
		}
	}

	
	//back
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("tans20");
			
		}
	}

	//reset
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("list");
		}
	}
	
}
