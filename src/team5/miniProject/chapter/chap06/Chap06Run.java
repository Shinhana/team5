package team5.miniProject.chapter.chap06;

import javax.swing.JFrame;

import team5.miniProject.chapter.chap06.quiz.Chap06Ans1;
import team5.miniProject.chapter.chap06.quiz.Chap06Ans2;
import team5.miniProject.chapter.chap06.quiz.Chap06AnsO;
import team5.miniProject.chapter.chap06.quiz.Chap06AnsX;
import team5.miniProject.chapter.chap06.quiz.Chap06Choice;
import team5.miniProject.chapter.chap06.quiz.Chap06Quiz1;
import team5.miniProject.chapter.chap06.quiz.Chap06Quiz2;
import team5.miniProject.chapter.chap06.test.Chap06Test1;
import team5.miniProject.chapter.chap06.test.Chap06Test1Ans1;
import team5.miniProject.chapter.chap06.test.Chap06Test1Ans2;
import team5.miniProject.chapter.chap06.test.Chap06Test2;
import team5.miniProject.chapter.chap06.test.Chap06Test2Ans1;
import team5.miniProject.chapter.chap06.test.Chap06Test2Ans2;
public class Chap06Run extends JFrame{

	public JPanelList list =null;
	public Chap06 jpanel_main = null;
	
	//중첩반복문
	public Chap06Part1NLoop1 jpanel01 = null;
	public Chap06Part1NLoop2 jpanel02 = null;
	public Chap06Part1NLoop4 jpanel03 = null;
	public Chap06Part1NLoop5 jpanel04 = null;
	public Chap06Part1NLoop3 jpanel02_2 = null;

	//2차원 배열
	public Chap06Part2DArray1 jpanel2_1 = null;
	public Chap06Part2DArray2 jpanel2_2 = null;
	public Chap06Part2DArray3 jpanel2_3 = null;
	public Chap06Part2DArray4 jpanel2_4 = null;
	
	//연습문제
	public Chap06Quiz1 mun1 = null;
	public Chap06AnsO muno = null;
	public Chap06AnsX munx = null;
	
	
	//연습문제2
	public Chap06Quiz2 mun2 = null;
	public Chap06Ans1 mun21 =null;
	public Chap06Ans2 mun22 =null;
	public Chap06Choice ch = null;
	
	//승급문제1
	public Chap06Test1 ts = null;
	public Chap06Test1Ans1 t1 = null;
	public Chap06Test1Ans2 t2 = null;
	
