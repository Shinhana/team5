package team5.miniProject.chapter.chap06.quiz;

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


public class Chap06Quiz2 extends JPanel{

	
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public Chap06Quiz2(PanelChange win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/7.png").getImage();
		
		JButton next = new JButton();
		next.setSize(75,25);
		next.setLocation(285,570);
		add(next);
		next.addActionListener(new Next());
		next .setBorderPainted(false);
		next .setFocusPainted(false);
		next .setContentAreaFilled(false);
		
//		JButton back = new JButton();
//		back.setSize(75,25);
//		back.setLocation(290,570);
//		add(back);
//		back.addActionListener(new MyActionListener2());
//		back .setBorderPainted(false);
//		back .setFocusPainted(false);
//		back .setContentAreaFilled(false);
//		
		
		
		
		memoTextField =  new JTextArea();
	    memoTextField.setBounds(50,520,280,100);
	    memoTextField.setOpaque(false);
	    memoTextField.setForeground(Color.BLACK);
	    memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	 
	    add(memoTextField);
		
		
		
	}
	
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			String str = memoTextField.getText();
			if(str.contentEquals("7")) {
				JOptionPane.showMessageDialog(null,"정답입니다.");
				win.change("darray_quiz2Answer1");
			}else {
				JOptionPane.showMessageDialog(null,"틀렸습니다.");
				win.change("darray_quiz2Answer2"); 
			}
			
		
		}
	}
}
//class MyActionListener2 implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e){
//		win.change("mun22"); 
//		
//	}
//
//}
//
//}


