package cn.sd.yz.test;

/**
 * 测试自定义的FileSystemClassLoader
 * @author Yin
 *
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		FileSystemClassLoader loader = new FileSystemClassLoader("f:/myjava");
		FileSystemClassLoader loader2 = new FileSystemClassLoader("f:/myjava");
		
		Class<?> c1 = loader.loadClass("HelloWorld");
		Class<?> c2 = loader.loadClass("HelloWorld");
		Class<?> c3 = loader2.loadClass("HelloWorld");
		
		Class<?> c4 = loader2.loadClass("java.lang.String");
		Class<?> c5 = loader2.loadClass("cn.sd.yz.test.Demo01");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode()); //同一个类，被不同的加载器加载，JVM认为也是不同的类
		System.out.println(c4.hashCode());
		System.out.println(c5.hashCode());
		
		System.out.println(c3.getClassLoader()); //自定义的类加载器
		System.out.println(c4.getClassLoader()); //引导类加载器
		System.out.println(c5.getClassLoader()); //系统默认的类加载器
		
	}
}
