package team5.miniProject.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import team5.miniProject.run.PanelChange;


public class MiniQuiz1 extends JPanel {
	
	Image image;
	private PanelChange win;
	private JTextField quiz;
	private JTextField answer;
	private JButton check;
	private JButton reset; //list
	
	int lifeRemaining = 5;
	int dap = 4;

	public MiniQuiz1 (PanelChange win){
		
		setLayout(null);
		this.win = win;

		//문제 필드
		quiz = new JTextField();
		quiz.setBounds(75, 107, 230, 180);
		quiz.setText("Quiz. Int형의 크기는?");
		quiz.setHorizontalAlignment(SwingConstants.CENTER);
		quiz.setFont(new Font("굴림", Font.PLAIN, 20));
		quiz.setColumns(100);
		add(quiz);
				
		//답안 필드
		answer = new JTextField();
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("굴림", Font.PLAIN, 40));
		answer.setBounds(75, 325, 230, 40);
		answer.setColumns(10);
		add(answer);
		
		JLabel info = new JLabel("Good Luck!");
		info.setForeground(Color.BLUE);
		info.setFont(new Font("Tahoma", Font.PLAIN, 42));
		info.setHorizontalAlignment(SwingConstants.CENTER);
		info.setBounds(75, 500, 240, 60);
		add(info);
				

		//Life
		JLabel life = new JLabel("Life : " + lifeRemaining);
		life.setBounds(0, 15, 180, 43);
		life.setForeground(Color.BLUE);
		life.setFont(new Font("굴림", Font.PLAIN, 40));
		add(life);
		
		//정답 확인 버튼
		check = new JButton("check");
		check.setBounds(200, 250, 230, 40);
		check.setHorizontalAlignment(SwingConstants.CENTER);
		check.setFont(new Font("굴림", Font.PLAIN, 40));
		add(check);
		
		//check버튼 클릭 시 실행되는 이벤트
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//text필드에 받은 String타입을 Int형으로 변경하여 값 저장
				int ans = Integer.parseInt(answer.getText()); 
				
				
				//life가 0이 되면 아래 구문 실행되지 않게 return
				if(lifeRemaining < 0) {
					info.setText("You lost");
						
						
						return;
					}
					if(ans == dap){
						JOptionPane.showMessageDialog(null, "You Right", "JAVA Game", JOptionPane.WARNING_MESSAGE);
						
						//win.change(mode);
						System.exit(0);
					}
					
					life.setText("Life : " + --lifeRemaining);
					info.setForeground(Color.RED);
					info.setText("Try Again");
						
				}
			});

		
		
		
	}
	
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	

	//
//	class mode implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e){
//			win.change("mode");
//		}
//	}
//	
	
}
