package team5.miniProject.chapter.chap04;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Chap04ControlStatement extends JPanel{



	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JPanelTest win;


	JFrame f = new JFrame();


	public Chap04ControlStatement(JPanelTest win){

		//JFrame f = new JFrame();
		System.out.println(f.getContentPane());
		this.setBackground(Color.BLACK);


		this.win=win;
		setLayout(null);

		Image images1 = new ImageIcon("images/loopmainButton.png").getImage().getScaledInstance(282, 83, 0);
		//jp.add(label);

		//버튼 1생성 (자바환경 구축)
		jButton1 = new JButton(new ImageIcon(images1));
		//	panel.add(label, "Center");

		//	jButton1 = new JButton(images1);
		jButton1.setSize(282,83);
		jButton1.setContentAreaFilled(false);
		jButton1.setLocation(39,102);
		add(jButton1);

		//	ImageIcon images2 = new ImageIcon("/Users/jess/Desktop/images/ifmainButton.png");
		Image images2 = new ImageIcon("images/ifmainButton.png").getImage().getScaledInstance(282, 83, 0);

		jButton2 = new JButton(new ImageIcon(images2));
		jButton2.setSize(282,83);
		jButton2.setContentAreaFilled(false);
		jButton2.setLocation(39,278);
		add(jButton2);

		Image images3 = new ImageIcon("images/continuemainButton.png").getImage().getScaledInstance(282, 83, 0);


		jButton3 = new JButton(new ImageIcon(images3));
		jButton3.setSize(282,83);
		jButton3.setContentAreaFilled(false);
		jButton3.setLocation(39,455);
		add(jButton3);

		//1번째 버튼 눌렀을 때 실행 (1)
		jButton1.addActionListener(new MyActionListener());
		//2번째 버튼 눌렀을 때 실행 (2)
		jButton2.addActionListener(new MyActionListener2());
		//3번째 버튼 눌렸을 때 실행 (3)
		jButton3.addActionListener(new MyActionListener3());

	}
	//'자바 환경 구축' 클릭했을 때 넘어가는 클래스 오버라이딩 (1) 자바 환경 구축->헬로우,바보->아이디,암호
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("Chap04ConditionalPart1");
			//win.change("panel02");
		}
	}
	//'java 설치' 클릭했을 때 넘어가는 클래스 오버라이딩 (2)
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("Chap04LoopPart1"); // 헬로우 암호 창 나오게됨 현재 JPanel03로 가고있음
		}
	}
	//'이클립스'를 클릭했을 때 넘어가는 클래스 오버라이딩 (3)
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("Chap04BranchPart1");//헬로우,바보 창 나오게됨  현재 JPanel03로 가고있음
		}
	}

}


