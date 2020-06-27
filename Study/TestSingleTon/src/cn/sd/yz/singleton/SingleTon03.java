package cn.sd.yz.singleton;

/**
 * 双重检查锁模式  不推荐
 * @author Yin
 *
 */
public class SingleTon03 
{
	//常量对象
	private static SingleTon03 instance;
	//构造器私有
	private SingleTon03() {
		
	}	
	//获得常量对象的方法
	public static SingleTon03 getInstance() { 
	    if (instance == null) { 
	    	SingleTon03 sc; 
	      synchronized (SingleTon03.class) { 
	        sc = instance; 
	        if (sc == null) { 
	          synchronized (SingleTon03.class) { 
	            if(sc == null) { 
	              sc = new SingleTon03(); 
	            } 
	          } 
	          instance = sc; 
	        } 
	      } 
	    } 
	    return instance; 
	  }
}
