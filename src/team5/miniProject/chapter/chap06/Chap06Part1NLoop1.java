package team5.miniProject.chapter.chap06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;



public class Chap06Part1NLoop1 extends JPanel{
	private JPanel chap01;
	private JTextArea memoTextField;

	Image image;

	private JButton next;
	private JButton back;
	private JButton reset;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private PanelChange win;
	
	
	
	JFrame f = new JFrame();
	
//	 Image icon = new ImageIcon("C:\\Users\\hojong\\eclipse-workspace\\SoloProject\\src\\game\\practice\\img\\login.png").getImage().getScaledInstance(360,640,0);
//	 JLabel label = new JLabel(new ImageIcon(icon));
//	
//	 JPanel jp = new JPanel();
//	
	 
	public Chap06Part1NLoop1(PanelChange win){
		win.add(this);
		image = new ImageIcon("images/NL1.png").getImage();
		
		
	this.win=win;
	
	setLayout(null);
	
	//jp.add(label);
	
	//��ư 1���� (�ڹ�ȯ�� ����)
	next = new JButton();
	next.setSize(20,20);
//	jButton1.setBorderPainted(true);
//	jButton1.setFocusPainted(false);
	next.setContentAreaFilled(false);
//	jButton1.setIcon(new ImageIcon("C:\\Users\\hojong\\eclipse-workspace\\SoloProject\\src\\game\\practice\\img\\Group88.png"));
	next.setLocation(205,615);
	add(next);
	next .setBorderPainted(false);
	next .setFocusPainted(false);
	
		
	
//	jTextArea1 = new JTextArea();
	
	//��ư �� �ؽ�Ʈ ���� ��ü ���� 
//	jScrollPane1 = new JScrollPane(jTextArea1);
//	jScrollPane1.setSize(200,150);
//	jScrollPane1.setLocation(10,40);
//	add(jScrollPane1);
	
	back = new JButton();
	back.setSize(20,20);
	back.setLocation(170,615);
	back.setContentAreaFilled(false);
	add(back);
	back .setBorderPainted(false);
	back .setFocusPainted(false);
	
	
	
	reset = new JButton();
	reset.setSize(20,20);
	reset.setLocation(115,615);
	reset.setContentAreaFilled(false);
	add(reset);
	reset .setBorderPainted(false);
	reset .setFocusPainted(false);

	
	next.addActionListener(new Next());
	back.addActionListener(new Back());
	reset.addActionListener(new Reset());
	
	JButton last = new JButton();
	last.setSize(20,20);
	last.setLocation(230,615);
	add(last);
	last.addActionListener(new Last());
	last .setBorderPainted(false);
	last .setFocusPainted(false);
	last .setContentAreaFilled(false);
	

	memoTextField =  new JTextArea();
    memoTextField.setBounds(50,520,280,100);
    memoTextField.setOpaque(false);
    memoTextField.setForeground(Color.WHITE);
    memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
 
    add(memoTextField);
	
	
	}

		@Override
		public void paint(Graphics g){
			g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
			setOpaque(false);//�����ϰ�
			super.paint(g);
		}
	
	//' > ' Ŭ������ �� �Ѿ�� Ŭ���� �������̵�
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("nloop_part2");
		}
	}
	//'<' Ŭ������ �� �Ѿ�� Ŭ���� �������̵�
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("nloop_main"); // �ڷΰ���(����ȭ������)
		}
	}
	//������ Ŭ������ �� �Ѿ�� Ŭ���� �������̵�
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");//
		}
	}
	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("nloop_part4");//
		}
	
	}

}


