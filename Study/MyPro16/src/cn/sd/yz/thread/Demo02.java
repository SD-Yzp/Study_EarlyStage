package cn.sd.yz.thread;

/**
 * 测试wait和notify
 * @author Yin
 *
 */
public class Demo02 
{
	public static void main(String[] args) 
	{
		Object obj = new Object();  //这里的对象其实就是包子
		
		new Thread(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				synchronized (obj) 
				{
					System.out.println("顾客告诉老板要吃的包子类型和数量");
					try 
					{
						obj.wait();
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("开吃");
				}
				
			}
			
			
		}).start();
		
		
		new Thread(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				synchronized (obj) 
				{					
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("5秒钟后，包子做好了");
					obj.notify();
				}
			}
		}).start();
		
		
	}
}
