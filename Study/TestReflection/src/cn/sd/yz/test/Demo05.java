package cn.sd.yz.test;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import cn.sd.yz.test.bean.User;

public class Demo05 {
	public static void test01(Map<String,User> map,List<User> list) {
		System.out.println("Demo05.test01");
	}
	
	public static Map<String,User> test02(){
		System.out.println("Demo05.test02");
		return null;
	}
	
	public static void main(String[] args) {
		String path = "cn.sd.yz.test.Demo05";
		
		try {
			Class clazz = Class.forName(path);
			
			//获得指定方法参数泛型信息
			Method m1 = clazz.getMethod("test01", Map.class,List.class);
			Type[] t1 = m1.getGenericParameterTypes();
			for(Type paraType:t1) {
				System.out.println("#"+paraType);
				if(paraType instanceof ParameterizedType) {
					Type[] genericTypes = ((ParameterizedType) paraType).getActualTypeArguments();
					for(Type genericType:genericTypes) {
						System.out.println("泛型类型："+genericType);
					}
				}
			}
			
			//获得指定方法返回值泛型信息
			Method m2 = clazz.getMethod("test02", null);
			Type t2 = m2.getGenericReturnType();
			System.out.println("#"+t2);
			if(t2 instanceof ParameterizedType) {
				Type[] genericTypes = ((ParameterizedType) t2).getActualTypeArguments();
				for(Type genericType:genericTypes) {
					System.out.println("返回值，泛型类型："+genericType);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
