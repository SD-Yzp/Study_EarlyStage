package cn.sd.yz.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.PARAMETER})
public @interface MyAnnotation01 {
	String studentName() default "";
	int age() default 0;
	int id() default -1;  //String indexOf("abc")  -1
	
	String[] schools() default {"清华大学","中国石油大学"};
}
