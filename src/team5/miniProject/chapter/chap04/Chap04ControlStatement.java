package team5.miniProject.chapter.chap04;
import team5.miniProject.run.PanelChange;
import java.awt.Color;
import java.awt.Graphics;
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
	private PanelChange win;
	Image image;

	JFrame f = new JFrame();


	public Chap04ControlStatement(PanelChange win){

		//JFrame f = new JFrame();
	//	System.out.println(f.getContentPane());
		//this.setBackground(Color.BLACK);

		image = new ImageIcon("images/control_main.png").getImage();
		this.win=win;
		setLayout(null);

		//Image images1 = new ImageIcon("images/JP_ifmainButton.png").getImage().getScaledInstance(282, 83, 0);
		//jp.add(label);

	
		JButton conditional= new JButton();
		conditional.setSize(282,83);
		conditional.setContentAreaFilled(false);
		conditional.setBorderPainted(false); //�׵θ� ������
		conditional.setFocusPainted(false);	
		conditional.setLocation(39,102);
		add(conditional);

	
		JButton loop= new JButton();
		loop.setSize(282,83);
		loop.setContentAreaFilled(false);
		loop.setBorderPainted(false); //�׵θ� ������
		loop.setFocusPainted(false);	
		loop.setLocation(39,278);
		add(loop);

		//Image images3 = new ImageIcon("images/JP_continuemainButton.png").getImage().getScaledInstance(282, 83, 0);


		JButton branch= new JButton();
		branch.setSize(282,83);
		branch.setContentAreaFilled(false);
		branch.setBorderPainted(false); //�׵θ� ������
		branch.setFocusPainted(false);	
		branch.setLocation(39,455);
		add(branch);

		//1번째 버튼 눌렀을 때 실행 (1)
		conditional.addActionListener(new Conditional());
		//2번째 버튼 눌렀을 때 실행 (2)
		loop.addActionListener(new Loop());
		//3번째 버튼 눌렸을 때 실행 (3)
		branch.addActionListener(new Branch());

	}
	//'자바 환경 구축' 클릭했을 때 넘어가는 클래스 오버라이딩 (1) 자바 환경 구축->헬로우,바보->아이디,암호
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
		
		
	}

	class Conditional implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("conditional_part1");
			//win.change("panel02");
		}
	}
	//'java 설치' 클릭했을 때 넘어가는 클래스 오버라이딩 (2)
	class Loop implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("loop_part1"); // 헬로우 암호 창 나오게됨 현재 JPanel03로 가고있음
		}
	}
	//'이클립스'를 클릭했을 때 넘어가는 클래스 오버라이딩 (3)
	class Branch implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("branch_part1");//헬로우,바보 창 나오게됨  현재 JPanel03로 가고있음
		}
	}

}


