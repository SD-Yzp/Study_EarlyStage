package cn.sd.yz.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
	
	Plane plane = new Plane(huaji,0,0);

	
	
	
	@Override
	public void paint(Graphics g) {  //自动被调用。 g相当于一支画笔
	super.paint(g);
	
	g.drawImage(bg, 0, 0, null);

	plane.drawSelf(g);  //画出滑稽

		
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
	
	//定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
		
		
	}
	
	/**
	 * 初始化窗口
	 */
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
	addKeyListener(new KeyMonitor());  //给窗口增加键盘的监听
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
