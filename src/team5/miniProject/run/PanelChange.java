// <<<<<<< 20200624chap01_1번쨰
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
import team5.miniProject.chapter.chap04.Chap04BranchPart1;
import team5.miniProject.chapter.chap04.Chap04ConditionalPart1;
import team5.miniProject.chapter.chap04.Chap04ConditionalPart2;
import team5.miniProject.chapter.chap04.Chap04ControlStatement;
import team5.miniProject.chapter.chap04.Chap04LoopPart1;
import team5.miniProject.chapter.chap04.Chap04LoopPart2;
import team5.miniProject.chapter.chap04.Chap04QuizTime;
import team5.miniProject.chapter.chap04.quiz.Chap04Quiz1;
import team5.miniProject.chapter.chap04.quiz.Chap04Quiz1Ans;
import team5.miniProject.chapter.chap04.quiz.Chap04Quiz2;
import team5.miniProject.chapter.chap04.test.Chap04Test1;
import team5.miniProject.chapter.chap04.test.Chap04Test1Ans1;
import team5.miniProject.chapter.chap04.test.Chap04Test1Ans2;
import team5.miniProject.chapter.chap04.test.Chap04Test2;
import team5.miniProject.chapter.chap04.test.Chap04Test2Ans;
import team5.miniProject.chapter.chap05.Chap05Array;
import team5.miniProject.chapter.chap05.Chap05ArrayPart1;
import team5.miniProject.chapter.chap05.Chap05ArrayPart2;
import team5.miniProject.chapter.chap05.Chap05ArrayPart3;
import team5.miniProject.chapter.chap05.Chap05ArrayPart4;
import team5.miniProject.chapter.chap05.Chap05ArrayPart5;
import team5.miniProject.chapter.chap05.Chap05ArrayPart6;
import team5.miniProject.chapter.chap05.quiz.Chap05Quiz1;
import team5.miniProject.chapter.chap05.quiz.Chap05Quiz1AnsO;
import team5.miniProject.chapter.chap05.quiz.Chap05Quiz1AnsX;
import team5.miniProject.chapter.chap05.quiz.Chap05Quiz2;
import team5.miniProject.chapter.chap05.quiz.Chap05Quiz2AnsO;
import team5.miniProject.chapter.chap05.quiz.Chap05Quiz2AnsX;
import team5.miniProject.chapter.chap05.test.Chap05Test1;
import team5.miniProject.chapter.chap05.test.Chap05Test1Ans1;
import team5.miniProject.chapter.chap05.test.Chap05Test2;
import team5.miniProject.chapter.chap05.test.Chap05Test2Ans1;
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
import team5.miniProject.menu.JPanelSignUp;
import team5.miniProject.menu.JPanel_Login;
import team5.miniProject.menu.JPanel_Main;
import team5.miniProject.menu.PanelList;




// public class PanelChange extends JFrame{
// 	public PanelList panellist =null;
 	
// 	public Chap03OperatorPart01 operator_part1 = null;
// 	public Chap03OperatorPart02 operator_part2 = null;
// 	public Chap03OperatorPart03 operator_part3 = null;
// 	public Chap03OperatorPart04 operator_part4 = null;
// 	public Chap03OperatorPart05 operator_part5 = null;
// 	public Chap03OperatorQuiz1 operator_quiz1 = null;
// 	public Chap03OperatorQuiz2 operator_quiz2 = null;
// 	public Chap03OperatorTest1 operator_test1 = null;
// 	public Chap03OperatorTest2 operator_test2 = null;
// 	public Chap03OperatorQuizAnswer1 operator_quizAnswer1 = null;
// 	public Chap03OperatorQuizAnswer2 operator_quizAnswer2 = null;
// 	public Chap03OperatorTestAnswer1 operator_testAnswer1 = null;
// 	public Chap03OperatorTestAnswer2 operator_testAnswer2 = null;
// 	public JPanel_Login jpanel_login = null;
// 	public JPanel_Main jpanel_main = null;
// 	public JPanel_Main jpanel_main2 = null;
// 	public Chap01ProgramPart01 program_part1 = null;
// 	public Chap01ProgramPart02 program_part2 = null;
// 	public Chap01ProgramPart03 program_part3 = null;
// 	public Chap01ProgramPart04 program_part4 = null;
// 	public Chap01ProgramPart05 program_part5 = null;
// 	public Chap01ProgramPart06 program_part6 = null;
// 	public Chap01ProgramPart07 program_part7 = null;
// 	public Chap05Array array_main = null;
// 	public Chap05ArrayPart1 array_part1 = null;
// 	public Chap05ArrayPart2 array_part2 = null;
// 	public Chap05ArrayPart3 array_part3 = null;
// 	public Chap05ArrayPart4 array_part4 = null;
// 	public Chap05ArrayPart5 array_part5 = null;
// 	public Chap05ArrayPart6 array_part6 = null;
// 	public Chap06  nloop_main= null;
// 	public Chap06Part1NLoop1  nloop_part1= null;
// 	public Chap06Part1NLoop2  nloop_part2= null;
// 	public Chap06Part1NLoop3  nloop_part3= null;
// 	public Chap06Part1NLoop4  nloop_part4= null;
// 	public Chap06Part1NLoop5  nloop_part5= null;
// 	public Chap06Part2DArray1 darray_part1= null;
// 	public Chap06Part2DArray2 darray_part2= null;
// 	public Chap06Part2DArray3 darray_part3= null;
// 	public Chap06Part2DArray4 darray_part4= null;
// 	public Chap02VariableList variable_part1 = null;
	
	
	
