package team5.miniProject.menu;

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
// <<<<<<< 20200624_chap03_1_(김재민)
// import team5.miniProject.chapter.chap03.Chap03OperatorMain;
// =======
// >>>>>>> master



public class PanelList extends JPanel{

	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public PanelList(PanelChange win){
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/List.png").getImage();
	
		 //ó������ ���ư��� ��ư
		JButton program = new JButton("���α׷� ����&����ȯ�� ����");
		program.setSize(240,30);
		program.setBorderPainted(false); //�׵θ� ������
		program.setFocusPainted(false);
		program.setContentAreaFilled(true);//���� �� ǥ�õ�
		program.setLocation(70,60);
	
		add(program);
		program.addActionListener(new Program());
		
		JButton variable = new JButton("����");
		variable.setSize(240,30);
		variable.setBorderPainted(false); //�׵θ� ������
		variable.setFocusPainted(false);
		variable.setContentAreaFilled(true);//���� �� ǥ�õ�
		variable.setLocation(70,150);
		add(variable);
		//variable.addActionListener(new Variable());
		
		JButton operator = new JButton("������");
		operator.setSize(240,30);
		operator.setBorderPainted(false); //�׵θ� ������
		operator.setFocusPainted(false);
		operator.setContentAreaFilled(true);//���� �� ǥ�õ�
		operator.setLocation(70,240);
		add(operator);
		operator.addActionListener(new Operator());
		
		JButton array = new JButton("�迭");
		array.setSize(240,30);
		array.setBorderPainted(false); //�׵θ� ������
		array.setFocusPainted(false);
		array.setContentAreaFilled(true);//���� �� ǥ�õ�
		array.setLocation(70,430);
		add(array);
		array.addActionListener(new Array());
		
		JButton nloop = new JButton("��ø�ݺ���");
		nloop.setSize(240,30);
		nloop.setBorderPainted(false); //�׵θ� ������
		nloop.setFocusPainted(false);
		nloop.setContentAreaFilled(true);//���� �� ǥ�õ�
		nloop.setLocation(70,520);
		add(nloop);
		nloop.addActionListener(new Nloop());
		
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
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
	
	class Program implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part1");
		}
}
	
	class Operator implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("operator_part1");
		}
}	
	class Array implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		win.change("array_main");
	}
}
	class Nloop implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		win.change("nloop_main");
	}
}	
	
	
}
