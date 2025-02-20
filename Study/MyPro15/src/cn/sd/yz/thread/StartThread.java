package cn.sd.yz.thread;

/**
 * 创建线程方式一：
 * 1、创建：继承Thread+重写run
 * 2、启动：创建子类对象+start
 * @author Yin
 *
 */
public class StartThread extends Thread{
	/**
	 * 线程入口点
	 */
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("一边听歌");
		}
	}
	
	
	public static void main(String[] args) {
		//创建子类对象
		StartThread st = new StartThread();
		//启动（注意start的启动时机）
		st.start();   //不保证立即运行，CPU调用
		//使用run方法的话就只有一条路径，而start方法是多线程同时运行
//		st.run();  
		for(int i=0;i<20;i++) {
			System.out.println("一边coding");
		}
	}
}
