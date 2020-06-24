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
//JPanel ����� �޾ƾ���
public class Chap01ProgramPart07 extends JPanel{
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public Chap01ProgramPart07(PanelChange win) {
		setLayout(null);
		this.win=win;
		// ��� �̹��� �ҷ�����
		image = new ImageIcon("images/chapter 1-3-2.png").getImage();
		
		JButton reset = new JButton("�ʱ�ȭ");
		reset.setSize(20,20);
		reset.setLocation(115,620);
		reset.setBorderPainted(false); //�׵θ� ������
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(reset);
		reset.addActionListener(new Reset());
		
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
		start.addActionListener(new Start());
		
//		JButton last = new JButton("������");
//		last.setSize(20,20);
//		last.setLocation(170,620);
//		last.setBorderPainted(false); //�׵θ� ������
//		last.setFocusPainted(false);
//		last.setContentAreaFilled(false);//���� �� ǥ�õ�
//		add(last);
//		last.addActionListener(new Last());

		
		//�޸� �ؽ�Ʈ ���� ����
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(memoTextField);
		
	}
	
	//����̹����� ������ ���� �������̵� �޼ҵ�
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
	
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part6");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
		
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part1");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
	

	
}
