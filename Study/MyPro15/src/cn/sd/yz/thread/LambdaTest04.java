package cn.sd.yz.thread;

public class LambdaTest04 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {			
					System.out.println("“ª±ﬂ—ßœ∞lambda");
				}
			}
		}).start();
		
		new Thread(
				()->System.out.println("“ª±ﬂ±¿¿£")
				).start();
		
		
	}
}
