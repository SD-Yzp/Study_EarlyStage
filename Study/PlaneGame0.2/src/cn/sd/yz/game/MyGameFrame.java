package cn.sd.yz.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sound.midi.SysexMessage;
import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author Yin
 *
 */
public class MyGameFrame extends JFrame{
	
		
		
	
		@Override
		public void paint(Graphics g) {  //自动被调用。 g相当于一支画笔
		super.paint(g);
		
		Color c = g.getColor();
		Font f=g.getFont();
		
		
		g.drawLine(100,100,300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 40, 40);
		g.setColor(Color.BLUE);
		g.setFont(new Font("宋体", Font.BOLD, 50));
		g.drawString("葛小猪", 200, 200);
		
		g.setColor(c);
		g.setFont(f);
		}
	
	public void launchFrame() {
		this.setTitle("小妹妹玩的游戏0.0");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
