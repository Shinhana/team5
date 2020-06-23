package miniProject.chapter.chap02;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import miniProject.chapter.chap02.Chap02VariablePart1.MyActionListener;

public class Chap02VariableList extends JPanel {
	
	private ChangePanel ch;
	private JButton study;
	private JButton quiz;
	private JButton test;
	Image imageMain;
	
	public Chap02VariableList() {}

	public Chap02VariableList(ChangePanel ch) {
		
		this.ch = ch;
		setLayout(null);
		
	    Image studyImg = new ImageIcon("images/chap2Study.png").getImage().getScaledInstance(230, 83, 0);
	    study = new JButton(new ImageIcon(studyImg));
	    study.setSize(230,83);
	    study.setContentAreaFilled(false);
	    study.setLocation(75,70);
	    study.setBorderPainted(false);
	    study.setFocusPainted(false);
	    study.setContentAreaFilled(false);
	    study.addActionListener(new MyActionListener1());
		add(study);

	    Image quizImg = new ImageIcon("images/chap2Quiz.png").getImage().getScaledInstance(230, 83, 0);
	    quiz = new JButton(new ImageIcon(quizImg));
	    quiz.setSize(230,83);
	    quiz.setContentAreaFilled(false);
	    quiz.setLocation(75,210);
	    quiz.setBorderPainted(false);
	    quiz.setFocusPainted(false);
	    quiz.setContentAreaFilled(false);
	    quiz.addActionListener(new MyActionListener2());
		add(quiz);
		
		Image testImg = new ImageIcon("images/chap2Test.png").getImage().getScaledInstance(230, 83, 0);
		test = new JButton(new ImageIcon(testImg));
		test.setSize(230,83);
		test.setContentAreaFilled(false);
		test.setLocation(75,350);
		test.setBorderPainted(false);
		test.setFocusPainted(false);
		test.setContentAreaFilled(false);
		test.addActionListener(new MyActionListener3());
		add(test);
		
		imageMain = new ImageIcon("images/min.jpeg").getImage();
		
	}
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//투명하게
		super.paint(g);
	}
	
	//study
	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("var1");
			
		}
	}

	//quiz
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("quiz1");
			
		}
	}

	//test
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ch.change("test1");
			
		}
	}
	
}
