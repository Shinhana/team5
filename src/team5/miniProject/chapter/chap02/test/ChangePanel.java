package miniProject.chapter.chap02.test;

import javax.swing.JFrame;

import miniProject.chapter.chap02.quiz.Chap02Quiz1;
import miniProject.chapter.chap02.quiz.Chap02Quiz10Ans;
import miniProject.chapter.chap02.quiz.Chap02Quiz11Ans;
import miniProject.chapter.chap02.quiz.Chap02Quiz2;
import miniProject.chapter.chap02.quiz.Chap02Quiz20Ans;

public class ChangePanel extends JFrame {
	
	public Chap02Test1 test1 = null;
	public Chap02Test2 test2 = null;
	public Chap02Test1Ans ans1 = null;
	public Chap02Test20Ans ans20 = null;
	public Chap02Test21Ans ans21 = null;
	
	public ChangePanel() {}
	
	public void change(String panelName){ 
		
		if(panelName.equals("test1")) {
			getContentPane().removeAll();
			getContentPane().add(test1);
			revalidate();
			repaint();
		} else if(panelName.equals("test2")) {
			getContentPane().removeAll();
			getContentPane().add(test2);
			revalidate();
			repaint();
		} else if(panelName.equals("operator_testAnswer1")){
			getContentPane().removeAll();
			getContentPane().add(ans1);
			revalidate();
			repaint();
			
		} else if(panelName.equals("operator_testAnswer2")){
			getContentPane().removeAll();
			getContentPane().add(ans20);
			revalidate();
			repaint();
			
		}
	
	}

	public static void main(String[] args) {

		ChangePanel ch = new ChangePanel();

		ch.setSize(380,680);
//		ch.setLocationRelativeTo(null);
		
		
		ch.setTitle("Java¸¦ JOB¾Æ¶ó");
		ch.test1 = new Chap02Test1(ch);
		ch.test2 = new Chap02Test2(ch);
		ch.ans1 = new Chap02Test1Ans(ch);
//		ch.ans20 = new Chap02Quiz20Ans(ch);
//		ch.ans21 = new Chap02Quiz21Ans(ch);
		
		
		ch.add(ch.test1);
		
		ch.setVisible(true);
		ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
