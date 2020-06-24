package team5.miniProject.chapter.chap06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import team5.miniProject.run.PanelChange;



public class Chap06Part1NLoop4 extends JPanel{
	private JTextField textField;
	private JPasswordField passwordField;
	private PanelChange win;
	Image image;
	private JTextArea memoTextField;
	public Chap06Part1NLoop4(PanelChange win){
		
		setLayout(null);
		this.win = win;
		this.setBackground(Color.black);
		
		image = new ImageIcon("images/NL4.png").getImage();

		
		JButton next  = new JButton();
		next .setSize(20,20);
		next .setLocation(205,615);
		add(next );
		next .addActionListener(new Next());
		next .setBorderPainted(false);
		next .setFocusPainted(false);
		next .setContentAreaFilled(false);
		
		
		
		
		JButton back  = new JButton();
		back .setSize(20,20);
		back .setLocation(170,615);
		add(back );
		back .addActionListener(new Back());
		back .setBorderPainted(false);
		back .setFocusPainted(false);
		back .setContentAreaFilled(false);
		
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
			setOpaque(false);//�����ϰ�
		super.paint(g);
		
	}
		class Next implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panel04");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
		}
		class Back implements ActionListener{
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
				win.change("panellist");//
			}
		}
	
		}

