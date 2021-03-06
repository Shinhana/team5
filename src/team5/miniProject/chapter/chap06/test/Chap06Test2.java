package team5.miniProject.chapter.chap06.test;

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



public class Chap06Test2 extends JPanel{

	
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public Chap06Test2(PanelChange win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/heap.png").getImage();
		
		JButton next = new JButton();
		next.setSize(75,25);
		next.setLocation(285,570);
		add(next);
		next.addActionListener(new Next());
		next .setBorderPainted(false);
		next .setFocusPainted(false);
		next .setContentAreaFilled(false);
		

		
		
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
			if(str.equals("HEAP")||str.equals("heap")) {
				JOptionPane.showMessageDialog(null,"정답입니다.");
				win.change("darray_test2Answer1");
			}else {
				JOptionPane.showMessageDialog(null,"틀렸습니다.");
				win.change("darray_test2Answer2"); 
			}
			
		
		}
	}
}