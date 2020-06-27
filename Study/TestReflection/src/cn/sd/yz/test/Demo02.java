package cn.sd.yz.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射API，获取类的信息（类的名字、属性、方法、构造器等）
 * @author Yin
 *
 */
@SuppressWarnings("all")
public class Demo02 {
	public static void main(String[] args) {
		String path = "cn.sd.yz.test.bean.User";
		
		try {
			Class clazz = Class.forName(path);
			
			//获取类的名字
			System.out.println(clazz.getName());  //获得包名+类名：cn.sd.yz.test.bean.User
			System.out.println(clazz.getSimpleName()); //获得类名：User
			
			//获取属性信息
//			Field[] fields = clazz.getFields();  //只能获取public的field  
			Field[] fields = clazz.getDeclaredFields(); //获得所有属性
			Field field = clazz.getDeclaredField("uname");			
			System.out.println(fields.length);
			System.out.println(field);
			
			//获取方法信息
			Method[] methods = clazz.getMethods();
			for(Method m:methods) {
				System.out.println("方法："+m);
			}
			Method method1 = clazz.getDeclaredMethod("getUname", null);
			System.out.println(method1);
			//如果方法有参，则必须传递参数类型对应的class对象
			Method method2 = clazz.getDeclaredMethod("setUname", String.class);
			System.out.println(method2);
			
			//获得构造器信息
			Constructor constructor1 = clazz.getConstructor();
			Constructor constructor2 = clazz.getConstructor(int.class,String.class,int.class);
			System.out.println("获得构造器："+constructor1);
			System.out.println("获得构造器："+constructor2);
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for(Constructor c:constructors) {
				System.out.println("构造器为："+c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
