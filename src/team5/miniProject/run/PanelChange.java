package team5.miniProject.run;

import javax.swing.JFrame;

import team5.miniProject.chapter.chap01.Chap01ProgramPart01;
import team5.miniProject.chapter.chap01.Chap01ProgramPart02;
import team5.miniProject.chapter.chap01.Chap01ProgramPart03;
import team5.miniProject.chapter.chap01.Chap01ProgramPart04;
import team5.miniProject.chapter.chap01.Chap01ProgramPart05;
import team5.miniProject.chapter.chap01.Chap01ProgramPart06;
import team5.miniProject.chapter.chap01.Chap01ProgramPart07;
import team5.miniProject.chapter.chap02.Chap02VariableList;
import team5.miniProject.chapter.chap02.Chap02VariablePart1;
import team5.miniProject.chapter.chap02.Chap02VariablePart2;
import team5.miniProject.chapter.chap02.Chap02VariablePart3;
import team5.miniProject.chapter.chap02.Chap02VariablePart4;
import team5.miniProject.chapter.chap02.Chap02VariablePart5;
import team5.miniProject.chapter.chap02.quiz.Chap02Quiz1;
import team5.miniProject.chapter.chap02.quiz.Chap02Quiz10Ans;
import team5.miniProject.chapter.chap02.quiz.Chap02Quiz11Ans;
import team5.miniProject.chapter.chap02.quiz.Chap02Quiz2;
import team5.miniProject.chapter.chap02.quiz.Chap02Quiz20Ans;
import team5.miniProject.chapter.chap02.test.Chap02Test1;
import team5.miniProject.chapter.chap02.test.Chap02Test1Ans;
import team5.miniProject.chapter.chap02.test.Chap02Test2;
import team5.miniProject.chapter.chap02.test.Chap02Test20Ans;
import team5.miniProject.chapter.chap02.test.Chap02Test21Ans;
import team5.miniProject.chapter.chap03.Chap03OperatorPart01;
import team5.miniProject.chapter.chap03.Chap03OperatorPart02;
import team5.miniProject.chapter.chap03.Chap03OperatorPart03;
import team5.miniProject.chapter.chap03.Chap03OperatorPart04;
import team5.miniProject.chapter.chap03.Chap03OperatorPart05;
import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuiz1;
import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuiz2;
import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer1;
import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer2;
import team5.miniProject.chapter.chap03.test.Chap03OperatorTest1;
import team5.miniProject.chapter.chap03.test.Chap03OperatorTest2;
import team5.miniProject.chapter.chap03.test.Chap03OperatorTestAnswer1;
import team5.miniProject.chapter.chap03.test.Chap03OperatorTestAnswer2;
import team5.miniProject.chapter.chap05.Chap05Array;
import team5.miniProject.chapter.chap05.Chap05ArrayPart1;
import team5.miniProject.chapter.chap05.Chap05ArrayPart2;
import team5.miniProject.chapter.chap05.Chap05ArrayPart3;
import team5.miniProject.chapter.chap05.Chap05ArrayPart4;
import team5.miniProject.chapter.chap05.Chap05ArrayPart5;
import team5.miniProject.chapter.chap05.Chap05ArrayPart6;
import team5.miniProject.chapter.chap06.Chap06;
import team5.miniProject.chapter.chap06.Chap06Part1NLoop1;
import team5.miniProject.chapter.chap06.Chap06Part1NLoop2;
import team5.miniProject.chapter.chap06.Chap06Part1NLoop3;
import team5.miniProject.chapter.chap06.Chap06Part1NLoop4;
import team5.miniProject.chapter.chap06.Chap06Part1NLoop5;
import team5.miniProject.chapter.chap06.Chap06Part2DArray1;
import team5.miniProject.chapter.chap06.Chap06Part2DArray2;
import team5.miniProject.chapter.chap06.Chap06Part2DArray3;
import team5.miniProject.chapter.chap06.Chap06Part2DArray4;
import team5.miniProject.menu.JPanel_Login;
import team5.miniProject.menu.JPanel_Main;
import team5.miniProject.menu.PanelList;

public class PanelChange extends JFrame{

