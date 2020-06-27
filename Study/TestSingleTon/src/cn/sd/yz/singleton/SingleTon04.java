package cn.sd.yz.singleton;

/**
 * 静态内部类
 * 线程安全、调用效率高、实现了延时加载
 * @author Yin
 *
 */
public class SingleTon04 
{
	//静态内部类
	private static class SingleInstance 
	{
		private static final SingleTon04 instance = new SingleTon04();
	}

	//私有的构造方法
	private SingleTon04() 
	{
	
	}
	
	//获得对象的方法
	public static SingleTon04 getInstance() 
	{
		return SingleInstance.instance;
	}
	
}
