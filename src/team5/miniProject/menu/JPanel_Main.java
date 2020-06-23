package miniProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import miniProject.Run.PanelChange;
import miniProject.chapter.chap03.Chap03OperatorMain;

public class JPanel_Main extends JPanel{
		Image image;
		private PanelChange win;
	
	
	public JPanel_Main(PanelChange win) {
		setLayout(null);
		this.win=win;
		// TODO Auto-generated constructor stub
		image = new ImageIcon("images/main.png").getImage();
	
		JButton btn = new JButton();
		btn.setSize(100,180);
		btn.setLocation(250,600);
		
		
		//버튼 안보이게 숨김
		btn.setBackground(Color.WHITE);
		btn.setOpaque(false);
		btn.setBorderPainted(false); //테두리 페인팅
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(true);//누를 때 표시됨
		
		add(btn);
		btn.addActionListener(new MyActionListener3());
		
	}
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel_login");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
		}
	}
	
	
}
