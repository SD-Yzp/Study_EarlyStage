package Test1;

public class TestThread {
	public static void main(String[] args) {
		new MyThread().start();
		new Thread(new MyRunnable()).start();
	}
}


class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{			
			System.out.println("777777777");
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{			
			System.out.println("888888888888");		
		}
	}
	
}