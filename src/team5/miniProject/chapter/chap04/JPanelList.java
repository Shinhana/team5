package team5.miniProject.chapter.chap04;
import team5.miniProject.run.PanelChange;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelList extends JPanel{
	Image image;
	private JPanelTest win;
	private JButton jButton1;
	
	public JPanelList(JPanelTest win) {
		setLayout(null);
		this.win=win;
		
		
//		Image mainIg = new ImageIcon("images/JP_Mainlist.png").getImage().getScaledInstance(360, 640, 0);
//		
//		jButton1 = new JButton (new ImageIcon(mainIg));
//		jButton1.setSize(360, 640);
//		jButton1.setBorderPainted(true);
//		jButton1.setFocusPainted(true);
//	//	btn.setContentAreaFilled(true);
//		jButton1.setContentAreaFilled(true);
//		add(jButton1);
//		
//		
//		
//		JButton btn = new JButton("버튼");
//		btn.setSize(70,20);
//		btn.setLocation(10,10);
//		btn.setBorderPainted(true);
//		btn.setFocusPainted(true);
//		btn.setContentAreaFilled(true);
//		add(btn);
//		btn.addActionListener(new MyActionListener3());
//		
//		JButton btn2 = new JButton("다음장");
//		btn2.setSize(70,20);
//		btn2.setLocation(50,10);
//		btn2.setBorderPainted(true);
//		btn2.setFocusPainted(true);
//		btn2.setContentAreaFilled(true);
//		add(btn2);
//		btn2.addActionListener(new MyActionListener2());
//		
//		//여기다가 버튼을 7개목록만큼 추가해야함
//		
//
//		
//		
//		
//		
//	}
//	
//	
//	@Override 
//	public void paint(Graphics g){
//		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
//		setOpaque(false);//투명하게
//		super.paint(g);
//	}
//	
//	class MyActionListener3 implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e){
//			win.change("panel01");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
//			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
//		}
//	}
//	class MyActionListener2 implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e){
//			win.change("panel02");  //자바 환경구축 ->헬로우, 바보 -> 아이디,암호
//			//win.change("panel02"); // 자바 환경구축->헬로우 ,바보 
//		}
//		
//		
//	}
	
}
