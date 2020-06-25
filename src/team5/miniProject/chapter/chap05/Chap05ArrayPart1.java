package team5.miniProject.chapter.chap05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;

public class Chap05ArrayPart1 extends JPanel {
	JFrame f = new JFrame();
	private PanelChange win;
	private JTextArea textField;
	Image imageMain;

	private JButton reset; //����
	private JButton next; // >
	private JButton last; // >>
	private JButton back; // <
	private JButton start; // <<


	public Chap05ArrayPart1(PanelChange win) {
		this.win = win;
		setLayout(null);


		next= new JButton();
		next.setSize(20,20);
		next.setLocation(210,610);
		next.addActionListener(new Next());

		back = new JButton();
		back.setSize(20,20);
		back.setLocation(170,610);
		back.addActionListener(new Back());

		last= new JButton();
		last.setSize(20,20);
		last.setLocation(235,610);
		last.addActionListener(new Last());

		start= new JButton();
		start.setSize(20,20);
		start.setLocation(150,610);
		start.addActionListener(new Start());

		reset = new JButton();
		reset.setSize(20,20);
		reset.setLocation(115,610);
		reset.addActionListener(new Reset());



		imageMain = new ImageIcon("images/Array1.PNG").getImage();

		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		this.add(next);

		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		this.add(back);

		last.setBorderPainted(true);
		last.setFocusPainted(false);
		last.setContentAreaFilled(true);
		this.add(last);

		start.setBorderPainted(false);
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);
		this.add(start);

		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		this.add(reset);

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


	class Next implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("array_part2");

		}
	}


	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("array_main");
		}
	}

	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("array_part6"); //panel9가 어딘지 윤창에게 물어보기, 임의대로 수정
		}
	}
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("array_main");
		}
	}
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");
		}
	}
}
