package team5.miniProject.chapter.chap04;
import team5.miniProject.run.PanelChange;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Chap04BranchPart1 extends JPanel {
	private PanelChange win;
	Image image;
	private JTextArea memoTextField;
	private JButton reset; //목차
	private JButton start; // <<
	private JButton back; // <
	private JButton next; // >
	private JButton last; // >>
	
	
	
	public Chap04BranchPart1(PanelChange win) {
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/JP_continue.png").getImage().getScaledInstance(360, 640, 0);
		
		reset = new JButton("1");
		reset.setSize(20, 20);
		reset.setLocation(115, 626);
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		add(reset);
		reset.addActionListener(new Reset());

		start = new JButton("2");
		start.setSize(20,20);
		start.setLocation(150,626);
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		add(start);
		start.addActionListener(new Start());
		
		
		back = new JButton();
		back.setSize(20, 20);
		back.setLocation(185, 626);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		add(back);
		back.addActionListener(new Back());
		
		
		next = new JButton();
		next.setSize(20, 20);
		next.setLocation(220, 626);
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		add(next);
		next.addActionListener(new Next());
		
		last = new JButton();
		last.setSize(20, 20);
		last.setLocation(240, 626);
		last.setBorderPainted(false);
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);
		add(last);
		last.addActionListener(new Last());
		
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		add(memoTextField);
	}
	@Override
	public void paint (Graphics g) {
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
		
	}
	
	class Reset implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("panellist");
			
			
		}
		
	}
	class Start implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("control_main");
		}
		
	}
	class Back implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("loop_part2");
			
		}
		
	}
	class Next implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("control_quiz");
		}
		
	}
	class Last implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("control_quiz");
		
		}
		
	}
	
	
}












