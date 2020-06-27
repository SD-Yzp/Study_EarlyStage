package cn.sd.yz.test;

/**
 * 测试JVM运行和类加载的全过程及初始化
 * @author Yin
 *
 */
public class Demo01 
{
	static
	{
		System.out.println("静态初始化Demo01");
	}
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Demo01的main方法");
		A a;
		System.out.println(System.getProperty("java.class.path"));
		a = new A();
		
		
		System.out.println("=============");
		
		//主动引用
//		new A();
//		System.out.println(A.width);
//		Class.forName("cn.sd.yz.test.A");
		
		System.out.println("=============");
		
		//被动引用
//		System.out.println(A.MAX);
//		A[] as = new A[10];
		System.out.println(B.width);
	}
}

class B extends A
{
	static
	{
		System.out.println("静态初始化B");
	}
}


class A extends A_Father
{
	public static int width = 100; //静态变量，静态域  field
	public static final int MAX = 300;
	
	
	static 
	{
		System.out.println("静态初始化A");
		width=300;
	}
	
	public A()
	{
		System.out.println("创建A类的对象");
	}
}

class A_Father
{
	static 
	{
		System.out.println("静态初始化A_Father");
	}
}