	public PanelList panellist =null;
	public Chap03OperatorPart01 operator_part1 = null;
	public Chap03OperatorPart02 operator_part2 = null;
	public Chap03OperatorPart03 operator_part3 = null;
	public Chap03OperatorPart04 operator_part4 = null;
	public Chap03OperatorPart05 operator_part5 = null;
	public Chap03OperatorQuiz1 operator_quiz1 = null;
	public Chap03OperatorQuiz2 operator_quiz2 = null;
	public Chap03OperatorTest1 operator_test1 = null;
	public Chap03OperatorTest2 operator_test2 = null;
	public Chap03OperatorQuizAnswer1 operator_quizAnswer1 = null;
	public Chap03OperatorQuizAnswer2 operator_quizAnswer2 = null;
	public Chap03OperatorTestAnswer1 operator_testAnswer1 = null;
	public Chap03OperatorTestAnswer2 operator_testAnswer2 = null;
	public JPanel_Login jpanel_login = null;
	public JPanel_Main jpanel_main = null;
	public JPanel_Main jpanel_main2 = null;
	public Chap01ProgramPart01 program_part1 = null;
	public Chap01ProgramPart02 program_part2 = null;
	public Chap01ProgramPart03 program_part3 = null;
	public Chap01ProgramPart04 program_part4 = null;
	public Chap01ProgramPart05 program_part5 = null;
	public Chap01ProgramPart06 program_part6 = null;
	public Chap01ProgramPart07 program_part7 = null;
	public Chap05Array array_main = null;
	public Chap05ArrayPart1 array_part1 = null;
	public Chap05ArrayPart2 array_part2 = null;
	public Chap05ArrayPart3 array_part3 = null;
	public Chap05ArrayPart4 array_part4 = null;
	public Chap05ArrayPart5 array_part5 = null;
	public Chap05ArrayPart6 array_part6 = null;
	public Chap06  nloop_main= null;
	public Chap06Part1NLoop1  nloop_part1= null;
	public Chap06Part1NLoop2  nloop_part2= null;
	public Chap06Part1NLoop3  nloop_part3= null;
	public Chap06Part1NLoop4  nloop_part4= null;
	public Chap06Part1NLoop5  nloop_part5= null;
	public Chap06Part2DArray1 darray_part1= null;
	public Chap06Part2DArray2 darray_part2= null;
	public Chap06Part2DArray3 darray_part3= null;
	public Chap06Part2DArray4 darray_part4= null;
	
	public Chap02VariableList variable_part1 = null;
	public Chap02VariablePart1 variable_part2 = null;
	public Chap02VariablePart2 variable_part3 = null;
	public Chap02VariablePart3 variable_part4 = null;
	public Chap02VariablePart4 variable_part5 = null;
	public Chap02VariablePart5 variable_part6 = null;

	public Chap02Quiz1 variable_quiz1 = null; //퀴즈
	public Chap02Quiz2 variable_quiz2 = null; //퀴즈
	public Chap02Test1 variable_test1 = null;//테스트
	public Chap02Test2 variable_test2 = null;//테스트
	
