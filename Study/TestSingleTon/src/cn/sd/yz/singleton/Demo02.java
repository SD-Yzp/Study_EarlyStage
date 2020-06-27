package cn.sd.yz.singleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射破解单例模式
 * @author Yin
 *
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		String path = "cn.sd.yz.singleton.SingleTon01";
	
		Class clz = Class.forName(path);
		Constructor<SingleTon01> constructor = clz.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingleTon01 instance = constructor.newInstance();
		SingleTon01 instance2 = constructor.newInstance();
		System.out.println("使用反射破解懒汉式单例模式创建的对象地址为："+instance);
		System.out.println("使用反射破解懒汉式单例模式创建的对象地址为："+instance2);
		

	}
}
