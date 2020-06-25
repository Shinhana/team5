package team5.miniProject.menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import team5.miniProject.run.PanelChange;
// <<<<<<< 20200624_chap03_1_(濚밸㉡�삕�뜝�럩�궨亦껋꼻�삕)
// import team5.miniProject.chapter.chap03.Chap03OperatorMain;
// =======
// >>>>>>> master



public class PanelList extends JPanel{

	Image image;
	private PanelChange win;
	private JTextArea memoTextField;
	
	public PanelList(PanelChange win){
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/List.png").getImage();
		
		 //筌ｌ꼷�벉占쎌몵嚥∽옙 占쎈즼占쎈툡揶쏉옙占쎈뮉 甕곌쑵�뱣
		JButton program = new JButton("�봽濡쒓렇�옩 湲곗큹&媛쒕컻�솚寃� 援ъ텞");
		program.setSize(240,30);
		program.setBorderPainted(false); //占쎈�믭옙紐®뵳占� 占쎈읂占쎌뵥占쎈샒
		program.setFocusPainted(false);
		program.setContentAreaFilled(true);//占쎈듇�몴占� 占쎈르 占쎈ご占쎈뻻占쎈쭡
		program.setLocation(70,60);
	
		add(program);
		program.addActionListener(new Program());
		
		JButton variable = new JButton("蹂��닔");
		variable.setSize(240,30);
		variable.setBorderPainted(false); //占쎈�믭옙紐®뵳占� 占쎈읂占쎌뵥占쎈샒
		variable.setFocusPainted(false);
		variable.setContentAreaFilled(true);//占쎈듇�몴占� 占쎈르 占쎈ご占쎈뻻占쎈쭡
		variable.setLocation(70,150);
		add(variable);
		variable.addActionListener(new Variable());
		
		JButton operator = new JButton("�뿰�궛�옄");
		operator.setSize(240,30);
		operator.setBorderPainted(false); //占쎈�믭옙紐®뵳占� 占쎈읂占쎌뵥占쎈샒
		operator.setFocusPainted(false);
		operator.setContentAreaFilled(true);//占쎈듇�몴占� 占쎈르 占쎈ご占쎈뻻占쎈쭡
		operator.setLocation(70,240);
		add(operator);
		operator.addActionListener(new Operator());
		
		JButton array = new JButton("諛곗뿴");
		array.setSize(240,30);
		array.setBorderPainted(false); //占쎈�믭옙紐®뵳占� 占쎈읂占쎌뵥占쎈샒
		array.setFocusPainted(false);
		array.setContentAreaFilled(true);//占쎈듇�몴占� 占쎈르 占쎈ご占쎈뻻占쎈쭡
		array.setLocation(70,430);
		add(array);
		array.addActionListener(new Array());
		
		JButton nloop = new JButton("以묒꺽諛섎났臾�");
		nloop.setSize(240,30);
		nloop.setBorderPainted(false); //占쎈�믭옙紐®뵳占� 占쎈읂占쎌뵥占쎈샒
		nloop.setFocusPainted(false);
		nloop.setContentAreaFilled(true);//占쎈듇�몴占� 占쎈르 占쎈ご占쎈뻻占쎈쭡
		nloop.setLocation(70,520);
		add(nloop);
		nloop.addActionListener(new Nloop());
		
		JButton main = new JButton("뒤로");
		main.setSize(240,30);
		main.setBorderPainted(true); //�뀒�몢由� �럹�씤�똿
		main.setFocusPainted(false);
		main.setContentAreaFilled(true);//�늻瑜� �븣 �몴�떆�맖
		main.setLocation(300,300);
		add(main);
		main.addActionListener(new Main());
		
		memoTextField =  new JTextArea();
		memoTextField.setBounds(50,520,280,100);
		memoTextField.setOpaque(false);
		memoTextField.setForeground(Color.WHITE);
		//占쎈�믭옙�뮞占쎈뱜 �⑤벀而� 占쎈�믭옙紐®뵳占� 占쎈떜疫꿸퀗由� 
		memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(memoTextField);
	}
	
	
	
	
	
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);//占쎈쐻占쎈짗占쎌굲占쎈쐻占쎈짗占쎌굲占쎈쐻占쎈뼣�ⓦ끉�굲
		super.paint(g);
	}
	
	class Program implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("program_part1");
		}
}
	class Variable implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("variable_main");
		}
}
	
	class Operator implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("operator_part1");
		}
}	
	class Array implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		win.change("array_main");
	}
}
	class Nloop implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		win.change("nloop_main");
	}
}	
// <<<<<<< 20200624chap01_1번쨰

// =======
 	class Main implements ActionListener{
 		@Override
 		public void actionPerformed(ActionEvent e){
 			win.change("main");
 		}
 	}	
// >>>>>>> master
	
}
