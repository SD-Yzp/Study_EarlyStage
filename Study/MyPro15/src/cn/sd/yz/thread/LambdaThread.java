package cn.sd.yz.thread;

/**
 * lambda���߳�
 * @author Yin
 *
 */
public class LambdaThread {
	//��̬�ڲ���
	static class Test1 implements Runnable {
		@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("һ������");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
//		new Thread(new Test1()).start();
	
		//�ֲ��ڲ���
		class Test2 implements Runnable {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("һ������");
				}
			}
		}
		
//		new Thread(new Test2()).start();
		
		//�����ڲ��� ��������ӿڻ��߸���
		new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("һ������");
				}
			}
		}).start();
		
		//jdk8�� lambda
		new Thread(()->{
			for(int i=0;i<20;i++) {
				System.out.println("һ������");
			}
		}
		).start();
	
		
	}

}
