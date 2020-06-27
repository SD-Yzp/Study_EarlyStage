package cn.sd.yz.server.basic;

import java.lang.reflect.InvocationTargetException;

/**
 * 反射：把java类中的各种结构（方法、属性、构造器、类名）映射成一个对象
 * 1、获取Class对象
 * 三种方式：推荐Class.forName("完整路径")
 * 2、可以动态创建对象
 * @author Yin
 *
 */
public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Iphone iphone = new Iphone();
		//三种方法
		//1、对象.getClass()
		Class clz = iphone.getClass();
		//2、类.class()
		clz = Iphone.class;
		//3、Class.forName("包名.类名")
		clz = Class.forName("cn.sd.yz.server.basic.Iphone");
		
		//创建对象
		/*已经废除的方法
		 * Iphone iphone2 = (Iphone) clz.newInstance(); 
		 * System.out.println(iphone2);
		 */
		Iphone iphone2 = (Iphone) clz.getConstructor().newInstance();
		System.out.println(iphone2);
	}
}

class Iphone{
	
	public Iphone() {
		super();
	}
	
}