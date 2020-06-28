package team5.miniProject.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.run.PanelChange;

public class SpeedQuiz1 extends JPanel{
    Image image;
    private PanelChange win;
 
 
 public SpeedQuiz1(PanelChange win) {
    setLayout(null);
    this.win=win;
   
    image = new ImageIcon("images/speed0.png").getImage();
 
    JButton next = new JButton();
    next.setSize(150, 70);
    next.setLocation(110,240);
    
    
    //��ư �Ⱥ��̰� ����
    next.setBackground(Color.WHITE);
    next.setOpaque(false);
    next.setBorderPainted(false); //�׵θ� ������
    next.setFocusPainted(false);
    next.setContentAreaFilled(false);//���� �� ǥ�õ�
    
    JButton back = new JButton();
    back.setSize(26, 60);
    back.setLocation(22,525);
    
    
    //��ư �Ⱥ��̰� ����
    back.setBackground(Color.WHITE);
    back.setOpaque(false);
    back.setBorderPainted(false); //�׵θ� ������
    back.setFocusPainted(false);
    back.setContentAreaFilled(false);//���� �� ǥ�õ�
    
    
    
    add(next);
    next.addActionListener(new Next());
    
    add(back);
    back.addActionListener(new Back());
    
    
    
    
    
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
       win.change("speedquiz2");  //��ø�ݺ������� �̵�

    }
 }
    class Back implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
           win.change("JPanelGame");  //2�����迭������ �̵�
          
        }
 }
}