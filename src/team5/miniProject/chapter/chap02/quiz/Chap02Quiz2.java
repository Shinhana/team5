package miniProject.chapter.chap02.quiz;

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

public class Chap02Quiz2 extends JPanel {

	private ChangePanel ch;
	Image imageMain;
	
	private JButton reset; //����
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton check; // ����üũ
	private JTextArea answerField; //�����
	
	public Chap02Quiz2() {}
	
	public Chap02Quiz2(ChangePanel ch) {
		
		this.ch = ch;
		setLayout(null);
		
		ImageIcon backImg = new ImageIcon("images/back.png");
		back= new JButton(backImg);
		back.setSize(20,20);
		back.setLocation(174,611);
		back.addActionListener(new MyActionListener3());
		//��ư �����ϰ� 3��
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);

		ImageIcon checkImg = new ImageIcon("images/answerCheck.png");
		check= new JButton(checkImg);
		check.setSize(88,34);
		check.setLocation(255,415);
		check.addActionListener(new Answer());
		//��ư �����ϰ� �Ʒ� 3��
		check.setBorderPainted(false);
		check.setFocusPainted(false);
		check.setContentAreaFilled(false);
		this.add(check);
			
		
		
		answerField = new JTextArea();
		answerField.setBounds(50,450,280,100);
		answerField.setOpaque(false);
		answerField.setForeground(Color.WHITE);
		answerField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		add(answerField);
			
		imageMain = new ImageIcon("images/chapter2-mun2.png").getImage();
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//�����ϰ�
		super.paint(g);
	}
	
	//next
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("ans11");
			
		}
	}
		
	//back
	class MyActionListener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("quiz1");
				
		}
	}
		
	//checkAns
	class Answer implements ActionListener{
	   @Override
	   public void actionPerformed(ActionEvent e){
		   System.out.println(e.getActionCommand());
	       String str = answerField.getText();
	       str = str.trim();
	       System.out.println(str);
	            
	      
	       if(str.equals("byte,short,int,long\nfloat,double\ndouble")){
	    	   JOptionPane.showMessageDialog(null,"�����Դϴ�");
	    	   ch.change("operator_quizAnswer1");
	       } else {
	    	   JOptionPane.showMessageDialog(null,"Ʋ�Ƚ��ϴ�.");
	    	   ch.change("quiz2");
	       }
	           
	            
	   }
	}
	
	
	
}
