package cn.sd.yz.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo02 {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("cn.sd.yz.annotation.SdStudent");
			
			//获得类的所有有效注解
			Annotation[] annotations = clazz.getAnnotations();
			for(Annotation a:annotations) {
				System.out.println(a);
			}
			
			//获得类的指定注解
			SdTable st = (SdTable) clazz.getAnnotation(SdTable.class);
			System.out.println(st.value());
			
			//获得类的属性的注解
			Field f = clazz.getDeclaredField("studentName");
			SdField sf = f.getAnnotation(SdField.class);
			System.out.println(sf.columnName()+"--"+sf.type()+"--"+sf.length());
			
			//根据获得的表名、字段信息，拼出DDL语句，然后使用JDBC执行这个SQL，在数据库中生成相关的表
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
