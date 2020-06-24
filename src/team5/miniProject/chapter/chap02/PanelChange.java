// package team5.miniProject.chapter.chap02;

// import javax.swing.JFrame;

// import team5.miniProject.chapter.chap02.quiz.Chap02Quiz1;
// import team5.miniProject.chapter.chap02.quiz.Chap02Quiz10Ans;
// import team5.miniProject.chapter.chap02.quiz.Chap02Quiz11Ans;
// import team5.miniProject.chapter.chap02.quiz.Chap02Quiz2;
// import team5.miniProject.chapter.chap02.quiz.Chap02Quiz20Ans;
// import team5.miniProject.chapter.chap02.test.Chap02Test1;
// import team5.miniProject.chapter.chap02.test.Chap02Test1Ans;
// import team5.miniProject.chapter.chap02.test.Chap02Test2;
// import team5.miniProject.chapter.chap02.test.Chap02Test20Ans;
// import team5.miniProject.chapter.chap02.test.Chap02Test21Ans;

// public class PanelChange extends JFrame {
	
// <<<<<<< 20200624_All_2
// //	public Chap02VariableList list = null;
// //	public Chap02VariablePart1 var1 = null;
// //	public Chap02VariablePart2 var2 = null;
// //	public Chap02VariablePart3 var3 = null;
// //	public Chap02VariablePart4 var4 = null;
// //	public Chap02VariablePart5 var5 = null;
// //	
// //	public Chap02Quiz1 quiz1 = null;	
// //	public Chap02Quiz2 quiz2 = null;
// //	public Chap02Quiz10Ans qans10 = null;
// //	public Chap02Quiz11Ans qans11 = null;
// //	public Chap02Quiz20Ans qans20 = null;
// //	
// //	public Chap02Test1 test1 = null;
// //	public Chap02Test2 test2 = null;
// //	public Chap02Test1Ans tans1 = null;
// //	public Chap02Test20Ans tans20 = null;
// //	public Chap02Test21Ans tans21 = null;
// //	
// //	public PanelChange() {}
// //	
// //	public void change(String panelName){ 
// //		
// //		if(panelName.equals("var1")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(var1);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("var2")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(var2);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("var3")){
// //			getContentPane().removeAll();
// //			getContentPane().add(var3);
// //			revalidate();
// //			repaint();
// //			
// //		} else if(panelName.equals("var4")){
// //			getContentPane().removeAll();
// //			getContentPane().add(var4);
// //			revalidate();
// //			repaint();
// //		}  else if(panelName.equals("var5")){
// //			getContentPane().removeAll();
// //			getContentPane().add(var5);
// //			revalidate();
// //			repaint();			
// //		} 
// //		
// //		else if(panelName.equals("quiz1")){
// //			getContentPane().removeAll();
// //			getContentPane().add(quiz1);
// //			revalidate();
// //			repaint();			
// //		}   else if(panelName.equals("quiz2")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(quiz2);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("operator_quizAnswer1")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(qans10);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("operator_quizAnswer2")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(qans20);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("qans11")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(qans11);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("qans10")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(qans10);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("qans20")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(qans20);
// //			revalidate();
// //			repaint();
// //		} 
// //
// //		else if(panelName.equals("test1")){
// //			getContentPane().removeAll();
// //			getContentPane().add(test1);
// //			revalidate();
// //			repaint();			
// //		}else if(panelName.equals("test2")) {
// //			getContentPane().removeAll();
// //			getContentPane().add(test2);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("operator_testAnswer1")){
// //			getContentPane().removeAll();
// //			getContentPane().add(tans1);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("operator_testAnswer2")){
// //			getContentPane().removeAll();
// //			getContentPane().add(tans20);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("tans1")){
// //			getContentPane().removeAll();
// //			getContentPane().add(tans1);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("tans20")){
// //			getContentPane().removeAll();
// //			getContentPane().add(tans20);
// //			revalidate();
// //			repaint();
// //		} else if(panelName.equals("tans21")){
// //			getContentPane().removeAll();
// //			getContentPane().add(tans21);
// //			revalidate();
// //			repaint();
// //		} 
// //
// //		else if(panelName.equals("list")){
// //			getContentPane().removeAll();
// //			getContentPane().add(list);
// //			revalidate();
// //			repaint();			
// //		}
// //	
// //	}
// //
// //	public static void main(String[] args){
// //		
// //		PanelChange win = new PanelChange();
// //
// //		win.setSize(380,680);
// //		win.setResizable(false); //Ã¢ Å©±â º¯°æ ºÒ°¡
// //		win.setLocationRelativeTo(null);
// //		
// //		
// //		win.setTitle("Java¸¦ JOB¾Æ¶ó");
// //		win.list = new Chap02VariableList(win);
// //		win.var1 = new Chap02VariablePart1(win);
// //		win.var2 = new Chap02VariablePart2(win);
// //		win.var3 = new Chap02VariablePart3(win);
// //		win.var4 = new Chap02VariablePart4(win);
// //		win.var5 = new Chap02VariablePart5(win);
// //		
// //		win.quiz1 = new Chap02Quiz1(win);
// //		win.qans10 = new Chap02Quiz10Ans(win);
// //		win.qans11 = new Chap02Quiz11Ans(win);
// //		win.quiz2 = new Chap02Quiz2(win);
// //		win.qans20 = new Chap02Quiz20Ans(win);
// //		
// //		win.test1 = new Chap02Test1(win);		
// //		win.test2 = new Chap02Test2(win);
// //		win.tans1 = new Chap02Test1Ans(win);
// //		win.tans20 = new Chap02Test20Ans(win);
// //		win.tans21 = new Chap02Test21Ans(win);
// //		
// //		win.add(win.list);
// //		
// //		win.setVisible(true);
// //		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //	}
// //	
// =======
// 	public Chap02VariableList list = null;
// 	public Chap02VariablePart1 var1 = null;
// 	public Chap02VariablePart2 var2 = null;
// 	public Chap02VariablePart3 var3 = null;
// 	public Chap02VariablePart4 var4 = null;
// 	public Chap02VariablePart5 var5 = null;
	
