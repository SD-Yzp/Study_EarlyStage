package cn.sd.yzp.test;

/**
 * 测试接口
 * @author Yin
 *
 */

public interface MyInterface {

	/* public static final */ int MAX_AGE = 100;   //接口常量默认修饰词是public static final，加不加都一样

	/* public static */ void test01();   //接口方法默认修饰词是public static，加不加都一样

}


class MyClass implements MyInterface{

	@Override
	public void test01() {
		System.out.println(MAX_AGE);
		System.out.println("葛小猪~");
	}
	
}
