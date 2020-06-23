package miniProject.chapter.chap02.quiz;

import javax.swing.JFrame;

public class ChangePanel extends JFrame {
	
	public Chap02Quiz1 quiz1 = null;
	public Chap02Quiz2 quiz2 = null;
	public Chap02Quiz10Ans ans10 = null;
	public Chap02Quiz11Ans ans11 = null;
	public Chap02Quiz20Ans ans20 = null;
	
	public ChangePanel() {}
	
	public void change(String quizName){ 
		
		if(quizName.equals("quiz1")) {
			getContentPane().removeAll();
			getContentPane().add(quiz1);
			revalidate();
			repaint();
		} else if(quizName.equals("quiz2")) {
			getContentPane().removeAll();
			getContentPane().add(quiz2);
			revalidate();
			repaint();
		} else if(quizName.equals("operator_quizAnswer1")) {
			getContentPane().removeAll();
			getContentPane().add(ans10);
			revalidate();
			repaint();
		} else if(quizName.equals("ans11")) {
			getContentPane().removeAll();
			getContentPane().add(ans11);
			revalidate();
			repaint();
		} else if(quizName.equals("operator_quizAnswer2")) {
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
		ch.quiz1 = new Chap02Quiz1(ch);
		ch.quiz2 = new Chap02Quiz2(ch);
		ch.ans10 = new Chap02Quiz10Ans(ch);
		ch.ans11 = new Chap02Quiz11Ans(ch);
		ch.ans20 = new Chap02Quiz20Ans(ch);
		
		ch.add(ch.quiz1);
		
		ch.setVisible(true);
		ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
