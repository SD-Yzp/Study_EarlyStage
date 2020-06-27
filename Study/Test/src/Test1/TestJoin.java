package Test1;

public class TestJoin {
	public static void main(String[] args) {
		System.out.println("爸爸和儿子买烟的故事");
		Son son = new Son();
		new Thread(new Father(son)).start();
	}
}

class Father implements Runnable{
	private Son son;
	
	
	
	public Father(Son son) {
		super();
		this.son = son;
	}



	@Override
	public void run() {
		System.out.println("爸爸和儿子在看电视，爸爸想抽烟发现没有了，让儿子去买烟。");
		System.out.println("爸爸给了儿子十块钱，让他去买烟");
		Thread t = new Thread(son);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("爸爸拿到烟，把剩下的钱给了儿子");
	}
	
}

class Son implements Runnable{
	@Override
	public void run() {
		System.out.println("儿子在路上看到了游戏厅，进去玩了一会");
		for(int i=0;i<10;i++)
		{	
			try {
				Thread.sleep(1000);
				System.out.println("玩了"+(i+1)+"分钟");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("想起要买烟");
		System.out.println("买了烟回家");
		System.out.println("把烟给了爸爸");
	}
}