package cn.sd.yz.singleton;

/**
 * 饿汉式  防止反射破解单例模式
 * @author Yin
 *
 */
public class SingleTon06 
{
	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static SingleTon06 instance = new SingleTon06();
	//构造器私有
	private SingleTon06() 
	{
		if(instance!=null)
		{
			throw new RuntimeException();
		}
	}	
	//获得常量对象的方法
	public static SingleTon06 getInstance() 
	{
		return instance;
	}
}