// 	public Chap02Quiz1 quiz1 = null;	
// 	public Chap02Quiz2 quiz2 = null;
// 	public Chap02Quiz10Ans qans10 = null;
// 	public Chap02Quiz11Ans qans11 = null;
// 	public Chap02Quiz20Ans qans20 = null;
	
// 	public Chap02Test1 test1 = null;
// 	public Chap02Test2 test2 = null;
// 	public Chap02Test1Ans tans1 = null;
// 	public Chap02Test20Ans tans20 = null;
// 	public Chap02Test21Ans tans21 = null;
	
// 	public PanelChange() {}
	
// 	public void change(String panelName){ 
		
// 		if(panelName.equals("var1")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(var1);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("var2")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(var2);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("var3")){
// 			getContentPane().removeAll();
// 			getContentPane().add(var3);
// 			revalidate();
// 			repaint();
			
// 		} else if(panelName.equals("var4")){
// 			getContentPane().removeAll();
// 			getContentPane().add(var4);
// 			revalidate();
// 			repaint();
// 		}  else if(panelName.equals("var5")){
// 			getContentPane().removeAll();
// 			getContentPane().add(var5);
// 			revalidate();
// 			repaint();			
// 		} 
		
// 		else if(panelName.equals("quiz1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(quiz1);
// 			revalidate();
// 			repaint();			
// 		}   else if(panelName.equals("quiz2")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(quiz2);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("operator_quizAnswer1")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(qans10);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("operator_quizAnswer2")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(qans20);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("qans11")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(qans11);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("qans10")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(qans10);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("qans20")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(qans20);
// 			revalidate();
// 			repaint();
// 		} 

// 		else if(panelName.equals("test1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(test1);
// 			revalidate();
// 			repaint();			
// 		}else if(panelName.equals("test2")) {
// 			getContentPane().removeAll();
// 			getContentPane().add(test2);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("operator_testAnswer1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(tans1);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("operator_testAnswer2")){
// 			getContentPane().removeAll();
// 			getContentPane().add(tans20);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("tans1")){
// 			getContentPane().removeAll();
// 			getContentPane().add(tans1);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("tans20")){
// 			getContentPane().removeAll();
// 			getContentPane().add(tans20);
// 			revalidate();
// 			repaint();
// 		} else if(panelName.equals("tans21")){
// 			getContentPane().removeAll();
// 			getContentPane().add(tans21);
// 			revalidate();
// 			repaint();
// 		} 

// 		else if(panelName.equals("list")){
// 			getContentPane().removeAll();
// 			getContentPane().add(list);
// 			revalidate();
// 			repaint();			
// 		}
	
// 	}

// 	public static void main(String[] args){
		
// 		PanelChange win = new PanelChange();

// 		win.setSize(380,680);
// 		win.setResizable(false);
// 		win.setLocationRelativeTo(null);
		
		
// 		win.setTitle("Java¸¦ JOB¾Æ¶ó");
// 		win.list = new Chap02VariableList(win);
// 		win.var1 = new Chap02VariablePart1(win);
// 		win.var2 = new Chap02VariablePart2(win);
// 		win.var3 = new Chap02VariablePart3(win);
// 		win.var4 = new Chap02VariablePart4(win);
// 		win.var5 = new Chap02VariablePart5(win);
		
// 		win.quiz1 = new Chap02Quiz1(win);
// 		win.qans10 = new Chap02Quiz10Ans(win);
// 		win.qans11 = new Chap02Quiz11Ans(win);
// 		win.quiz2 = new Chap02Quiz2(win);
// 		win.qans20 = new Chap02Quiz20Ans(win);
		
// 		win.test1 = new Chap02Test1(win);		
// 		win.test2 = new Chap02Test2(win);
// 		win.tans1 = new Chap02Test1Ans(win);
// 		win.tans20 = new Chap02Test20Ans(win);
// 		win.tans21 = new Chap02Test21Ans(win);
		
// 		win.add(win.list);
		
// 		win.setVisible(true);
// 		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 	}
	
// >>>>>>> master
	
// }













