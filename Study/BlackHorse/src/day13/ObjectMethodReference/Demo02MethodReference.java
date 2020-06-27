package day13.ObjectMethodReference;

public class Demo02MethodReference {
	
	public static void printString(Printable p)
	{
		p.print("Hello");
	}
	
	public static void main(String[] args) 
	{
		//调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递Lambda
		printString((s)->{
			//创建MethodRefObject对象
			MethodRefObject mro = new MethodRefObject();
			//调用MethodRefObject对象中的成员方法printUpperCase，将字符串大写
			mro.printUpperCase(s);
		});
		
		
		/*
		 	使用方法引用优化Lambda
		 	对象是已经存在的MethodRefObeject
		 	成员方法也是已经存在的printUpperCase
		 	所以我们可以使用对象名引用成员方法
		 */
		MethodRefObject mro = new MethodRefObject();		
		printString(mro::printUpperCase);
	}
	
}
