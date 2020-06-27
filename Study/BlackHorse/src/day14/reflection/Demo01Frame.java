package day14.reflection;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;


/**
 * 设计一个框架，在不修改代码的情况下加载各种类及其方法
 * 类和方法的名称在配置文件中Properties
 * @author Yin
 *
 */
public class Demo01Frame {

	public static void main(String[] args) throws Exception {
		
		
		//1.加载配置文件
		//1.1 创建Properties对象
		Properties pro = new Properties(); 
		//1.2 加载配置文件，转换成一个集合
		//1.2.1 获取class目录下的配置文件
		ClassLoader classLoader =  Demo01Frame.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream("pro.properties");
		pro.load(is);
		//2.获取配置文件中定义的数据
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		
		//3.加载该类进入内存
		Class cls = Class.forName(className);
		//4.创建对象
		Object obj = cls.newInstance();
		//5.获取方法
		Method m = cls.getMethod(methodName);
		//6.调用方法
		m.invoke(obj);
		
	}
	
}
