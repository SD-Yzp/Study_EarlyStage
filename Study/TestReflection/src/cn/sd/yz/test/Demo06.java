package cn.sd.yz.test;

import java.lang.reflect.Method;

import cn.sd.yz.test.bean.User;

/**
 * 反射机制性能问题
 * @author Yin
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		test01();
		test02();
		test03();
	}
	
	public static void test01() {
		
		long time1 = System.currentTimeMillis();
		
		User u = new User();
		for(int i=0;i<1000000000L;i++) {
			u.setAge(18);
		}
		
		long time2 = System.currentTimeMillis();
		System.out.println("设置年龄十亿次的时间为："+(time2-time1)+"ms");
		
	}
	
	public static void test02() {
		long time1 = System.currentTimeMillis();
		
		String path = "cn.sd.yz.test.bean.User";
		try {
			Class clazz = Class.forName(path);
			User u = new User();
			Method m = clazz.getMethod("setAge", int.class);
//			m.setAccessible(true);
			for(int i=0;i<1000000000L;i++) {
				m.invoke(u,18);
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		long time2 = System.currentTimeMillis();
		System.out.println("设置年龄十亿次的时间为："+(time2-time1)+"ms");
	}

	public static void test03() {
long time1 = System.currentTimeMillis();
		
		String path = "cn.sd.yz.test.bean.User";
		try {
			Class clazz = Class.forName(path);
			User u = new User();
			Method m = clazz.getMethod("setAge", int.class);
			m.setAccessible(true);
			for(int i=0;i<1000000000L;i++) {
				m.invoke(u,18);
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		long time2 = System.currentTimeMillis();
		System.out.println("设置年龄十亿次的时间为："+(time2-time1)+"ms");
	}
}
