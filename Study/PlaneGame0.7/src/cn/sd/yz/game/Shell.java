package cn.sd.yz.game;

import java.awt.Color;
import java.awt.Graphics;

/**
 * �ڵ���
 * @author Yin
 *
 */
public class Shell extends GameObject{
	double degree;
	
	public Shell(){
		x=250;
		y=250;
		width=10;
		height=10;
		speed=1;
		
		degree=Math.random()*Math.PI*2;
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.YELLOW);
		
		g.fillOval((int)x, (int)y, width, height);
		
		//�ڵ���������Ƕȷ�
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		
		if(x<0||x>Constant.GAME_WIDTH-width) {
			degree = Math.PI-degree;
		}
		
		if(y<40||y>Constant.GAME_HEIGHT) {
			degree = -degree;
		}
		
		
		g.setColor(c);
	}
	
}
