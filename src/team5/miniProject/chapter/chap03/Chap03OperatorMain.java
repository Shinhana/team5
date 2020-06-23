package miniProject.chapter.chap03;

import javax.swing.JFrame;

import miniProject.JPanel_Login;
import miniProject.JPanel_Main;
import miniProject.PanelList;
import miniProject.chapter.chap01.Chap01ProgramPart01;
import miniProject.chapter.chap01.Chap01ProgramPart02;
import miniProject.chapter.chap01.Chap01ProgramPart03;
import miniProject.chapter.chap01.Chap01ProgramPart04;
import miniProject.chapter.chap01.Chap01ProgramPart05;
import miniProject.chapter.chap01.Chap01ProgramPart06;
import miniProject.chapter.chap01.Chap01ProgramPart07;
import miniProject.chapter.chap03.quiz.Chap03OperatorQuiz1;
import miniProject.chapter.chap03.quiz.Chap03OperatorQuiz2;
import miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer1;
import miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer2;
import miniProject.chapter.chap03.test.Chap03OperatorTest1;
import miniProject.chapter.chap03.test.Chap03OperatorTest2;
import miniProject.chapter.chap03.test.Chap03OperatorTestAnswer1;

public class Chap03OperatorMain extends JFrame{
//	public PanelList panellist =null;
//	public Chap03OperatorPart01 operator_part1 = null;
//	public Chap03OperatorPart02 operator_part2 = null;
//	public Chap03OperatorPart03 operator_part3 = null;
//	public Chap03OperatorPart04 operator_part4 = null;
//	public Chap03OperatorPart05 operator_part5 = null;
//	public Chap03OperatorQuiz1 operator_quiz1 = null;
//	public Chap03OperatorQuiz2 operator_quiz2 = null;
//	public Chap03OperatorTest1 operator_test1 = null;
//	public Chap03OperatorTest2 operator_test2 = null;
//	public Chap03OperatorQuizAnswer1 operator_quizAnswer1 = null;
//	public Chap03OperatorQuizAnswer2 operator_quizAnswer2 = null;
//	public Chap03OperatorTestAnswer1 operator_testAnswer1 = null;
//	public JPanel_Login jpanel_login = null;
//	public JPanel_Main jpanel_main = null;
//	public Chap01ProgramPart01 program_part1 = null;
//	public Chap01ProgramPart02 program_part2 = null;
//	public Chap01ProgramPart03 program_part3 = null;
//	public Chap01ProgramPart04 program_part4 = null;
//	public Chap01ProgramPart05 program_part5 = null;
//	public Chap01ProgramPart06 program_part6 = null;
//	public Chap01ProgramPart07 program_part7 = null;
//	
//	
//	
//	
//	
//	public void change(String panelName){
//		
//		if(panelName.equals("operator_part1")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_part1);
//			revalidate();
//			repaint();
//		}
//		else if(panelName.equals("operator_part2")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_part2);
//			revalidate();
//			repaint();
//		}
//		else if(panelName.equals("operator_part3")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_part3);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_part4")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_part4);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_part5")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_part5);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_quiz1")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_quiz1);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_quiz2")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_quiz2);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_test1")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_test1);
//			revalidate();
//			repaint();
//		}
//		else if(panelName.equals("operator_test2")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_test2);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_quizAnswer1")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_quizAnswer1);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_quizAnswer2")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_quizAnswer2);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("operator_testAnswer1")){
//			getContentPane().removeAll();
//			getContentPane().add(operator_testAnswer1);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panellist")){
//			getContentPane().removeAll();
//			getContentPane().add(panellist);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("jpanel_main")){
//			getContentPane().removeAll();
//			getContentPane().add(jpanel_main);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("jpanel_login")){
//			getContentPane().removeAll();
//			getContentPane().add(jpanel_login);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("program_part1")){
//			getContentPane().removeAll();
//			getContentPane().add(program_part1);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("program_part2")){
//			getContentPane().removeAll();
//			getContentPane().add(program_part2);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("program_part3")){
//			getContentPane().removeAll();
//			getContentPane().add(program_part3);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("program_part4")){
//			getContentPane().removeAll();
//			getContentPane().add(program_part4);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("program_part5")){
//			getContentPane().removeAll();
//			getContentPane().add(program_part5);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("program_part6")){
//			getContentPane().removeAll();
//			getContentPane().add(program_part6);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("program_part7")){
//			getContentPane().removeAll();
//			getContentPane().add(program_part7);
//			revalidate();
//			repaint();
//		}
		
		
		

		
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Chap03OperatorMain win = new Chap03OperatorMain();
//		
//		win.setTitle("Operator");
//		win.panellist = new PanelList(win);
//		win.operator_part1 = new Chap03OperatorPart01(win);
//		win.operator_part2 = new Chap03OperatorPart02(win);
//		win.operator_part3 = new Chap03OperatorPart03(win);
//		win.operator_part4 = new Chap03OperatorPart04(win);
//		win.operator_part5 = new Chap03OperatorPart05(win);
//		win.operator_quiz1 = new Chap03OperatorQuiz1(win);
//		win.operator_quiz2 = new Chap03OperatorQuiz2(win);
//		win.operator_test1 = new Chap03OperatorTest1(win);
//		win.operator_test2 = new Chap03OperatorTest2(win);
//		win.operator_quizAnswer1 = new Chap03OperatorQuizAnswer1(win);
//		win.operator_quizAnswer2 = new Chap03OperatorQuizAnswer2(win);
//		win.operator_testAnswer1 = new Chap03OperatorTestAnswer1(win);
//		win.jpanel_login = new JPanel_Login(win);
//		win.jpanel_main = new JPanel_Main(win);
//		
//		
//		
//		
//		
//		win.add(win.jpanel_main);
//		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		win.setSize(380,680);
//		win.setVisible(true);
//	}
//
//}
