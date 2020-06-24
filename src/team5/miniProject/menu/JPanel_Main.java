package team5.miniProject.menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.run.PanelChange;
// <<<<<<< 20200624_chap03_1_(源��옱誘�)
// import team5.miniProject.chapter.chap03.Chap03OperatorMain;
// =======
// >>>>>>> master

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
		
		
		//占쏙옙튼 占싫븝옙占싱곤옙 占쏙옙占쏙옙
		btn.setBackground(Color.WHITE);
		btn.setOpaque(false);
		btn.setBorderPainted(false); //占쌓두몌옙 占쏙옙占쏙옙占쏙옙
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(true);//占쏙옙占쏙옙 占쏙옙 표占시듸옙
		
		add(btn);
		btn.addActionListener(new MyActionListener3());
		
	}
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//占쏙옙占쏙옙占싹곤옙
		super.paint(g);
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel_login");  //占쌘뱄옙 환占썸구占쏙옙 ->占쏙옙恝占�, 占쌕븝옙 -> 占쏙옙占싱듸옙,占쏙옙호
			//win.change("panel02"); // 占쌘뱄옙 환占썸구占쏙옙->占쏙옙恝占� ,占쌕븝옙 
		}
	}
	
	
}
