package team5.miniProject.chapter.chap03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import miniProject.Run.PanelChange;



public class Chap03OperatorPart01 extends JPanel{
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	
	public Chap03OperatorPart01 (PanelChange win){
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/Operator_Part1.png").getImage();
	
		 //처음으로 돌아가는 버튼
		JButton reset = new JButton("목차로");
		reset.setSize(20,20);
		reset.setBorderPainted(false); //테두리 페인팅
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);//누를 때 표시됨
		reset.setLocation(115,615);
	
		add(reset);
		reset.addActionListener(new Reset());
		
		JButton next = new JButton("다음장");
		next.setSize(20,20);
		next.setBorderPainted(false); //테두리 페인팅
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);//누를 때 표시됨
		next.setLocation(205,615);
		add(next);
		next.addActionListener(new Next());
		
		JButton last = new JButton("맨 뒤로");
		last.setSize(20,20);
		last.setBorderPainted(false); //테두리 페인팅
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);//누를 때 표시됨
		last.setLocation(230,615);
		add(last);
		last.addActionListener(new Last());
		
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
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");
		}
}
class Next implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("operator_part2");
			}
		}
class Last implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("operator_quiz2");
			}
		}
}
