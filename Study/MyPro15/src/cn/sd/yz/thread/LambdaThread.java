package cn.sd.yz.thread;

/**
 * lambda简化线程
 * @author Yin
 *
 */
public class LambdaThread {
	//静态内部类
	static class Test1 implements Runnable {
		@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("一边听歌");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
//		new Thread(new Test1()).start();
	
		//局部内部类
		class Test2 implements Runnable {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("一边听歌");
				}
			}
		}
		
//		new Thread(new Test2()).start();
		
		//匿名内部类 必须借助接口或者父类
		new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("一边听歌");
				}
			}
		}).start();
		
		//jdk8简化 lambda
		new Thread(()->{
			for(int i=0;i<20;i++) {
				System.out.println("一边听歌");
			}
		}
		).start();
	
		
	}

}
