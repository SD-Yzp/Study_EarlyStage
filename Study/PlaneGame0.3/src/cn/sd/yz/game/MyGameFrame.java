package cn.sd.yz.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
	
	Image huaji = GameUtil.getImage("images/huaji.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	int huajiX=0,huajiY=0;
	
	@Override
	public void paint(Graphics g) {  //自动被调用。 g相当于一支画笔
	super.paint(g);
	
	g.drawImage(bg, 0, 0, null);
	g.drawImage(huaji,huajiX,huajiY, null);
	huajiX++;
	huajiY++;
		
	}
	
	class PaintThread extends Thread{
		
		@Override
		public void run() {
			while(true) {
				repaint();   //重画窗口
			
			try {
				Thread.sleep(40);  //1s=1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   
				
			}
		}
	}
	
	public void launchFrame() {
		this.setTitle("小妹妹玩的游戏0.0");
		this.setVisible(true);
		this.setSize(474,296);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		new PaintThread().start(); //启动重画窗口的线程		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
