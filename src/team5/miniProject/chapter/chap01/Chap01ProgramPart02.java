package team5.miniProject.chapter.chap01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;




public class Chap01ProgramPart02 extends JPanel{
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	//�ڹ� ȯ�汸�� chapter 1-2
	public Chap01ProgramPart02(PanelChange win) {
		setLayout(null);
		this.win=win;
		// TODO Auto-generated constructor stub
		image = new ImageIcon("images/chapter 1-2.png").getImage();
		
		
		JButton reset = new JButton("ó��");
		reset.setSize(20,20);
		reset.setBorderPainted(false); //�׵θ� ������
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);//���� �� ǥ�õ�
		reset.setLocation(115,620);
		add(reset);
		reset.addActionListener(new Reset());
		
		
		JButton next = new JButton("������");
		next.setSize(20,20);
		next.setLocation(203,620);
		next.setBorderPainted(false); //�׵θ� ������
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(next);
		next.addActionListener(new Next());
		
		
		JButton back = new JButton("����");
		back.setSize(20,20);
		back.setLocation(170,620);
		back.setBorderPainted(false); //�׵θ� ������
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(back);
		back.addActionListener(new Back());
		
		
		JButton start = new JButton("ó��");
		start.setSize(20,20);
		start.setLocation(150,620);
		start.setBorderPainted(false); //�׵θ� ������
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(start);
		start.addActionListener(new Back());
		
		JButton last = new JButton("�� �ڷ�");
		last.setSize(20,20);
		last.setBorderPainted(false); //�׵θ� ������
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);//���� �� ǥ�õ�
		last.setLocation(230,615);
		add(last);
		last.addActionListener(new Last());
		
	
		//�޸� �ؽ�Ʈ ���� ����
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
		setOpaque(false);//�����ϰ�
		super.paint(g);
	}
	
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
	
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part3");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
	
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part1");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part7");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
}
