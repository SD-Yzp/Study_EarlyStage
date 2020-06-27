package cn.sd.yz.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉式  防止反射破解单例模式
 * 防止反序列化破解单例模式
 * @author Yin
 *
 */
public class SingleTon07 implements Serializable
{
	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static SingleTon07 instance = new SingleTon07();
	//构造器私有
	private SingleTon07() 
	{
		if(instance!=null)
		{
			throw new RuntimeException();
		}
	}	
	//获得常量对象的方法
	public static SingleTon07 getInstance() 
	{
		return instance;
	}
	
	private Object readResolve() throws ObjectStreamException
	{
		return instance;
	}
}
