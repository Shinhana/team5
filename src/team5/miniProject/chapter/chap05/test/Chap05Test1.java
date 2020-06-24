package team5.miniProject.chapter.chap05.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;

public class Chap05Test1 extends JPanel {
	JFrame f = new JFrame();
	private PanelChange win;
	private JTextArea textField;
	Image imageMain;

	private JButton reset; //����
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<
	

	public Chap05Test1(PanelChange win) {
		this.win = win;
		setLayout(null);

		next= new JButton();
		next.setSize(75,15);
		next.setLocation(215,585);
		next.addActionListener(new Next());

		back = new JButton();
		back.setSize(25,25);
		back.setLocation(10,35);
		back.addActionListener(new Back());

		imageMain = new ImageIcon("images/ArrayTest1.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);

		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);

		textField =  new JTextArea();
		textField.setBounds(50,550,230,50);
		textField.setOpaque(false);
		textField.setForeground(Color.black);
		//�׽�Ʈ ���� �׵θ� ����� 
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());	      
		add(textField);

	}

	@Override
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel19");
		}
	}

	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			String str = textField.getText();
			if(str.equals("for(int i = 0; i < carr1.length; i++) { carr2[i] = carr1[i] }")) {
				JOptionPane.showMessageDialog(null,"정답입니다.");
				win.change("panel14");
			}else {
				JOptionPane.showMessageDialog(null,"틀렸습니다.");
				win.change("panel14"); 
			}

		}
	}
}