// public void change(String panelName){
		
// 		if(panelName.equals("operator_part1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_part1);
// 			revalidate();
// 			repaint();
// 		}
// 		else if(panelName.equals("operator_part2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_part2);
// 			revalidate();
// 			repaint();
// 		}
// 		else if(panelName.equals("operator_part3")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_part3);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_part4")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_part4);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_part5")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_part5);
// 			revalidate();
// 			repaint();}

 
// 		}else if(panelName.equals("operator_quiz1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_quiz1);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_quiz2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_quiz2);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_test1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_test1);
// 			revalidate();
// 			repaint();
// 		}
// 		else if(panelName.equals("operator_test2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_test2);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_quizAnswer1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_quizAnswer1);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_quizAnswer2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_quizAnswer2);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_testAnswer1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(operator_testAnswer1);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("operator_testAnswer2")){
// 				getContentPane().removeAll();
// 				getContentPane().add(operator_testAnswer2);
// 				revalidate();
// 				repaint();
			
// 		}else if(panelName.equals("panellist")){
// 			getContentPane().removeAll();
// 			getContentPane().add(panellist);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("jpanel_main")){
// 			getContentPane().removeAll();
// 			getContentPane().add(jpanel_main);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("jpanel_login")){
// 			getContentPane().removeAll();
// 			getContentPane().add(jpanel_login);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("program_part1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(program_part1);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("program_part2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(program_part2);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("program_part3")){
// 			getContentPane().removeAll();
// 			getContentPane().add(program_part3);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("program_part4")){
// 			getContentPane().removeAll();
// 			getContentPane().add(program_part4);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("program_part5")){
// 			getContentPane().removeAll();
// 			getContentPane().add(program_part5);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("program_part6")){
// 			getContentPane().removeAll();
// 			getContentPane().add(program_part6);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("program_part7")){
// 			getContentPane().removeAll();
// 			getContentPane().add(program_part7);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("array_main")){
// 			getContentPane().removeAll();
// 			getContentPane().add(array_main);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("array_part1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(array_part1);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("array_part2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(array_part2);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("array_part3")){
// 			getContentPane().removeAll();
// 			getContentPane().add(array_part3);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("nloop_main")){
// 			getContentPane().removeAll();
// 			getContentPane().add(nloop_main);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("nloop_part1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(nloop_part1);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("nloop_part2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(nloop_part2);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("nloop_part3")){
// 			getContentPane().removeAll();
// 			getContentPane().add(nloop_part3);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("nloop_part4")){
// 			getContentPane().removeAll();
// 			getContentPane().add(nloop_part4);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("nloop_part5")){
// 			getContentPane().removeAll();
// 			getContentPane().add(nloop_part5);
// 			revalidate();
// 			repaint();
// 		}else if(panelName.equals("variable_part1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(variable_part1);
// 			revalidate();
// 			repaint();
// 		}
		
		
// 		//이거
		
		

		
// 	}
	
// }
// =======
// package team5.miniProject.run;

// import javax.swing.JFrame;

