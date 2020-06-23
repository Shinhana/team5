package team5.miniProject.chapter.chap06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import game.practice.chap06.Chap06Run;

public class Chap06 extends JPanel{
      Image image;
      private Chap06Run win;
   
   
   public Chap06(Chap06Run win) {
      setLayout(null);
      this.win=win;
     
      image = new ImageIcon("images/호종.png").getImage();
   
      JButton btn = new JButton();
      btn.setSize(172, 81);
      btn.setLocation(100,180);
      
      
      //버튼 안보이게 숨김
      btn.setBackground(Color.WHITE);
      btn.setOpaque(false);
      btn.setBorderPainted(false); //테두리 페인팅
      btn.setFocusPainted(false);
      btn.setContentAreaFilled(false);//누를 때 표시됨
      
      JButton btn1 = new JButton();
      btn1.setSize(172, 81);
      btn1.setLocation(100,380);
      
      
      //버튼 안보이게 숨김
      btn1.setBackground(Color.WHITE);
      btn1.setOpaque(false);
      btn1.setBorderPainted(false); //테두리 페인팅
      btn1.setFocusPainted(false);
      btn1.setContentAreaFilled(false);//누를 때 표시됨
      
      
      
      add(btn);
      btn.addActionListener(new MyActionListener3());
      
      add(btn1);
      btn1.addActionListener(new MyActionListener4());
      
      
      
      
      
   }
   @Override 
   public void paint(Graphics g){
      g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
      setOpaque(false);//투명하게
      super.paint(g);
   }
   
   class MyActionListener3 implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e){
         win.change("panel01");  //중첩반복문으로 이동

      }
   }
      class MyActionListener4 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e){
             win.change("jpanel21");  //2차원배열문으로 이동
            
          }
   }
}
  