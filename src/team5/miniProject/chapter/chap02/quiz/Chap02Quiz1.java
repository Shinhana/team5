package team5.miniProject.chapter.chap02.quiz;

import java.awt.Color;
import team5.miniProject.run.PanelChange;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.chapter.chap02.PanelChange;

public class Chap02Quiz1 extends JPanel {

	private PanelChange win;
	Image imageMain;
	
	private JButton reset; //목차
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton check; // 정답확인 버튼
	private JTextArea answerField; //정답란

	
	public Chap02Quiz1(PanelChange win) {
		
		this.win = win;
		setLayout(null);
		
		ImageIcon nextImg = new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(206,606);
		next.addActionListener(new Next());
		//버튼 투명하게 아래 3줄
		next.setBorderPainted(true);
		next.setFocusPainted(false);
	    next.setContentAreaFilled(true);
	    this.add(next);
	    
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
	    check.setLocation(248,489);
	    check.addActionListener(new Answer());
		//버튼 투명하게 아래 3줄
	    check.setBorderPainted(false);
	    check.setFocusPainted(false);
	    check.setContentAreaFilled(false);
	    this.add(check);
		
	   
	    answerField = new JTextArea();
	    answerField.setBounds(50,520,280,100);
	    answerField.setOpaque(false);
	    answerField.setForeground(Color.WHITE);
	    answerField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    add(answerField);
		
	    imageMain = new ImageIcon("images/chap2Quiz1.png").getImage();
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	
	//next
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("quiz2");
			
		}
	}
	
	//reset
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("list");
		}
	}
	
	class Answer implements ActionListener{
	   @Override
	   public void actionPerformed(ActionEvent e){
		   System.out.println(e.getActionCommand());
	       String str = answerField.getText();
	       str = str.trim();
	       System.out.println(str);
	            
	       
	       if(str.equals("O,X,X,O,X,O,X")){
	    	   JOptionPane.showMessageDialog(null,"정답입니다");
	    	   win.change("operator_quizAnswer1");
	       } else {
	    	   JOptionPane.showMessageDialog(null,"틀렸습니다.");
	    	   win.change("quiz1");
	       }
	           
	            
	   }
	}
	

}
