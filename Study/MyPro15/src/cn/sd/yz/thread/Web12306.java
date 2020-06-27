package cn.sd.yz.thread;

/**
 * ������Դ������
 * @author Yin
 *
 */
public class Web12306 implements Runnable {
	private int tickets = 99;

	@Override
	public void run() {
		while(tickets>0) {
			//ģ����ʱ
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--->"+tickets--); //ע�⣺tickets--��ò�Ҫ������ߣ���Ϊ���߳̿���ͬʱִ��
		}
	}
	
	public static void main(String[] args) {
		//创建一个对象
		Web12306 web = new Web12306();
		//多个线程共享一个资源
		new Thread(web,"黄牛A").start();;
		new Thread(web,"黄牛B").start();
		new Thread(web,"黄牛C").start();;
		
		
	}
	
}
