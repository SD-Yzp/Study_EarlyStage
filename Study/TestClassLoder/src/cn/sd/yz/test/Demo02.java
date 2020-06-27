package cn.sd.yz.test;

/**
 * 测试类加载器的层次结构、双亲委托机制
 * 
 *引导类加载器（bootstrap class loader);  //源码级别，C++，得不到类
 *扩展类加载器(extensions class loader);
 *应用类加载器(application class loader);
 *自定义类加载器(从java.lang.ClassLoader);
 * @author Yin
 *
 */
public class Demo02 
{
	public static void main(String[] args) 
	{
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
		//JAVA_HOME/jre/lib/rt.jar
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
		
		System.out.println(System.getProperty("java.class.path"));
		
		System.out.println("=============");
		String a = "yin";
		System.out.println(a.getClass().getClassLoader());
		System.out.println(a);  //即使你自定义一个java.lang.String类也会追溯到引导类加载器的java.lang.String，这就是双亲委托机制，目的是为了保护java核心库的类型安全
	}
}