	//승급문제2
	public Chap06Test2 tss = null;
	public Chap06Test2Ans1 tss1 = null;
	public Chap06Test2Ans2 tss2 = null;
	
	
	public void change(String panelName){  //패널 1번과 2번 변경 후 재설정


		//첫화면에서 선택과 관련된 구문 panel01을 클릭했을때 -> jpanel03로 가게됨
		if(panelName.equals("panel01")){
			getContentPane().removeAll();
			getContentPane().add(jpanel01);
			revalidate();
			repaint();
		}//첫화면에서 선택과 관련된 구문 panel01을 클릭했을때 -> jpanel02로 가게됨
		else if(panelName.equals("panel02")){
			getContentPane().removeAll();
			getContentPane().add(jpanel02);
			revalidate();
			repaint();

		}//첫화면에서 선택과 관련된 구문 panel01을 클릭했을때 -> jpanel02로 가게됨
		else if(panelName.equals("panel03")){
			getContentPane().removeAll();
			getContentPane().add(jpanel03);
			revalidate();
			repaint();
		}	
		else if(panelName.equals("panel04")){
			getContentPane().removeAll();
			getContentPane().add(jpanel04);
			revalidate();
			repaint();
		}
		else if(panelName.equals("panel02_2")){
			getContentPane().removeAll();
			getContentPane().add(jpanel02_2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jpanel_main")){
			getContentPane().removeAll();
			getContentPane().add(jpanel_main);
			revalidate();
			repaint();
		}
		else if(panelName.equals("list")){
			getContentPane().removeAll();
			getContentPane().add(list);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jpanel21")){
			getContentPane().removeAll();
			getContentPane().add(jpanel2_1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jpanel22")){
			getContentPane().removeAll();
			getContentPane().add(jpanel2_2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jpanel23")){
			getContentPane().removeAll();
			getContentPane().add(jpanel2_3);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jpanel24")){
			getContentPane().removeAll();
			getContentPane().add(jpanel2_4);
			revalidate();
			repaint();
		}//첫화면에서 선택과 관련된 구문 panel01을 클릭했을때 -> jpanel02로 가게됨
		else if(panelName.equals("jea")){
			getContentPane().removeAll();
			getContentPane().add(mun1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jeao")){
			getContentPane().removeAll();
			getContentPane().add(muno);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jeax")){
			getContentPane().removeAll();
			getContentPane().add(munx);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jea1")){
			getContentPane().removeAll();
			getContentPane().add(mun2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jea21")){
			getContentPane().removeAll();
			getContentPane().add(mun21);
			revalidate();
			repaint();
		}
		else if(panelName.equals("jea22")){
			getContentPane().removeAll();
			getContentPane().add(mun22);
			revalidate();
			repaint();
		}
		else if(panelName.equals("ch1")){
			getContentPane().removeAll();
			getContentPane().add(ch);
			revalidate();
			repaint();
		}
		else if(panelName.equals("ts1")){
			getContentPane().removeAll();
			getContentPane().add(ts);
			revalidate();
			repaint();
		}
		else if(panelName.equals("ts11")){
			getContentPane().removeAll();
			getContentPane().add(t1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("ts12")){
			getContentPane().removeAll();
			getContentPane().add(t2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("tss1")){
			getContentPane().removeAll();
			getContentPane().add(tss);
			revalidate();
			repaint();
		}
		else if(panelName.equals("tss11")){
			getContentPane().removeAll();
			getContentPane().add(tss1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("tss12")){
			getContentPane().removeAll();
			getContentPane().add(tss2);
			revalidate();
			repaint();
		}
	}
	


	public static void main(String[]args){


		
		Chap06Run win = new Chap06Run();

		win.setTitle("frame test");
		win.list = new JPanelList(win);
		win.jpanel_main = new Chap06(win);
		//중첩반복문
		win.jpanel01 = new Chap06Part1NLoop1(win);
		win.jpanel02 = new Chap06Part1NLoop2(win);
		win.jpanel03 = new Chap06Part1NLoop4(win);//java설치
		win.jpanel04 = new Chap06Part1NLoop5(win);
		win.jpanel02_2 = new Chap06Part1NLoop3(win);
		//2차원배열
		win.jpanel2_1 = new Chap06Part2DArray1(win);
		win.jpanel2_2 = new Chap06Part2DArray2(win);
		win.jpanel2_3 = new Chap06Part2DArray3(win);
		win.jpanel2_4 = new Chap06Part2DArray4(win);
		//연습문제1
		win.mun1 = new Chap06Quiz1(win);
		win.muno = new Chap06AnsO(win);
		win.munx = new Chap06AnsX(win);
		//연습문제2
		win.mun2 = new Chap06Quiz2(win);
		win.mun21 = new Chap06Ans1(win);
		win.mun22 = new Chap06Ans2(win);
		win.ch = new Chap06Choice(win);
		
		//승급문제1
		win.ts = new Chap06Test1(win);
		win.t1 = new Chap06Test1Ans1(win);
		win.t2 = new Chap06Test1Ans2(win);
		
		//승급문제2
		win.tss = new Chap06Test2(win);
		win.tss1 = new Chap06Test2Ans1(win);
		win.tss2 = new Chap06Test2Ans2(win);
		
		win.add(win.list);

		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setSize(380,680);
		win.setVisible(true);

	}
}


