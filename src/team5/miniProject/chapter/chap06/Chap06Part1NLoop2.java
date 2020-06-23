package game.practice.chap06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Chap06Part1NLoop2 extends JPanel{
	//ImageIcon icon1 = new ImageIcon("C:\\Users\\hojong\\eclipse-workspace\\SoloProject\\src\\game\\practice\\img\\목차로.png");
	//ImageIcon icon2 = new ImageIcon("C:\\Users\\hojong\\eclipse-workspace\\SoloProject\\src\\game\\practice\\images\\icon.png");
	
	private JTextArea memoTextField;
	private JTextField textField;
	private JPasswordField passwordField;
	private Chap06Run win;
	Image image;
	
	public Chap06Part1NLoop2(Chap06Run win){
		setLayout(null);
		this.win = win;
		
//		JLabel lblLbl = new JLabel("아이디");
//		lblLbl.setBounds(31,40,67,15);
//		add(lblLbl);
//		
//		textField = new JTextField();
//		textField.setBounds(123,40,116,21);
//		add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblLbl_1  = new JLabel("암호");
//		lblLbl_1.setBounds(31,84,67,15);
//		add(lblLbl_1);
//		
//		passwordField = new JPasswordField();
//		passwordField.setBounds(123,84,116,21);
//		add(passwordField);
		
		 image = new ImageIcon("images/중첩2.png").getImage();
		
		JButton back  = new JButton();
		back .setSize(20,20);
		back .setLocation(170,615);
		add(back );
		back .addActionListener(new Back());
		back .setBorderPainted(false);
		back .setFocusPainted(false);
		back .setContentAreaFilled(false);
		
		JButton next  = new JButton();
		next .setSize(20,20);
		next .setLocation(205,615);
		add(next );
		next .addActionListener(new Next());
		next .setBorderPainted(false);
		next .setFocusPainted(false);
		next .setContentAreaFilled(false);
		
		JButton last = new JButton();
		last.setSize(20,20);
		last.setLocation(230,615);
		add(last);
		last.addActionListener(new Last());
		last .setBorderPainted(false);
		last .setFocusPainted(false);
		last .setContentAreaFilled(false);
		
		JButton start  = new JButton();
		start .setSize(20,20);
		start .setLocation(150,615);
		add(start);
		start .addActionListener(new Start());
		start  .setBorderPainted(false);
		start  .setFocusPainted(false);
		start  .setContentAreaFilled(false);
		
		JButton reset  = new JButton();
		reset .setSize(20,20);
		reset .setLocation(115,615);
		add(reset );
		reset .addActionListener(new Reset());
		reset.setBorderPainted(false);
		reset.setFocusPainted(false);
		reset.setContentAreaFilled(false);
		
		memoTextField =  new JTextArea();
	    memoTextField.setBounds(50,520,280,100);
	    memoTextField.setOpaque(false);
	    memoTextField.setForeground(Color.WHITE);
	    memoTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	 
	    add(memoTextField);
		
		
		
		
		}
	
		@Override 
		public void paint(Graphics g){
			g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
			setOpaque(false);//투명하게
			super.paint(g);
		}
		
		class Back implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel01");
		}
	}
		class Next implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("panel02_2");
			}
		}
		class Last implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("panel04");//
			}
		
		}
		class Start implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("panel01");//
			}
		
		}
		class Reset implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				win.change("list");//
			}
		}
	
	}

