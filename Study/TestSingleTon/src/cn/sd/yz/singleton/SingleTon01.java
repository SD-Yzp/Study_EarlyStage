package cn.sd.yz.singleton;

import java.io.Serializable;

/**
 * 饿汉式  
 * @author Yin
 *
 */
public class SingleTon01 implements Serializable
{
	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static SingleTon01 instance = new SingleTon01();
	//构造器私有
	private SingleTon01() {
		
	}	
	//获得常量对象的方法
	public static SingleTon01 getInstance() 
	{
		return instance;
	}
}
