package miniProject.chapter.chap02.test;

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


public class Chap02Test1 extends JPanel {
	
	private ChangePanel ch;
	Image imageMain;
	
	private JButton reset; //����
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	private JButton check; // ����Ȯ�� ��ư
	private JTextArea answerField; //�����
	
	public Chap02Test1() {}
	
	public Chap02Test1(ChangePanel ch) {

		this.ch = ch;
		setLayout(null);
		
		ImageIcon nextImg = new ImageIcon("images/next.png");
		next= new JButton(nextImg);
		next.setSize(20,20);
		next.setLocation(206,606);
		next.addActionListener(new MyActionListener());
		//��ư �����ϰ� �Ʒ� 3��
		next.setBorderPainted(false);
		next.setFocusPainted(false);
	    next.setContentAreaFilled(false);
	    this.add(next);
	    
	    ImageIcon checkImg = new ImageIcon("images/answerCheck.png");
	    check= new JButton(checkImg);
	    check.setSize(88,34);
	    check.setLocation(248,448);
	    check.addActionListener(new Answer());
		//��ư �����ϰ� �Ʒ� 3��
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
		
	    imageMain = new ImageIcon("images/chap2Level1.png").getImage();
		
		
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
			ch.change("quiz2");
			
		}
	}
	
	class Answer implements ActionListener{
		   @Override
		   public void actionPerformed(ActionEvent e){
			   System.out.println(e.getActionCommand());
		       String str = answerField.getText();
		       str = str.trim();
		       System.out.println(str);
		            
		       
		       if(str.equals("-124")){
		    	   JOptionPane.showMessageDialog(null,"�����Դϴ�");
		    	   ch.change("operator_testAnswer1");
		       } else {
		    	   JOptionPane.showMessageDialog(null,"Ʋ�Ƚ��ϴ�.");
		    	   ch.change("test1");
		       }
		           
		            
		   }
	}
	
	
	
	
}