	public Chap02Quiz10Ans variable_quizAnswer10 = null; //퀴즈답안
	public Chap02Quiz11Ans variable_quizAnswer11 = null; //퀴즈답안
	public Chap02Quiz20Ans variable_quizAnswer2 = null; //퀴즈답안
	public Chap02Test1Ans variable_test1Answer1 = null;//테스트답안
	public Chap02Test20Ans variable_test1Answer20 = null;//테스트답안
	public Chap02Test21Ans variable_test1Answer21 = null;//테스트답안
	
	
public void change(String panelName){
		
		if(panelName.equals("operator_part1")){
			getContentPane().removeAll();
			getContentPane().add(operator_part1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("operator_part2")){
			getContentPane().removeAll();
			getContentPane().add(operator_part2);
			revalidate();
			repaint();
		}
		else if(panelName.equals("operator_part3")){
			getContentPane().removeAll();
			getContentPane().add(operator_part3);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_part4")){
			getContentPane().removeAll();
			getContentPane().add(operator_part4);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_part5")){
			getContentPane().removeAll();
			getContentPane().add(operator_part5);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_quiz1")){
			getContentPane().removeAll();
			getContentPane().add(operator_quiz1);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_quiz2")){
			getContentPane().removeAll();
			getContentPane().add(operator_quiz2);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_test1")){
			getContentPane().removeAll();
			getContentPane().add(operator_test1);
			revalidate();
			repaint();
		}
		else if(panelName.equals("operator_test2")){
			getContentPane().removeAll();
			getContentPane().add(operator_test2);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_quizAnswer1")){
			getContentPane().removeAll();
			getContentPane().add(operator_quizAnswer1);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_quizAnswer2")){
			getContentPane().removeAll();
			getContentPane().add(operator_quizAnswer2);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_testAnswer1")){
			getContentPane().removeAll();
			getContentPane().add(operator_testAnswer1);
			revalidate();
			repaint();
		}else if(panelName.equals("operator_testAnswer2")){
				getContentPane().removeAll();
				getContentPane().add(operator_testAnswer2);
				revalidate();
				repaint();
			
		}else if(panelName.equals("panellist")){
			getContentPane().removeAll();
			getContentPane().add(panellist);
			revalidate();
			repaint();
		}else if(panelName.equals("jpanel_main")){
			getContentPane().removeAll();
			getContentPane().add(jpanel_main);
			revalidate();
			repaint();
		}else if(panelName.equals("jpanel_login")){
			getContentPane().removeAll();
			getContentPane().add(jpanel_login);
			revalidate();
			repaint();
		}else if(panelName.equals("program_part1")){
			getContentPane().removeAll();
			getContentPane().add(program_part1);
			revalidate();
			repaint();
		}else if(panelName.equals("program_part2")){
			getContentPane().removeAll();
			getContentPane().add(program_part2);
			revalidate();
			repaint();
		}else if(panelName.equals("program_part3")){
			getContentPane().removeAll();
			getContentPane().add(program_part3);
			revalidate();
			repaint();
		}else if(panelName.equals("program_part4")){
			getContentPane().removeAll();
			getContentPane().add(program_part4);
			revalidate();
			repaint();
		}else if(panelName.equals("program_part5")){
			getContentPane().removeAll();
			getContentPane().add(program_part5);
			revalidate();
			repaint();
		}else if(panelName.equals("program_part6")){
			getContentPane().removeAll();
			getContentPane().add(program_part6);
			revalidate();
			repaint();
		}else if(panelName.equals("program_part7")){
			getContentPane().removeAll();
			getContentPane().add(program_part7);
			revalidate();
			repaint();
		}else if(panelName.equals("array_main")){
			getContentPane().removeAll();
			getContentPane().add(array_main);
			revalidate();
			repaint();
		}else if(panelName.equals("array_part1")){
			getContentPane().removeAll();
			getContentPane().add(array_part1);
			revalidate();
			repaint();
		}else if(panelName.equals("array_part2")){
			getContentPane().removeAll();
			getContentPane().add(array_part2);
			revalidate();
			repaint();
		}else if(panelName.equals("array_part3")){
			getContentPane().removeAll();
			getContentPane().add(array_part3);
			revalidate();
			repaint();
		}else if(panelName.equals("nloop_main")){
			getContentPane().removeAll();
			getContentPane().add(nloop_main);
			revalidate();
			repaint();
		}else if(panelName.equals("nloop_part1")){
			getContentPane().removeAll();
			getContentPane().add(nloop_part1);
			revalidate();
			repaint();
		}else if(panelName.equals("nloop_part2")){
			getContentPane().removeAll();
			getContentPane().add(nloop_part2);
			revalidate();
			repaint();
		}else if(panelName.equals("nloop_part3")){
			getContentPane().removeAll();
			getContentPane().add(nloop_part3);
			revalidate();
			repaint();
		}else if(panelName.equals("nloop_part4")){
			getContentPane().removeAll();
			getContentPane().add(nloop_part4);
			revalidate();
			repaint();
		}else if(panelName.equals("nloop_part5")){
			getContentPane().removeAll();
			getContentPane().add(nloop_part5);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_part1")){
			getContentPane().removeAll();
			getContentPane().add(variable_part1);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_part2")){
			getContentPane().removeAll();
			getContentPane().add(variable_part2);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_part3")){
			getContentPane().removeAll();
			getContentPane().add(variable_part3);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_part4")){
			getContentPane().removeAll();
			getContentPane().add(variable_part4);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_part5")){
			getContentPane().removeAll();
			getContentPane().add(variable_part5);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_part6")){
			getContentPane().removeAll();
			getContentPane().add(variable_part6);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_quiz1 ")){
			getContentPane().removeAll();
			getContentPane().add(variable_quiz1);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_quiz2")){
			getContentPane().removeAll();
			getContentPane().add(variable_quiz2);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_quiz2")){
			getContentPane().removeAll();
			getContentPane().add(variable_quiz2);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_quizAnswer10 ")){
			getContentPane().removeAll();
			getContentPane().add(variable_quizAnswer10);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_quizAnswer11")){
			getContentPane().removeAll();
			getContentPane().add(variable_quizAnswer11);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_quizAnswer2 ")){
			getContentPane().removeAll();
			getContentPane().add(variable_quizAnswer2 );
			revalidate();
			repaint();
		} else if(panelName.equals("variable_test1")){
			getContentPane().removeAll();
			getContentPane().add(variable_test1);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_test2")){
			getContentPane().removeAll();
			getContentPane().add(variable_test2);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_test1Answer1")){
			getContentPane().removeAll();
			getContentPane().add(variable_test1Answer1);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_test1Answer20")){
			getContentPane().removeAll();
			getContentPane().add(variable_test1Answer20);
			revalidate();
			repaint();
		} else if(panelName.equals("variable_test1Answer21")){
			getContentPane().removeAll();
			getContentPane().add(variable_test1Answer21);
			revalidate();
			repaint();
		}
		

		
	}
	
}
