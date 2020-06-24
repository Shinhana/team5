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
import javax.swing.JTextField;

import team5.miniProject.run.PanelChange;



public class Chap01ProgramPart04 extends JPanel{
	private JTextField textField;
	private JTextArea memoTextField;
	private PanelChange win;
	Image image;
	public Chap01ProgramPart04(PanelChange win){
		
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/chapter 1-2-1.png").getImage();
//		JLabel lblLbl = new JLabel("��ο�");
//		lblLbl.setBounds(31,40,67,15);
//		add(lblLbl);
//
//		textField = new JTextField();
//		textField.setBounds(123,40,116,21);
//		add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblLbl_1  = new JLabel("�ٺ�");
//		lblLbl_1.setBounds(31,84,67,15);
//		add(lblLbl_1);
//		passwordField = new JPasswordField();
//		passwordField.setBounds(123,84,116,21);
//		add(passwordField);
		
		
		
		JButton reset = new JButton("�ʱ�ȭ");
		reset.setSize(20,20);
		reset.setLocation(115,620);
		reset.setBorderPainted(false); //�׵θ� ������
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(reset);
		reset.addActionListener(new Reset());
		
		JButton next = new JButton("������");
		next.setSize(20,20);
		next.setLocation(205,615);
		next.setBorderPainted(false); //�׵θ� ������
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(next);
		next.addActionListener(new Next());
		
		JButton back = new JButton("����");
		back.setSize(20,20);
		back.setLocation(170,615);
		back.setBorderPainted(false); //�׵θ� ������
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(back);
		back.addActionListener(new Back());
	
		JButton start = new JButton("ó��");
		start.setSize(20,20);
		start.setLocation(150,615);
		start.setBorderPainted(false); //�׵θ� ������
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(start);
		start.addActionListener(new Start());
	
		JButton last = new JButton("��");
		last.setSize(20,20);
		last.setLocation(230,615);
		last.setBorderPainted(false); //�׵θ� ������
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);//���� �� ǥ�õ�
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
			win.change("panelist");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
		
		class Next implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("program_part5");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
				//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
			}	
		}
		
		class Back implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("program_part3");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
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
		
		class Last implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("program_part7");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
				//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
			}	
		}
}

