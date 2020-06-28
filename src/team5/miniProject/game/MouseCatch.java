package team5.miniProject.game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import team5.miniProject.run.PanelChange;

public class MouseCatch extends JPanel {
	Image image;
	private PanelChange win;
	
	public MouseCatch(PanelChange win){
		setLayout(null);
		this.win = win;
		
		image = new ImageIcon("images/back4.jpg").getImage();
		
		new MouseCatch.mousePanel() {
			
	
		};
	
	}
	@Override 
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	class mousePanel implements Runnable, ImageObserver{
		 ArrayList<Point> data = new ArrayList<Point>();
	        JLabel label = new JLabel("0초");//시간 출력 라벨
	        TimerThread3 th;
	        Image imageMain;
	        
	        mousePanel(){
	        	 setLayout(null);
	             //배경 이미지
	             //imageMain = new ImageIcon("images/java.jpg").getImage();
	             th = new TimerThread3(label);
	             label.setBounds(310, 10, 130, 50);//시간 출력 라벨 위치와 크기 설정
	             add(label);
	             th.start();//타이머 시작
	        	
	             for (int i = 0; i < 20; i++)//위치 20개를 생성해서 저장6
	             {
	                 int x = (int) (Math.random() * (380 - 50)); //패널의 범위 내에서 선택
	                 int y = (int) (Math.random() * (680 - 50)); //타이머가 있는 범위 제외한 곳에서 랜덤 위치에
	                 Point p = new Point(x, y);
	                 data.add(p);
	             }
	             addMouseListener(new MouseAdapter()
	             {
	                 @Override
	                 public void mousePressed(MouseEvent e)//마우스를 누루면
	                 {
	                     for (int i = 0; i < data.size(); i++)
	                     {
	                         Point p = data.get(i);
	                         Rectangle rect = new Rectangle(p.x, p.y, 130, 90);
	                         if (rect.contains(e.getPoint()))//마우스 위치랑 그림과 충돌하면
	                         {
	                             data.remove(i);//위치 삭제
	                             break;
	                         }
	                     }
	                     if (data.size() == 0)//다 없애면 타이머 종료
	                     {
	                     	 th.isRun = false;//타이머 종료
	                     	int result=JOptionPane.showConfirmDialog(null,"기록 : "+TimerThread3.n+"초, 계속하시겠습니까?","Confirm",JOptionPane.YES_NO_OPTION);
	                     	if(result == JOptionPane.YES_OPTION){
	                     	
	                     	}
	                        
	                        
	                     }
	                     repaint();
	                 }

	             });
	             
	             new Thread(this).start();
	             
	        }
	        public void paint(Graphics d){
	    		d.drawImage(imageMain, 0, 0, getWidth(),getHeight(),this);
	    		setOpaque(false);
	    		paint(d);
	    	}
	        ImageIcon normalIcon = new ImageIcon("images/java2.png");
	        Image btn = normalIcon.getImage();
	        
	        public void paintComponent(Graphics d)
	        {
	            //super.paintComponent(g);

	            for (int i = 0; i < data.size(); i++)//들어있는 위치로 그려주기
	            {
	                Point p = data.get(i);
	                d.drawImage(btn, p.x, p.y, 50, 50, this);
	            }            
	        }
	        
	        public void run()
	        {
	            while (true)
	            {
	                for (int i = 0; i < data.size(); i++)//들어있는 위치를 변경
	                {
	                    Point p = data.get(i);
	                    p.x = (int) (Math.random() * (380 - 130)); //패널의 범위 내에서 선택
	                    p.y = (int) (Math.random() * (680 - 90)); //타이머가 있는 범위 제외한 곳에서 랜덤 위치에
	                }

	                repaint(); //나오게 함

	                try
	                {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e)
	                {
	                    return;
	                } //쥐가 나오는 위치를 랜덤하게 갱신                
	            }
	        }

			@Override
			public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				return false;
			}
	        
	        
	 }
}
class TimerThread3 extends Thread
{
    JLabel timerLabel;
    boolean isRun = true;
    public static int n=0;
    public TimerThread3(JLabel timerLabel)
    {
        this.timerLabel = timerLabel;
    }

    public void run()
    {
       
        while (isRun)
        {
            timerLabel.setText(n + "");
            timerLabel.setFont(new Font("Gothic",Font.ITALIC,50));
            n++;
            timerLabel.repaint();
            try
            {
                Thread.sleep(500);//밀리세컨드                
                
                if (n == 100)
                {
                	 
                    n = 0;
                }
            } catch (InterruptedException e)
            {
                return;
            }
        }
    }
}