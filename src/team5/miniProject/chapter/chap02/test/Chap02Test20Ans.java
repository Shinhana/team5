package team5.miniProject.chapter.chap02.test;

import java.awt.Graphics;
import team5.miniProject.run.PanelChange;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Chap02Test20Ans extends JPanel {

	private PanelChange win;
	Image imageMain;
	
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton reset;
	
	public Chap02Test20Ans() {}
	
	public Chap02Test20Ans(PanelChange win) {
		
		ImageIcon nextImg= new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(100,100);
		next.addActionListener(new Next());
		next.setBorderPainted(true);
		next.setFocusPainted(true);
	    next.setContentAreaFilled(true);
	    this.add(next);
	    
		ImageIcon lastImg= new ImageIcon("images/last.png");
		last= new JButton(lastImg);
		last.setSize(20,20);
		last.setLocation(239,622);
		last.addActionListener(new Last());
		last.setBorderPainted(true);
		last.setFocusPainted(true);
		last.setContentAreaFilled(true);
		this.add(last);
		
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
	    
	    imageMain = new ImageIcon("images/chap2Test2ans1.png").getImage();
		
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

	//next
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("variable_test2Answer21");
			
		}
	}

	//last
	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("variable_test2Answer21");
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
