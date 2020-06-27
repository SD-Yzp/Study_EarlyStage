package cn.sd.yz.game;

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
	
	public void launchFrame() {
		this.setTitle("С���������Ϸ0.0");
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
