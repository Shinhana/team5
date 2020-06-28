package  team5.miniProject.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import team5.miniProject.run.PanelChange;

public class SpeedQuizAns extends JPanel{
    Image image;
    private PanelChange win;
 
 
 public SpeedQuizAns(PanelChange win) {
    setLayout(null);
    this.win=win;
   
    image = new ImageIcon("images/ok.png").getImage();
 
    JButton next = new JButton();
    next.setSize(380, 680);
    next.setLocation(0,0);
    
    
    //��ư �Ⱥ��̰� ����
    next.setBackground(Color.WHITE);
    next.setOpaque(false);
    next.setBorderPainted(false); //�׵θ� ������
    next.setFocusPainted(false);
    next.setContentAreaFilled(false);//���� �� ǥ�õ�
    

    
    add(next);
    next.addActionListener(new Next());
    
    
    
    
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
       win.change("JPanelGame");  //��ø�ݺ������� �̵�

    }
 }
}