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
import team5.miniProject.chapter.chap03.Chap03OperatorMain;



public class PanelList extends JPanel{

	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public PanelList(PanelChange win){
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/List.png").getImage();
	
		 //처음으로 돌아가는 버튼
		JButton program = new JButton("프로그램 기초&개발환경 구축");
		program.setSize(240,30);
		program.setBorderPainted(false); //테두리 페인팅
		program.setFocusPainted(false);
		program.setContentAreaFilled(true);//누를 때 표시됨
		program.setLocation(70,60);
	
		add(program);
		program.addActionListener(new Program());
		
		JButton variable = new JButton("변수");
		variable.setSize(240,30);
		variable.setBorderPainted(false); //테두리 페인팅
		variable.setFocusPainted(false);
		variable.setContentAreaFilled(true);//누를 때 표시됨
		variable.setLocation(70,150);
		add(variable);
		//variable.addActionListener(new Variable());
		
		JButton operator = new JButton("연산자");
		operator.setSize(240,30);
		operator.setBorderPainted(false); //테두리 페인팅
		operator.setFocusPainted(false);
		operator.setContentAreaFilled(true);//누를 때 표시됨
		operator.setLocation(70,240);
		add(operator);
		operator.addActionListener(new Operator());
		
		JButton array = new JButton("배열");
		array.setSize(240,30);
		array.setBorderPainted(false); //테두리 페인팅
		array.setFocusPainted(false);
		array.setContentAreaFilled(true);//누를 때 표시됨
		array.setLocation(70,430);
		add(array);
		array.addActionListener(new Array());
		
		JButton nloop = new JButton("중첩반복문");
		nloop.setSize(240,30);
		nloop.setBorderPainted(false); //테두리 페인팅
		nloop.setFocusPainted(false);
		nloop.setContentAreaFilled(true);//누를 때 표시됨
		nloop.setLocation(70,520);
		add(nloop);
		nloop.addActionListener(new Nloop());
		
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		//테스트 공간 테두리 숨기기 
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(memoTextField);
	}
	
	
	
	
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
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
