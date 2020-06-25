package team5.miniProject.chapter.chap02.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;


public class Chap02Test2 extends JPanel {
	
	private PanelChange win;
	Image imageMain;
	
	private JButton reset; 
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton check; 
	private JTextArea answerField;
	
	
	public Chap02Test2() {}
	
	public Chap02Test2(PanelChange win) {
		
		this.win = win;
		setLayout(null);

		 
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
		
		ImageIcon checkImg = new ImageIcon("images/answerCheck.png");
		check= new JButton(checkImg);
		check.setSize(88,34);
		check.setLocation(248,448);
		check.addActionListener(new Answer());
		check.setBorderPainted(false);
		check.setFocusPainted(false);
		check.setContentAreaFilled(false);
		this.add(check);
	
		answerField = new JTextArea();
		answerField.setBounds(50,520,280,100);
		answerField.setOpaque(false);
		answerField.setForeground(Color.black);
		answerField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		add(answerField);
		
		imageMain = new ImageIcon("images/chap2Test2.png").getImage();
			
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
		public void actionPerformed(ActionEvent e){
			win.change("variable_test1Answer1");
		}
	}
	
	//reset
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");
		}
	}
	
	
	class Answer implements ActionListener{
	   @Override
		 public void actionPerformed(ActionEvent e){
		 System.out.println(e.getActionCommand());
			 String str = answerField.getText();
			 str = str.trim();
			 System.out.println(str);
			            
			       
			 if(str.equals("O,X,X,O,X,X")){
				 JOptionPane.showMessageDialog(null,"정답입니다.");
				 win.change("variable_test2Answer20");
			 } else {
				 JOptionPane.showMessageDialog(null,"틀렸습니다.");
				 win.change("variable_test1");
			 }
			           
			            
	   	}	  
	}
	
	
}
