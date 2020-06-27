package cn.sd.yz.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import cn.sd.yz.test.bean.User;

/**
 * 通过反射API动态的操作：构造器、方法、属性
 * @author Yin
 *
 */
@SuppressWarnings("all")
public class Demo03 {
	public static void main(String[] args) {
		String path = "cn.sd.yz.test.bean.User";
		
		try {
			Class<User> clazz = (Class<User>) Class.forName(path);
			
			//通过反射API调用构造方法，构造对象
			Constructor<User> c1 = clazz.getConstructor();  //无参构造，目前不推荐clazz.newInstance()方法
			User u = c1.newInstance();
			System.out.println(u);
			Constructor<User> c2 = clazz.getConstructor(int.class,String.class,int.class);
			User u2 = c2.newInstance(100,"莹莹",18);
			System.out.println(u2.getUname());
			
			//通过反射API调用普通方法
			User u3 = c1.newInstance();
			Method method = clazz.getMethod("setUname", String.class);
			method.invoke(u3, "猪猪");   //u3.setUname("猪猪");
			System.out.println(u3.getUname());
			
			//通过反射API操作属性
			User u4 = c1.newInstance();
			Field f = clazz.getDeclaredField("uname");
			//如果没有setAccessible方法，那么私有属性不可以set
			f.setAccessible(true);  //这个属性不需要安全检查了，可以直接访问
			f.set(u4, "大葛");       //通过反射直接写属性
			System.out.println(u4.getUname());  
			System.out.println(f.get(u4));   //通过反射直接读属性
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
