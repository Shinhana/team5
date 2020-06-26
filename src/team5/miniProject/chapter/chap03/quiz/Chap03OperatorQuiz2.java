package team5.miniProject.chapter.chap03.quiz;

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
import team5.miniProject.chapter.chap03.Chap03OperatorMain;



public class Chap03OperatorQuiz2 extends JPanel{

	
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	
	public Chap03OperatorQuiz2(PanelChange win){
		
		
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/Operator_Quiz2.png").getImage();
		
		JButton reset = new JButton("������");
		reset.setSize(20,20);
		reset.setBorderPainted(false); //�׵θ� ������
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);//���� �� ǥ�õ�
		reset.setLocation(115,615);
	
		add(reset);
		reset.addActionListener(new Reset());
		
		JButton next = new JButton("������");
		next.setSize(20,20);
		next.setBorderPainted(false); //�׵θ� ������
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);//���� �� ǥ�õ�
		next.setLocation(205,615);
		add(next);
		next.addActionListener(new Next());
		
		JButton last = new JButton("�� �ڷ�");
		last.setSize(20,20);
		last.setBorderPainted(false); //�׵θ� ������
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);//���� �� ǥ�õ�
		last.setLocation(230,615);
		add(last);
		last.addActionListener(new Last());
		
		JButton start = new JButton("�� ������");
		start.setSize(20,20);
		start.setBorderPainted(false); //�׵θ� ������
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);//���� �� ǥ�õ�
		start.setLocation(150,615);
		add(start);
		start.addActionListener(new Start());
		
		JButton back = new JButton("����");
		back.setSize(20,20);
		back.setLocation(170,615);
		back.setBorderPainted(false); //�׵θ� ������
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(back);
		back.addActionListener(new Back());
		
		JButton answer = new JButton("����Ȯ��");
		answer.setSize(40,20);
		answer.setLocation(160,585);
		answer.setBorderPainted(false); //�׵θ� ������
		answer.setFocusPainted(false);
		answer.setContentAreaFilled(false);//���� �� ǥ�õ�
		add(answer);
		answer.addActionListener(new Answer());
		
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,430,280,300);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		//�׽�Ʈ ���� �׵θ� ����� 
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
			win.change("panellist");
		}
	}
		class Next implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("operator_test1");
			}
		}
		
		class Back implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("operator_quiz1");
			}
		}
		
		class Start implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("operator_part1");
			}
		}
		
		class Last implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("operator_quiz2");
			}
		}
		
		class Answer implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println(e.getActionCommand());
				String str = memoTextField.getText();
				str = str.trim();
				System.out.println(str);
				if(str.equals("true\nfalse\nfalse\nfalse\ntrue\ntrue\nfalse\ntrue")){
					JOptionPane.showMessageDialog(null,"정답");
					
				}else{
					JOptionPane.showMessageDialog(null,"틀렸습니다");
				}
				win.change("operator_quizAnswer2");
				
			}
		}
}
