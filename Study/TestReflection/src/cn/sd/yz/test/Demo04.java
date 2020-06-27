package cn.sd.yz.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import cn.sd.yz.test.annotation.SdField;
import cn.sd.yz.test.annotation.SdTable;

/**
 * 通过反射获取注释
 * @author Yin
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		String path = "cn.sd.yz.test.annotation.SdStudent";
		
		try {
			Class clazz = Class.forName(path);
			
			//获得类的所有注解
			Annotation[] annotations = clazz.getAnnotations();
			for(Annotation a:annotations) {
				System.out.println(a);
			}
			
			//获得指定注解
			SdTable st = (SdTable) clazz.getAnnotation(SdTable.class);
			System.out.println(st.value());
			
			//获得类的属性的注解
			Field f = clazz.getDeclaredField("uname");
			SdField sf = f.getAnnotation(SdField.class);
			System.out.println(sf.columnName()+"--"+sf.type()+"--"+sf.length());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
