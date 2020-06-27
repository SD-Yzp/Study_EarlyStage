
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//С��ĺ�����
	double y=100;//С���������
	
	double v=10;//�ٶ�
	
	double degree = 3.14/3; //����.�˴�����60��
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x,(int) y, null);
		
		if(v>0) {
			v=v-0.01;
		}else {
			v=0;
		}
		
		x = x+v*Math.cos(degree);
		y = y+v*Math.sin(degree);
		
		
		//�������±߽�
		if(y>500-40-30||y<40+40) {//500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ�������һ��40�Ǳ������߶�
			degree = -degree;
		}
		
		//�������ұ߽�
		if(x>856-40-30||x<40) {
			degree = 3.14 - degree;
		}
		
	}
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//�ػ�����,ÿ�뻭25��
		while(true) {
			repaint();
			try {
				Thread.sleep(40); //40ms,1��=1000����.��Լһ�뻭25�δ���
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	//main�����ǳ���ִ�е����
	public static void main(String[]args) {
		System.out.println("������Ϸ");
		BallGame2 game=new BallGame2();
		game.launchFrame();
	}
	
}
