package team5.miniProject.chapter.chap02;

import java.awt.Graphics;
import team5.miniProject.run.PanelChange;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Chap02VariableList extends JPanel {
	
	private PanelChange win;
	private JButton study;
	private JButton quiz;
	private JButton test;
	Image imageMain;
	
	public Chap02VariableList() {}

	public Chap02VariableList(PanelChange win) {
		
		this.win = win;
		setLayout(null);
		
	    Image studyImg = new ImageIcon("images/chap2Study.png").getImage().getScaledInstance(230, 83, 0);
	    study = new JButton(new ImageIcon(studyImg));
	    study.setSize(230,83);
	    study.setContentAreaFilled(false);
	    study.setLocation(75,70);
	    study.setBorderPainted(false);
	    study.setFocusPainted(false);
	    study.setContentAreaFilled(false);
	    study.addActionListener(new Study());
		add(study);

	    Image quizImg = new ImageIcon("images/chap2Quiz.png").getImage().getScaledInstance(230, 83, 0);
	    quiz = new JButton(new ImageIcon(quizImg));
	    quiz.setSize(230,83);
	    quiz.setContentAreaFilled(false);
	    quiz.setLocation(75,210);
	    quiz.setBorderPainted(false);
	    quiz.setFocusPainted(false);
	    quiz.setContentAreaFilled(false);
	    quiz.addActionListener(new Quiz());
		add(quiz);
		
		Image testImg = new ImageIcon("images/chap2Test.png").getImage().getScaledInstance(230, 83, 0);
		test = new JButton(new ImageIcon(testImg));
		test.setSize(230,83);
		test.setContentAreaFilled(false);
		test.setLocation(75,350);
		test.setBorderPainted(false);
		test.setFocusPainted(false);
		test.setContentAreaFilled(false);
		test.addActionListener(new Test());
		add(test);
		
		imageMain = new ImageIcon("images/min.png").getImage();
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	//study
	class Study implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("variable_part2 ");
			
		}
	}

	//quiz
	class Quiz implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("variable_quiz1 ");
			
		}
	}

	//test
	class Test implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("variable_test1 ");
			
		}
	}
	
}
