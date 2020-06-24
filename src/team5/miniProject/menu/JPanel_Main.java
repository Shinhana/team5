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
// <<<<<<< 20200624_chap03_1_(김재민)
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
		
		
		//��ư �Ⱥ��̰� ����
		btn.setBackground(Color.WHITE);
		btn.setOpaque(false);
		btn.setBorderPainted(false); //�׵θ� ������
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(true);//���� �� ǥ�õ�
		
		add(btn);
		btn.addActionListener(new MyActionListener3());
		
	}
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//�����ϰ�
		super.paint(g);
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("jpanel_login");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
	
	
}
