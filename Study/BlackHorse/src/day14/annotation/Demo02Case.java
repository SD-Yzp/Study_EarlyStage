package day14.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class Demo02Case {
	public static void main(String[] args) throws Exception {
		Calculator c = new Calculator();
		Class cls = c.getClass();
				
		BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
		
		int number = 0;
		
		Method[] m = cls.getDeclaredMethods();
		
		for (Method method : m) 
		{
			if(method.isAnnotationPresent(Check.class))
			{
				try {
					method.invoke(c);
				} catch (Exception e) {
					number++;
					bw.write(method.getName()+"方法出现问题");
					bw.newLine();
					bw.write("问题的类型为："+e.getCause().getClass().getSimpleName());
					bw.newLine();
					bw.write("问题的原因为："+e.getCause().getMessage());
					bw.newLine();
					bw.write("----------------");
					bw.newLine();
				} 
			}
		}
		
		
		bw.write("出现问题的次数为："+number+"次");
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