// import team5.miniProject.chapter.chap01.Chap01ProgramPart01;
// import team5.miniProject.chapter.chap01.Chap01ProgramPart02;
// import team5.miniProject.chapter.chap01.Chap01ProgramPart03;
// import team5.miniProject.chapter.chap01.Chap01ProgramPart04;
// import team5.miniProject.chapter.chap01.Chap01ProgramPart05;
// import team5.miniProject.chapter.chap01.Chap01ProgramPart06;
// import team5.miniProject.chapter.chap01.Chap01ProgramPart07;
// import team5.miniProject.chapter.chap02.Chap02VariableList;
// import team5.miniProject.chapter.chap02.Chap02VariablePart1;
// import team5.miniProject.chapter.chap02.Chap02VariablePart2;
// import team5.miniProject.chapter.chap02.Chap02VariablePart3;
// import team5.miniProject.chapter.chap02.Chap02VariablePart4;
// import team5.miniProject.chapter.chap02.Chap02VariablePart5;
// import team5.miniProject.chapter.chap02.quiz.Chap02Quiz1;
// import team5.miniProject.chapter.chap02.quiz.Chap02Quiz10Ans;
// // <<<<<<< 20200624_2_김재민
// // import team5.miniProject.chapter.chap02.test.Chap02Test1;
// // import team5.miniProject.chapter.chap02.test.Chap02Test1Ans;
// // =======
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz11Ans;
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz2;
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz20Ans;
// // import team5.miniProject.chapter.chap02.test.Chap02Test1;
// // import team5.miniProject.chapter.chap02.test.Chap02Test1Ans;
// // import team5.miniProject.chapter.chap02.test.Chap02Test2;
// // import team5.miniProject.chapter.chap02.test.Chap02Test20Ans;
// // import team5.miniProject.chapter.chap02.test.Chap02Test21Ans;
// // >>>>>>> master
// import team5.miniProject.chapter.chap03.Chap03OperatorPart01;
// import team5.miniProject.chapter.chap03.Chap03OperatorPart02;
// import team5.miniProject.chapter.chap03.Chap03OperatorPart03;
// import team5.miniProject.chapter.chap03.Chap03OperatorPart04;
// import team5.miniProject.chapter.chap03.Chap03OperatorPart05;
// import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuiz1;
// import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuiz2;
// import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer1;
// import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer2;
// import team5.miniProject.chapter.chap03.test.Chap03OperatorTest1;
// import team5.miniProject.chapter.chap03.test.Chap03OperatorTest2;
// import team5.miniProject.chapter.chap03.test.Chap03OperatorTestAnswer1;
// import team5.miniProject.chapter.chap03.test.Chap03OperatorTestAnswer2;
// import team5.miniProject.chapter.chap05.Chap05Array;
// import team5.miniProject.chapter.chap05.Chap05ArrayPart1;
// import team5.miniProject.chapter.chap05.Chap05ArrayPart2;
// import team5.miniProject.chapter.chap05.Chap05ArrayPart3;
// import team5.miniProject.chapter.chap05.Chap05ArrayPart4;
// import team5.miniProject.chapter.chap05.Chap05ArrayPart5;
// import team5.miniProject.chapter.chap05.Chap05ArrayPart6;
// import team5.miniProject.chapter.chap06.Chap06;
// import team5.miniProject.chapter.chap06.Chap06Part1NLoop1;
// import team5.miniProject.chapter.chap06.Chap06Part1NLoop2;
// import team5.miniProject.chapter.chap06.Chap06Part1NLoop3;
// import team5.miniProject.chapter.chap06.Chap06Part1NLoop4;
// import team5.miniProject.chapter.chap06.Chap06Part1NLoop5;
// import team5.miniProject.chapter.chap06.Chap06Part2DArray1;
// import team5.miniProject.chapter.chap06.Chap06Part2DArray2;
// import team5.miniProject.chapter.chap06.Chap06Part2DArray3;
// import team5.miniProject.chapter.chap06.Chap06Part2DArray4;
// import team5.miniProject.menu.JPanel_Login;
// import team5.miniProject.menu.JPanel_Main;
// import team5.miniProject.menu.PanelList;

 public class PanelChange extends JFrame{
	
 	//-----------------------------main---------------------------
 	public JPanel_Login jpanel_login = null;
 	public JPanel_Main jpanel_main = null;
 	public PanelList panellist =null;
 	public JPanelSignUp signup =null;
 	//----------------------------1.자바프로그램----------------------
 	public Chap01ProgramPart01 program_part1 = null;
 	public Chap01ProgramPart02 program_part2 = null;
 	public Chap01ProgramPart03 program_part3 = null;
 	public Chap01ProgramPart04 program_part4 = null;
 	public Chap01ProgramPart05 program_part5 = null;
 	public Chap01ProgramPart06 program_part6 = null;
 	public Chap01ProgramPart07 program_part7 = null;
 	//----------------------------2.변수----------------------------
// 	public Chap02VariableList variable_main = null;
// 	public Chap02VariablePart1 variable_part1 = null;
// 	public Chap02VariablePart2 variable_part2 = null;
// 	public Chap02VariablePart3 variable_part3 = null;
// 	public Chap02VariablePart4 variable_part4 = null;
// 	public Chap02VariablePart5 variable_part5 = null;
// 	public Chap02Quiz1 variable_quiz1 = null; //퀴즈
// 	public Chap02Test1 variable_test1 = null;//테스트
 	public Chap02Quiz10Ans variable_quizAnswer1 = null; //퀴즈
 	public Chap02Test1Ans variable_test1Answer1 = null;//테스트
 	public Chap02Quiz10Ans variable_quizAnswer10 = null; //퀴즈답안
 	public Chap02Quiz11Ans variable_quizAnswer11 = null; //퀴즈답안
 	public Chap02Quiz20Ans variable_quizAnswer2 = null; //퀴즈답안
 	public Chap02Test20Ans variable_test1Answer20 = null;//테스트답안
 	public Chap02Test21Ans variable_test1Answer21 = null;//테스트답안
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
 	
 	//---------------------------3.퀴즈-------------------------------
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
	
 	//---------------------------4.제어문-----------------------------
 	public Chap04ControlStatement control_main = null;
 	public Chap04BranchPart1 branch_part1 = null;
 	public Chap04LoopPart1 loop_part1 = null;
 	public Chap04LoopPart2 loop_part2 = null;
    public Chap04QuizTime control_quiz = null;
    public Chap04ConditionalPart1 conditional_part1 = null;
    public Chap04ConditionalPart2 conditional_part2 = null;
    public Chap04Quiz1 control_quiz1 = null;
    public Chap04Quiz2 control_quiz2 = null;
    public Chap04Quiz1Ans control_quizAnswer1 = null;
    public Chap04Test1 control_test1 = null;
    public Chap04Test2 control_test2 = null;
    public Chap04Test1Ans1 control_test1Answer1 = null;
    public Chap04Test1Ans2 control_test1Answer2 = null;
    public Chap04Test2Ans control_test2Answer = null;
    
 	//--------------------------5.배열--------------------------------
 	//public JPanel_Main jpanel_main2 = null;
 	public Chap05Array array_main = null;
 	public Chap05ArrayPart1 array_part1 = null;
 	public Chap05ArrayPart2 array_part2 = null;
 	public Chap05ArrayPart3 array_part3 = null;
 	public Chap05ArrayPart4 array_part4 = null;
 	public Chap05ArrayPart5 array_part5 = null;
 	public Chap05ArrayPart6 array_part6 = null;
 	//---------------윤창 추가해야할 것-------------------------------
 	public Chap05Quiz1 array_quiz1;
  	public Chap05Quiz2 array_quiz2;
  	public Chap05Quiz1AnsO array_quiz1AnsO;
  	public Chap05Quiz1AnsX array_quiz1AnsX;
  	public Chap05Quiz2AnsO array_quiz2AnsO;
  	public Chap05Quiz2AnsX array_quiz2AnsX;
  	public Chap05Test1 array_test1;
  	public Chap05Test2 array_test2;
  	public Chap05Test1Ans1 array_test1Ans1;
  	public Chap05Test2Ans1 array_test2Ans1;
 	
 	
 	//---------------------------6.중첩반복문 이차원배열--------------------
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
 // <<<<<<< 20200624_2_김재민
// // =======
	

// // >>>>>>> master
	

	
	
 public void change(String panelName){
	//---------------------------------------------------2.변수----------------------------------------------------
	 if(panelName.equals("variable_part1")){
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
 	//---------------------------------------------------3.연산자---------------------------------------------------
		else if(panelName.equals("operator_part1")){
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
 //------------------------------------------------main-----------------------------------------------------			
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
 		}else if(panelName.equals("signup")){
 			getContentPane().removeAll();
 			getContentPane().add(signup);
 			revalidate();
 			repaint();
 		}
 //----------------------------------------1.자바--------------------------------------------------------------------		
 		else if(panelName.equals("program_part1")){
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
 		}
 //---------------------------------------4.제어문---------------------------------------------
 		else if(panelName.equals("control_main")){
 			getContentPane().removeAll();
 			getContentPane().add(control_main);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("conditional_part1")){
 			getContentPane().removeAll();
 			getContentPane().add(conditional_part1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("conditional_part2")){
 			getContentPane().removeAll();
 			getContentPane().add(conditional_part2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("branch_part1")){
 			getContentPane().removeAll();
 			getContentPane().add(branch_part1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("loop_part1")){
 			getContentPane().removeAll();
 			getContentPane().add(loop_part1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("loop_part2")){
 			getContentPane().removeAll();
 			getContentPane().add(loop_part2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_quiz")){
 			getContentPane().removeAll();
 			getContentPane().add(control_quiz);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_quiz1")){
 			getContentPane().removeAll();
 			getContentPane().add(control_quiz1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_quiz2")){
 			getContentPane().removeAll();
 			getContentPane().add(control_quiz2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_test1")){
 			getContentPane().removeAll();
 			getContentPane().add(control_test1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_test1Answer1")){
 			getContentPane().removeAll();
 			getContentPane().add(control_test1Answer1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_test1Answer2")){
 			getContentPane().removeAll();
 			getContentPane().add(control_test1Answer2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_test2")){
 			getContentPane().removeAll();
 			getContentPane().add(control_test2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_test2Answer1")){
 			getContentPane().removeAll();
 			getContentPane().add(control_test2Answer);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("control_test2Answer")){
 			getContentPane().removeAll();
 			getContentPane().add(control_test2Answer);
 			revalidate();
 			repaint();
 		}
	 
	 
	 
	 
 //---------------------------------------5.배열-------------------------------------------------------------------------------		
 		else if(panelName.equals("array_main")){
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
 		}else if(panelName.equals("array_part4")){
 			getContentPane().removeAll();
 			getContentPane().add(array_part4);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_part5")){
 			getContentPane().removeAll();
 			getContentPane().add(array_part5);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_part6")){
 			getContentPane().removeAll();
 			getContentPane().add(array_part6);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_quiz1")){
 			getContentPane().removeAll();
 			getContentPane().add(array_quiz1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_quiz2")){
 			getContentPane().removeAll();
 			getContentPane().add(array_quiz2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_test1")){
 			getContentPane().removeAll();
 			getContentPane().add(array_test1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_test2")){
 			getContentPane().removeAll();
 			getContentPane().add(array_test2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_quiz1AnsO")){
 			getContentPane().removeAll();
 			getContentPane().add(array_quiz1AnsO);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_quiz1AnsX")){
 			getContentPane().removeAll();
 			getContentPane().add(array_quiz1AnsX);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_quiz2AnsO")){
 			getContentPane().removeAll();
 			getContentPane().add(array_quiz2AnsO);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_quiz2AnsX")){
 			getContentPane().removeAll();
 			getContentPane().add(array_quiz2AnsX);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_test1Ans1")){
 			getContentPane().removeAll();
 			getContentPane().add(array_test1Ans1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("array_test2Ans1")){
 			getContentPane().removeAll();
 			getContentPane().add(array_test2Ans1);
 			revalidate();
 			repaint();
 		}
		
		
		
		
 		//---------------------------------------6.중첩반복문-------------------------------------------------------------------------------
 		else if(panelName.equals("nloop_main")){
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
 		}else if(panelName.equals("darray_part1")){
 			getContentPane().removeAll();
 			getContentPane().add(darray_part1);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("darray_part2")){
 			getContentPane().removeAll();
 			getContentPane().add(darray_part2);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("darray_part3")){
 			getContentPane().removeAll();
 			getContentPane().add(darray_part3);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("darray_part4")){
 			getContentPane().removeAll();
 			getContentPane().add(darray_part4);
 			revalidate();
 			repaint();
 		}else if(panelName.equals("nloop_part5")){
 			getContentPane().removeAll();
 			getContentPane().add(nloop_part5);
 			revalidate();
 			repaint();
 		}
		

		
 	}
	
 }
// >>>>>>> master
