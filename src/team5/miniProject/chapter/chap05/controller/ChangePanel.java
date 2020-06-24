//package com.kh.model.controller;
//
//import javax.swing.JFrame;
//
//import com.kh.model.chap05.Chap05Array;
//import com.kh.model.chap05.Chap05ArrayPart1;
//import com.kh.model.chap05.Chap05ArrayPart2;
//import com.kh.model.chap05.Chap05ArrayPart3;
//import com.kh.model.chap05.Chap05ArrayPart4;
//import com.kh.model.chap05.Chap05ArrayPart5;
//import com.kh.model.chap05.Chap05ArrayPart6;
//import com.kh.model.quiz.Chap05Quiz1;
//import com.kh.model.quiz.Chap05Quiz1AnsO;
//import com.kh.model.quiz.Chap05Quiz1AnsX;
//import com.kh.model.quiz.Chap05Quiz2;
//import com.kh.model.quiz.Chap05Quiz2AnsO;
//import com.kh.model.quiz.Chap05Quiz2AnsX;
//import com.kh.model.test.Chap05Test1;
//import com.kh.model.test.Chap05Test1Ans1;
//import com.kh.model.test.Chap05Test2;
//import com.kh.model.test.Chap05Test2Ans1;
//




//public class ChangePanel extends JFrame  {
//	
//	public Chap05Array jpanel1 = null;
//	public Chap05ArrayPart1 jpanel2 = null;
//	public Chap05ArrayPart2 jpanel3 = null;
//	public Chap05ArrayPart3 jpanel4 = null;
//	public Chap05ArrayPart4 jpanel5 = null;
//	public Chap05ArrayPart5 jpanel6 = null;
//	public Chap05Quiz1 jpanel7 = null;
//	public Chap05Quiz1AnsO jpanel8 = null;
//	public Chap05Quiz1AnsX jpanel9 = null;
//	public Chap05Quiz2 jpanel10 = null;
//	public Chap05Quiz2AnsO jpanel11 = null;
//	public Chap05Quiz2AnsX jpanel12 = null;
//	public Chap05Test1 jpanel13 = null;
//	public Chap05Test1Ans1 jpanel14 = null;
//	
//	public Chap05Test2	jpanel16 = null;
//	public Chap05Test2Ans1 jpanel17 = null;
//	
//	public Chap05ArrayPart6 jpanel19 =null;
//	public ChangePanel() {}
//	
//	
//	public void change(String panelName){ 
//		
//		if(panelName.equals("panel1")) {
//		
//			getContentPane().removeAll();
//			getContentPane().add(jpanel1);
//			revalidate();
//			repaint();
//		}
//		else if(panelName.equals("panel2")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel2);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel3")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel3);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel4")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel4);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel5")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel5);
//			revalidate();
//			repaint();			
//		}else if(panelName.equals("panel6")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel6);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel7")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel7);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel8")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel8);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel9")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel9);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel10")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel10);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel11")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel11);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel12")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel12);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel13")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel13);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel14")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel14);
//			revalidate();
//			repaint();		
//		}else if(panelName.equals("panel16")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel16);
//			revalidate();
//			repaint();
//		}else if(panelName.equals("panel17")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel17);
//			revalidate();
//			repaint();		
//		}else if(panelName.equals("panel19")) {
//			getContentPane().removeAll();
//			getContentPane().add(jpanel19);
//			revalidate();
//			repaint();
//		}
//	}	
//	
//	public static void main(String[] args) {
//		
//		ChangePanel ch = new ChangePanel();
//		
//		//JFrame f = new JFrame();
//		ch.setSize(340,680);
//	
//		
//		
//		ch.setTitle("Java¸¦ JOB¾Æ¶ó");
//		ch.jpanel1 = new Chap05Array(ch);
//		ch.jpanel2 = new Chap05ArrayPart1(ch);
//		ch.jpanel3 = new Chap05ArrayPart2(ch);
//		ch.jpanel4 = new Chap05ArrayPart3(ch);
//		ch.jpanel5 = new Chap05ArrayPart4(ch);
//		ch.jpanel6 = new Chap05ArrayPart5(ch);
//		ch.jpanel7 = new Chap05Quiz1(ch);
//		ch.jpanel8 = new Chap05Quiz1AnsO(ch);
//		ch.jpanel9 = new Chap05Quiz1AnsX(ch);
//		ch.jpanel10 = new Chap05Quiz2(ch);
//		ch.jpanel11 = new Chap05Quiz2AnsO(ch);
//		ch.jpanel12 = new Chap05Quiz2AnsX(ch);
//		ch.jpanel13 = new Chap05Test1(ch);
//		ch.jpanel14 = new Chap05Test1Ans1(ch);
//		
//		ch.jpanel16 = new Chap05Test2(ch);
//		ch.jpanel17 = new Chap05Test2Ans1(ch);
//		
//		ch.jpanel19 = new Chap05ArrayPart6(ch);
//		ch.add(ch.jpanel1);
//		
//		
//		
//		ch.setVisible(true);
//		ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	
//	
//}


