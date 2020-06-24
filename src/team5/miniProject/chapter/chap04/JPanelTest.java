package team5.miniProject.chapter.chap04;
import team5.miniProject.run.PanelChange;
import java.awt.Color;

import javax.swing.JFrame;

import team5.miniProject.chapter.chap04.quiz.Chap04Quiz1;
import team5.miniProject.chapter.chap04.quiz.Chap04Quiz1Ans;
import team5.miniProject.chapter.chap04.quiz.Chap04Quiz2;
import team5.miniProject.chapter.chap04.test.Chap04Test1;
import team5.miniProject.chapter.chap04.test.Chap04Test1Ans1;
import team5.miniProject.chapter.chap04.test.Chap04Test1Ans2;
import team5.miniProject.chapter.chap04.test.Chap04Test2;
import team5.miniProject.chapter.chap04.test.Chap04Test2Ans;
public class JPanelTest extends JFrame{
	
	public Chap04ControlStatement Chap04ControlStatement = null;
	public Chap04ConditionalPart1 Chap04ConditionalPart1= null;
	public Chap04ConditionalPart2 Chap04ConditionalPart2 = null;
	public Chap04LoopPart1 Chap04LoopPart1 = null;
	public Chap04LoopPart2 Chap04LoopPart2 = null;
	public Chap04BranchPart1 Chap04BranchPart1 = null;
	public JPanelList jpanelList = null;
	public Chap04QuizTime Chap04QuizTime = null;
	public Chap04Quiz1 Chap04Quiz1 = null;
	public Chap04Quiz2 Chap04Quiz2 = null;
	public Chap04Quiz1Ans Chap04Quiz1Ans = null;
	public Chap04Test1 Chap04Test1 = null;
	
	public Chap04Test2 Chap04Test2 = null;
	public Chap04Test1Ans1 Chap04Test1Ans1 = null;
	public Chap04Test1Ans2 Chap04Test1Ans2 = null;
	public Chap04Test2Ans Chap04Test2Ans = null;
	
	
	
	public void change(String panelName){  //패널 1번과 2번 변경 후 재설정
		
		
		//첫화면에서 선택과 관련된 구문 panel01을 클릭했을때 -> jpanel03로 가게됨
		if(panelName.equals("Chap04ControlStatement")){
			getContentPane().removeAll();
			getContentPane().add(Chap04ControlStatement);
			revalidate();
			repaint();
		}//첫화면에서 선택과 관련된 구문 panel01을 클릭했을때 -> jpanel02로 가게됨
		else if(panelName.equals("Chap04ConditionalPart1")){
			getContentPane().removeAll();
			getContentPane().add(Chap04ConditionalPart1);
			revalidate();
			repaint();
			
		}//첫화면에서 선택과 관련된 구문 panel01을 클릭했을때 -> jpanel02로 가게됨
		else if(panelName.equals("Chap04ConditionalPart2")){
			getContentPane().removeAll();
			getContentPane().add(Chap04ConditionalPart2);
			revalidate();
			repaint();
		}	
		else if(panelName.equals("Chap04LoopPart1")){
			getContentPane().removeAll();
			getContentPane().add(Chap04LoopPart1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04LoopPart2")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04LoopPart2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04BranchPart1")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04BranchPart1);
			revalidate();
			repaint();
		}
		
		else if(panelName.equals("jpanelList")){
			getContentPane().removeAll();
			getContentPane().add(jpanelList);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04QuizTime")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04QuizTime);
			revalidate();
			repaint();
			
		}
		else if(panelName.equals("Chap04Quiz1")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Quiz1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04Quiz2")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Quiz2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04Quiz1Ans")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Quiz1Ans);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04Test1")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Test1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04Test2")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Test2);
			revalidate();
			repaint();
			
		}
		else if(panelName.equals("Chap04Test1Ans1")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Test1Ans1);
			revalidate();
			repaint();
			
		}
		else if(panelName.equals("Chap04Test1Ans2")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Test1Ans2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("Chap04Test2Ans")) {
			getContentPane().removeAll();
			getContentPane().add(Chap04Test2Ans);
			revalidate();
			repaint();
		}
	}
	
	public static void main(String[]args){
		
		JPanelTest win = new JPanelTest();
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		
		
		win.setTitle("frame test");
		win.Chap04ControlStatement = new Chap04ControlStatement(win);
		win.Chap04ConditionalPart1 = new Chap04ConditionalPart1(win);
		win.Chap04ConditionalPart2 = new Chap04ConditionalPart2(win);//java설치
		win.Chap04LoopPart1 = new Chap04LoopPart1(win);
		win.Chap04LoopPart2 = new Chap04LoopPart2(win);
		win.Chap04BranchPart1 = new Chap04BranchPart1(win);
		win.Chap04ControlStatement  = new Chap04ControlStatement(win);
		win.Chap04QuizTime = new Chap04QuizTime(win);
		win.Chap04Quiz1 = new Chap04Quiz1(win);
		win.Chap04Quiz2 = new Chap04Quiz2(win);
		win.Chap04Quiz1Ans = new Chap04Quiz1Ans(win);
		win.Chap04Test1 = new Chap04Test1(win);
		win.Chap04Test2 = new Chap04Test2(win);
		win.Chap04Test1Ans1 = new Chap04Test1Ans1(win);
		win.Chap04Test1Ans2 = new Chap04Test1Ans2(win);
		win.Chap04Test2Ans = new Chap04Test2Ans(win);
		win.jpanelList = new JPanelList(win);
		
		win.add(win.Chap04ControlStatement);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setSize(380,680);
		win.setVisible(true);
	}
	
}
