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

	

public class Chap01ProgramPart05 extends JPanel{
	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public Chap01ProgramPart05(PanelChange win) {
		setLayout(null);
		this.win=win;
		// 배경 이미지 불러오기
		image = new ImageIcon("images/chapter 1-2-2.png").getImage();
		
		JButton reset = new JButton("초기화");
		reset.setSize(20,20);
		reset.setLocation(115,615);
		reset.setBorderPainted(false); //테두리 페인팅
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);//누를 때 표시됨
		add(reset);
		reset.addActionListener(new Reset());
		
		JButton next = new JButton("다음장");
		next.setSize(20,20);
		next.setLocation(205,615);
		next.setBorderPainted(false); //테두리 페인팅
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);//누를 때 표시됨
		add(next);
		next.addActionListener(new Next());
		
		
		JButton back = new JButton("이전");
		back.setSize(20,20);
		back.setLocation(170,615);
		back.setBorderPainted(false); //테두리 페인팅
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);//누를 때 표시됨
		add(back);
		back.addActionListener(new Back());
		
		
		JButton start = new JButton("처음");
		start.setSize(20,20);
		start.setLocation(150,615);
		start.setBorderPainted(false); //테두리 페인팅
		start.setFocusPainted(false);
		start.setContentAreaFilled(false);//누를 때 표시됨
		add(start);
		start.addActionListener(new Start());
		
		
		JButton last = new JButton("마지막");
		last.setSize(20,20);
		last.setLocation(170,620);
		last.setBorderPainted(false); //테두리 페인팅
		last.setFocusPainted(false);
		last.setContentAreaFilled(false);//누를 때 표시됨
		add(last);
		last.addActionListener(new Last());
		
		
		//메모 텍스트 공간 설정
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	
		add(memoTextField);
	}
	
	//배경 이미지 불러오는 paint 메소드
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	
	//처음으로 되돌아가는 버튼 클릭하면 수행되는 메소드
	class Reset implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}
	}
	//다음장으로 가는 버튼 클릭하면 수행되는 메소드
	class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part6");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}	
	}
	
	class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part4");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}	
	}
	
	class Start implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part1");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}	
	}
	
	class Last implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part7");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}	
	}
	
	
}
