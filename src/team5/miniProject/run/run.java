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
// // <<<<<<< 20200624_2_김재민
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz1;
// // import team5.miniProject.chapter.chap02.test.Chap02Test1;
// // =======
// // import team5.miniProject.chapter.chap02.Chap02VariablePart2;
// // import team5.miniProject.chapter.chap02.Chap02VariablePart3;
// // import team5.miniProject.chapter.chap02.Chap02VariablePart4;
// // import team5.miniProject.chapter.chap02.Chap02VariablePart5;
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz1;
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz10Ans;
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz11Ans;
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz2;
// // import team5.miniProject.chapter.chap02.quiz.Chap02Quiz20Ans;
// // import team5.miniProject.chapter.chap02.test.Chap02Test1;
// // import team5.miniProject.chapter.chap02.test.Chap02Test1Ans;
// // import team5.miniProject.chapter.chap02.test.Chap02Test2;
// // import team5.miniProject.chapter.chap02.test.Chap02Test20Ans;
// // import team5.miniProject.chapter.chap02.test.Chap02Test21Ans;
// >>>>>>> master
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

// // <<<<<<< 20200624_chap03_1_(源��옱誘�)
// // import team5.miniProject.chapter.chap01.Chap01ProgramPart01;
// // import team5.miniProject.chapter.chap01.Chap01ProgramPart02;
// // import team5.miniProject.chapter.chap01.Chap01ProgramPart03;
// // import team5.miniProject.chapter.chap01.Chap01ProgramPart04;
// // import team5.miniProject.chapter.chap01.Chap01ProgramPart05;
// // import team5.miniProject.chapter.chap01.Chap01ProgramPart06;
// // import team5.miniProject.chapter.chap01.Chap01ProgramPart07;
// // import team5.miniProject.chapter.chap03.Chap03OperatorPart01;
// // import team5.miniProject.chapter.chap03.Chap03OperatorPart02;
// // import team5.miniProject.chapter.chap03.Chap03OperatorPart03;
// // import team5.miniProject.chapter.chap03.Chap03OperatorPart04;
// // import team5.miniProject.chapter.chap03.Chap03OperatorPart05;
// // import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuiz1;
// // import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuiz2;
// // import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer1;
// // import team5.miniProject.chapter.chap03.quiz.Chap03OperatorQuizAnswer2;
// // import team5.miniProject.chapter.chap03.test.Chap03OperatorTest1;
// // import team5.miniProject.chapter.chap03.test.Chap03OperatorTest2;
// // import team5.miniProject.chapter.chap03.test.Chap03OperatorTestAnswer1;
// // import team5.miniProject.chapter.chap03.test.Chap03OperatorTestAnswer2;
// // import team5.miniProject.chapter.chap05.Chap05Array;
// // import team5.miniProject.chapter.chap05.Chap05ArrayPart1;
// // import team5.miniProject.chapter.chap05.Chap05ArrayPart2;
// // import team5.miniProject.chapter.chap05.Chap05ArrayPart3;
// // import team5.miniProject.chapter.chap05.Chap05ArrayPart4;
// // import team5.miniProject.chapter.chap05.Chap05ArrayPart5;
// // import team5.miniProject.chapter.chap05.Chap05ArrayPart6;
// // import team5.miniProject.chapter.chap06.Chap06;
// // import team5.miniProject.chapter.chap06.Chap06Part1NLoop1;
// // import team5.miniProject.chapter.chap06.Chap06Part1NLoop2;
// // import team5.miniProject.chapter.chap06.Chap06Part1NLoop3;
// // import team5.miniProject.chapter.chap06.Chap06Part1NLoop4;
// // import team5.miniProject.chapter.chap06.Chap06Part1NLoop5;
// // import team5.miniProject.menu.JPanel_Login;
// // import team5.miniProject.menu.JPanel_Main;
// // import team5.miniProject.menu.PanelList;
// // =======

// // >>>>>>> master

// public class run {
	
// 	public static void main(String[] args) {
// 		PanelChange win = new PanelChange();
	
