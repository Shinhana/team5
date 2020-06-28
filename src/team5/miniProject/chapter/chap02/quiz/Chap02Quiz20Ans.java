package team5.miniProject.chapter.chap02.quiz;

import java.awt.Graphics;
import team5.miniProject.run.PanelChange;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Chap02Quiz20Ans extends JPanel {
	
	private PanelChange win;
	Image imageMain;
	
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton reset;
	
	
	public Chap02Quiz20Ans(PanelChange win) {
		
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
		
	    imageMain = new ImageIcon("images/chap2Quiz2ans.png").getImage();
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
			win.change("variable_quiz2");
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
