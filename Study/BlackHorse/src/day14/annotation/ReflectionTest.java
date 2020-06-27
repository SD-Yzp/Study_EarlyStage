package day14.annotation;

import java.lang.reflect.Method;

@Pro(className = "day14.reflection.Person",methodName = "eat")
public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		Class<ReflectionTest> cls = ReflectionTest.class;
		
		Pro an = cls.getAnnotation(Pro.class);
		
		String className = an.className();
		String methodName = an.methodName();
		
		Class cls1 = Class.forName(className);
		Object obj = cls1.newInstance();
		Method m = cls1.getMethod(methodName);
		m.invoke(obj);
	}
}