// 	win.setTitle("Operator");
	
	
// 	//----------------------------main(완)--------------------------------
// 	win.panellist = new PanelList(win);
// 	win.jpanel_login = new JPanel_Login(win);
// 	win.jpanel_main = new JPanel_Main(win);
// 	//----------------------------1.자바프로그램(완)---------------------------
// 	win.program_part1 = new Chap01ProgramPart01(win);
// 	win.program_part2 = new Chap01ProgramPart02(win);
// 	win.program_part3 = new Chap01ProgramPart03(win);
// 	win.program_part4 = new Chap01ProgramPart04(win);
// 	win.program_part5 = new Chap01ProgramPart05(win);
// 	win.program_part6 = new Chap01ProgramPart06(win);
// 	win.program_part7 = new Chap01ProgramPart07(win);
// 	//------------------------2.변수(미완)--------------------------------------
// 	win.variable_main = new Chap02VariableList(win);
// 	win.variable_part1 = new Chap02VariablePart1(win);
// 	win.variable_quiz1 = new Chap02Quiz1(win);//퀴즈
// 	win.variable_test1 = new Chap02Test1(win);//테스트
// 	//----------------------------3.연산자(완)-------------------------------
// 	win.operator_part1 = new Chap03OperatorPart01(win);
// 	win.operator_part2 = new Chap03OperatorPart02(win);
// 	win.operator_part3 = new Chap03OperatorPart03(win);
// 	win.operator_part4 = new Chap03OperatorPart04(win);
// 	win.operator_part5 = new Chap03OperatorPart05(win);
// 	win.operator_quiz1 = new Chap03OperatorQuiz1(win);
// 	win.operator_quiz2 = new Chap03OperatorQuiz2(win);
// 	win.operator_test1 = new Chap03OperatorTest1(win);
// 	win.operator_test2 = new Chap03OperatorTest2(win);
// 	win.operator_quizAnswer1 = new Chap03OperatorQuizAnswer1(win);
// 	win.operator_quizAnswer2 = new Chap03OperatorQuizAnswer2(win);
// 	win.operator_testAnswer1 = new Chap03OperatorTestAnswer1(win);
// 	win.operator_testAnswer2 = new Chap03OperatorTestAnswer2(win);
// 	//------------------------5.배열(미완)-----------------------------------
// 	win.array_main = new  Chap05Array(win); 
// 	win.array_part1 = new  Chap05ArrayPart1(win);
// 	win.array_part2 = new  Chap05ArrayPart2(win);
// 	win.array_part3 = new  Chap05ArrayPart3(win);
// 	win.array_part4 = new  Chap05ArrayPart4(win);
// 	win.array_part5 = new  Chap05ArrayPart5(win);
// 	win.array_part6 = new  Chap05ArrayPart6(win);
// 	//------------------------6.중첩반복문(미완)-----------------------------------
// 	win.nloop_main = new Chap06(win);
// 	win.nloop_part1 = new Chap06Part1NLoop1(win);
// 	win.nloop_part2 = new Chap06Part1NLoop2(win);
// 	win.nloop_part3 = new Chap06Part1NLoop3(win);
// 	win.nloop_part4 = new Chap06Part1NLoop4(win);
// 	win.nloop_part5 = new Chap06Part1NLoop5(win);
// // <<<<<<< 20200624_2_김재민
// // 	win.darray_part1 = new Chap06Part2DArray1(win);
// // 	win.darray_part2 = new Chap06Part2DArray2(win);
// // 	win.darray_part3 = new Chap06Part2DArray3(win);
// // 	win.darray_part4 = new Chap06Part2DArray4(win);


// // =======
// // 	win.variable_part1 = new Chap02VariableList(win);
// // 	win.variable_part2 = new Chap02VariablePart1(win);
// // 	win.variable_part3 = new Chap02VariablePart2(win);
// // 	win.variable_part4 = new Chap02VariablePart3(win);
// // 	win.variable_part5 = new Chap02VariablePart4(win);
// // 	win.variable_part6 = new Chap02VariablePart5(win);
// // 	win.variable_quiz1  = new Chap02Quiz1(win);
// // 	win.variable_quiz2  = new Chap02Quiz2(win);
// // 	win.variable_quizAnswer10 = new Chap02Quiz10Ans(win);
// // 	win.variable_quizAnswer11= new Chap02Quiz11Ans (win);
// // 	win.variable_quizAnswer2 = new Chap02Quiz20Ans(win);
// // 	win.variable_test1 = new Chap02Test1(win);
// // 	win.variable_test2 = new Chap02Test2(win);
// // 	win.variable_test1Answer1 = new Chap02Test1Ans(win);
// // 	win.variable_test1Answer20 = new Chap02Test20Ans (win);
// // 	win.variable_test1Answer21 = new Chap02Test21Ans (win);
	
	
	
	
	
// // >>>>>>> master
//   win.add(win.jpanel_main);
// 	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 	win.setSize(380,680);
// 	win.setVisible(true);

// 	}
// }
