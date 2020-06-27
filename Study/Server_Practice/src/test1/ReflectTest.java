package test1;

/**
 * 测试反射获取类的三种方法
 * @author Yin
 *
 */
public class ReflectTest {
	public static void main(String[] args) throws Exception {
		//三种方式
		//1、对象.getClass()
		Iphone iphone = new Iphone();
		Class clz = iphone.getClass();
		//2、类.class()
		clz = Iphone.class;
		//3、Class.forName("包名.类名")
		clz = Class.forName("test1.Iphone");
		
		//创建对象
//		Iphone iphone2 = (Iphone) clz.newInstance();   //尽量不要用这种方法
		Iphone iphone2 = (Iphone) clz.getConstructor().newInstance();
		System.out.println(iphone2);
	}
}

class Iphone {

	public Iphone() {
		super();
	}	
}