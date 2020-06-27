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
 * �ɻ���Ϸ��������
 * @author Yin
 *
 */
public class MyGameFrame extends JFrame{
	
	Image huaji = GameUtil.getImage("images/huaji.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(huaji,0,0);

	
	
	
	@Override
	public void paint(Graphics g) {  //�Զ������á� g�൱��һ֧����
	super.paint(g);
	
	g.drawImage(bg, 0, 0, null);

	plane.drawSelf(g);  //��������

		
	}
	
	class PaintThread extends Thread{
		
		@Override
		public void run() {
			while(true) {
				repaint();   //�ػ�����
			
			try {
				Thread.sleep(40);  //1s=1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   
				
			}
		}
	}
	
	//������̼������ڲ���
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
	 * ��ʼ������
	 */
	public void launchFrame() {
	this.setTitle("С���������Ϸ0.0");
	this.setVisible(true);
	this.setSize(474,296);
	this.setLocation(300,300);
		
	this.addWindowListener(new WindowAdapter() {
			
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
			
	});
		
	new PaintThread().start(); //�����ػ����ڵ��߳�		
	addKeyListener(new KeyMonitor());  //���������Ӽ��̵ļ���
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
