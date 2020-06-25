package team5.miniProject.chapter.chap05;

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

public class Chap05Array extends JPanel {
	JFrame f = new JFrame();
	private PanelChange win;
	private JTextField textField;
	Image imageMain;
	
	private JButton reset; //����
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	
	
	public Chap05Array() {}
	
	public Chap05Array(PanelChange win) {
		
		this.win = win;
		setLayout(null);
		
		
		
		next= new JButton();
		next.setSize(282,95);
		next.setLocation(25,275);
		next.addActionListener(new Next());
		
		
		
		imageMain = new ImageIcon("images/ArrayMain.PNG").getImage();
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);

		this.add(next);
		f.add(this);
		
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
			win.change("array_part1");
			
		}
	}

//	class MyActionListener2 implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e){
//			ch.change("panel2");
//		}
//	}

}
