package team5.miniProject.menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import team5.miniProject.run.PanelChange;

public class JPanel_Login extends JPanel{
	//���� ������ �������� ����(���� �����ڰ� �ƴ� �޼ҵ忡�� �����ؼ� �̺�Ʈ ó���� �ؾ� �Ǳ� ����)
	//BufferedImage img = null;
	JTextField loginTextField;
	JPasswordField passwordField;
	JButton btn;
	//���� �̹���,�ؽ�Ʈ�ʵ�,��й�ȣ�ʵ�,��ư
	Image image;
	private PanelChange win;
	
	//������
	public JPanel_Login(PanelChange win){
		
		this.win=win;
		//setTitle("�α��� �׽�Ʈ");
		setSize(1200,700);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//���̾ƿ����� , ��������ó�� ó���� ���� JLayeredPane
		setLayout(null);
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,1200,700);
		layeredPane.setLayout(null);
		
			
		
		//�г�1
		//�̹��� �޾ƿ���
//		try{
//			img = ImageIO.read(new File("C:\\Users\\JMKIM\\eclipse-workspace\\SoloProject\\src\\game\\practice\\img\\login_redesign2.png"));
//		}catch(IOException e){
//			System.out.println("�ȳ�");
//			System.exit(0);
//			
//		}
		image = new ImageIcon("images/login_redesign2.png").getImage();
		
		MyPanel panel = new MyPanel();
		//setLayout�� null������ �����߱⶧���� �г���ġ�� �ٽ� ����
		panel.setBounds(0,0,1200,700);
		
		//�α��� ����
		//�α��� �ʵ� ,15���� ����
		loginTextField = new JTextField(15);
		//��ġ ���밪 ����
		loginTextField.setBounds(150,220,280,30);
		//�������� ���̾�� �ʵ忡 text�ʵ带 �־�޶�
		layeredPane.add(loginTextField);
		//Ŀ���͸���¡ ó��
		loginTextField.setOpaque(false);
		//���� �� ����
		loginTextField.setForeground(Color.WHITE);
		loginTextField.setSize(80, 100);
		//�ؽ�Ʈ �ʵ��� ��輱�� ����
		loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		//�н�����
		passwordField = new JPasswordField(15);
		passwordField.setBounds(150,370,280,30);
		//Ŀ���͸���¡ ó��		
		//��й�ȣ ����
		passwordField.setOpaque(false);
		//���� �� ����
		passwordField.setForeground(Color.WHITE);
		loginTextField.setSize(80, 100);
		passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		//�������� ���̾�� �ʵ忡 �н����� �ʵ带 �־�޶�
		layeredPane.add(passwordField);
		
		
		//�α��� ��ư �߰�
		btn = new JButton(new ImageIcon("images/Group 63.png"));
		btn.setBounds(40,480,274,58);
		
		
		//�α��� ��ư ����ó��
		
		//��ư���� ��� ����� ���������� ��ȯ
		//btn.setBackground(Color.black);
		
		//��輱�� ����ȭ
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(true);
		btn.addActionListener(new MyActionListener3());
		
		
	
		layeredPane.add(btn);
		//�������߰���
		//�ݵ�� layeredPane�� ���� �������� add�������. 
		//�г��� jframe�� �߰���Ŵ
		layeredPane.add(panel);
		add(layeredPane);
		setVisible(true);
		
		
	}
	class MyPanel extends JPanel{
		//JPanel�� �׸��� �׸��ڴٴ� �޼ҵ�
		public void paint(Graphics g){
			g.drawImage(image,0,0,null);
			//������ �̹���(img) �ҷ�����
		}
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			win.change("panellist");  //�ڹ� ȯ�汸�� ->��ο�, �ٺ� -> ���̵�,��ȣ
			//win.change("panel02"); // �ڹ� ȯ�汸��->��ο� ,�ٺ� 
		}
	}
	
}
