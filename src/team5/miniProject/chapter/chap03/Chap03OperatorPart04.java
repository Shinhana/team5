package team5.miniProject.chapter.chap03;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;

public class Chap03OperatorPart04 extends JPanel{

	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public Chap03OperatorPart04(PanelChange win){
		
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/Operator_Part4.png").getImage();
		
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
		
		JButton start = new JButton("맨 앞으로");
		start.setSize(20,20);
		start.setBorderPainted(false); //테두리 페인팅
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);//누를 때 표시됨
		start.setLocation(150,615);
		add(start);
		start.addActionListener(new Start());
		
		JButton back = new JButton("이전");
		back.setSize(20,20);
		back.setLocation(170,615);
		back.setBorderPainted(false); //테두리 페인팅
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);//누를 때 표시됨
		add(back);
		back.addActionListener(new Back());
		
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
				win.change("operator_part5");
			}
		}
		
		class Back implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("operator_part3");
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
				win.change("operator_part5");
			}
		}
}
