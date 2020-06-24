package team5.miniProject.chapter.chap06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.run.PanelChange;

//import game.practice.chap06.Chap06Run;

public class Chap06 extends JPanel{
      Image image;
      private PanelChange win;
   
   
   public Chap06(PanelChange win) {
      setLayout(null);
      this.win=win;
     
      image = new ImageIcon("images/homain.png").getImage();
   
      JButton btn = new JButton();
      btn.setSize(172, 81);
      btn.setLocation(100,180);
      
      
      //��ư �Ⱥ��̰� ����
      btn.setBackground(Color.WHITE);
      btn.setOpaque(false);
      btn.setBorderPainted(false); //�׵θ� ������
      btn.setFocusPainted(false);
      btn.setContentAreaFilled(false);//���� �� ǥ�õ�
      
      JButton btn1 = new JButton();
      btn1.setSize(172, 81);
      btn1.setLocation(100,380);
      
      
      //��ư �Ⱥ��̰� ����
      btn1.setBackground(Color.WHITE);
      btn1.setOpaque(false);
      btn1.setBorderPainted(false); //�׵θ� ������
      btn1.setFocusPainted(false);
      btn1.setContentAreaFilled(false);//���� �� ǥ�õ�
      
      
      
      add(btn);
      btn.addActionListener(new MyActionListener3());
      
      add(btn1);
      btn1.addActionListener(new MyActionListener4());
      
      
      
      
      
   }
   @Override 
   public void paint(Graphics g){
      g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
      setOpaque(false);//�����ϰ�
      super.paint(g);
   }
   
   class MyActionListener3 implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e){
         win.change("panel01");  //��ø�ݺ������� �̵�

      }
   }
      class MyActionListener4 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e){
             win.change("jpanel21");  //2�����迭������ �̵�
            
          }
   }
}
  