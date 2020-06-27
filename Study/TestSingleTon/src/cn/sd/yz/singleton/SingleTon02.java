package cn.sd.yz.singleton;

/**
 * 懒汉式  延时加载，效率低
 * @author Yin
 *
 */
public class SingleTon02 
{
	//常量对象
	private static SingleTon02 instance;
	//构造器私有
	private SingleTon02() {
		
	}	
	//获得常量对象的方法
	public static synchronized SingleTon02 getInstance() 
	{
		if(instance==null)
		{
			instance = new SingleTon02();
		}
		return instance;
	}
}
