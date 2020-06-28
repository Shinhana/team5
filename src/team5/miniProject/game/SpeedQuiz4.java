package  team5.miniProject.game;


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



public class SpeedQuiz4 extends JPanel{

	
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public SpeedQuiz4(PanelChange win) {
		setLayout(null);
		this.win=win;
	
		image = new ImageIcon("images/speed3.png").getImage();
		
		JButton next = new JButton();
		next.setSize(75,25);
		next.setLocation(275,565);
		add(next);
		next.addActionListener(new Next());
		next .setBorderPainted(false);
		next .setFocusPainted(false);
		next .setContentAreaFilled(false);
		

		
		
		memoTextField =  new JTextArea();
	    memoTextField.setBounds(50,520,280,100);
	    memoTextField.setOpaque(false);
	    memoTextField.setForeground(Color.WHITE);
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
			if(str.equals("2")||str.equals("다양성")) {
				JOptionPane.showMessageDialog(null,"누군가 나타났다.");
				win.change("speedquizans");
			}else {
				JOptionPane.showMessageDialog(null,"틀렸습니다.   누군가 가까이 오는거같다 . .  ");
				win.change("speedquiz5"); 
			}
			
		
		}
	}
}