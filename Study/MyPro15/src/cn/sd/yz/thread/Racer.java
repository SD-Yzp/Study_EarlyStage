package cn.sd.yz.thread;

/**
 * 模拟龟兔赛跑
 * @author Yin
 *
 */
public class Racer implements Runnable {
	private static String winner;  //胜利者

	@Override
	public void run() {
		for(int steps=1;steps<=100;steps++) {
			//模拟休息
			if(Thread.currentThread().getName().equals("rabbit")||(steps%10==0)) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName()+"--->"+steps);
			boolean flag = gameOver(steps);
			if(flag) {
				break;
			}
		}
	}
	
	public boolean gameOver(int steps) {
		if(winner!=null) {
			return true;
		}else if(steps==100) {
			winner=Thread.currentThread().getName();
			System.out.println(winner);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//一份资源
		Racer racer = new Racer();
		//多个代理				
		new Thread(racer,"rabbit").start();
		new Thread(racer,"tortoise").start();
		
		
	}
}
