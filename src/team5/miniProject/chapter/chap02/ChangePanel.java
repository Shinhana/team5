package miniProject.chapter.chap02;

import javax.swing.JFrame;

import miniProject.chapter.chap02.quiz.Chap02Quiz1;
import miniProject.chapter.chap02.test.Chap02Test1;

public class ChangePanel extends JFrame {
	
	public Chap02VariableList list = null;
	public Chap02VariablePart1 var1 = null;
	public Chap02VariablePart2 var2 = null;
	public Chap02VariablePart3 var3 = null;
	public Chap02VariablePart4 var4 = null;
	public Chap02VariablePart5 var5 = null;
	public Chap02Quiz1 quiz1 = null;
	public Chap02Test1 test1 = null;
	
	public ChangePanel() {}
	
	public void change(String panelName){ 
		
		if(panelName.equals("var1")) {
			getContentPane().removeAll();
			getContentPane().add(var1);
			revalidate();
			repaint();
		} else if(panelName.equals("var2")) {
			getContentPane().removeAll();
			getContentPane().add(var2);
			revalidate();
			repaint();
		} else if(panelName.equals("var3")){
			getContentPane().removeAll();
			getContentPane().add(var3);
			revalidate();
			repaint();
			
		} else if(panelName.equals("var4")){
			getContentPane().removeAll();
			getContentPane().add(var4);
			revalidate();
			repaint();
			
		}  else if(panelName.equals("var5")){
			getContentPane().removeAll();
			getContentPane().add(var5);
			revalidate();
			repaint();			
		} else if(panelName.equals("quiz1")){
			getContentPane().removeAll();
			getContentPane().add(quiz1);
			revalidate();
			repaint();			
		}  else if(panelName.equals("test1")){
			getContentPane().removeAll();
			getContentPane().add(test1);
			revalidate();
			repaint();			
		} else if(panelName.equals("list")){
			getContentPane().removeAll();
			getContentPane().add(list);
			revalidate();
			repaint();			
		}
	
	}

	public static void main(String[] args){
		
		ChangePanel ch = new ChangePanel();

		ch.setSize(380,680);
		ch.setResizable(false); //창 크기 변경 불가
		ch.setLocationRelativeTo(null);
//		f.getContentPane().setBackground(Color.BLACK);
		
		
		ch.setTitle("Java를 JOB아라");
		ch.list = new Chap02VariableList(ch);
		ch.var1 = new Chap02VariablePart1(ch);
		ch.var2 = new Chap02VariablePart2(ch);
		ch.var3 = new Chap02VariablePart3(ch);
		ch.var4 = new Chap02VariablePart4(ch);
		ch.var5 = new Chap02VariablePart5(ch);
//		ch.quiz1 = new Chap02Quiz1(ch);
//		ch.test1 = new Chap02Test1(ch);
		
		ch.add(ch.list);
		
		ch.setVisible(true);
		ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}






















