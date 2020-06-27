package day07.ThreadPool;

public class MyImplements implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"我需要教练");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"结束");
	}
	
}
