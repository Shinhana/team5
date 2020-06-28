package team5.miniProject.menu;

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

public class JPanelMode extends JPanel{
      Image image;
      private PanelChange win;
   
   
   public JPanelMode(PanelChange win) {
      setLayout(null);
      this.win=win;
     
      image = new ImageIcon("images/panelmode.png").getImage();
   
      JButton single = new JButton();
      single.setSize(150, 170);
      single.setLocation(97,64);
      
      
      //��ư �Ⱥ��̰� ����
      single.setBackground(Color.WHITE);
      single.setOpaque(false);
      single.setBorderPainted(false); //�׵θ� ������
      single.setFocusPainted(false);
      single.setContentAreaFilled(false);//���� �� ǥ�õ�
      
      JButton minigame = new JButton();
      minigame.setSize(150, 170);
      minigame.setLocation(97,305);
      
      
      //��ư �Ⱥ��̰� ����
      minigame.setBackground(Color.WHITE);
      minigame.setOpaque(false);
      minigame.setBorderPainted(false); //�׵θ� ������
      minigame.setFocusPainted(false);
      minigame.setContentAreaFilled(false);//���� �� ǥ�õ�
      
      JButton messenger = new JButton();
      messenger.setSize(77, 60);
      messenger.setLocation(141,539);
      
      
    
      messenger.setBackground(Color.WHITE);
      messenger.setOpaque(false);
      messenger.setBorderPainted(false); 
      messenger.setFocusPainted(false);
      messenger.setContentAreaFilled(false);
      
      
      
      add(single);
      single.addActionListener(new Single());
      
      add(minigame);
      minigame.addActionListener(new Minigame());
      
      add(messenger);
      messenger.addActionListener(new Messenger());
      
      
      
   }
   @Override 
   public void paint(Graphics g){
      g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
      setOpaque(false);//�����ϰ�
      super.paint(g);
   }
   
   class Single implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e){
         win.change("panellist");  //��ø�ݺ������� �̵�

      }
   }
      class Minigame implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e){
             win.change("JPanelGame");  //2�����迭������ �̵�
            
          }
   
}
  class Messenger implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e){
         win.change("darray_part1");  //2�����迭������ �̵�
        
      }
}
}