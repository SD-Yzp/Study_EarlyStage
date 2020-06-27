package cn.sd.yzp.test;

/**
 * 测试接口和实现类
 * @author Yin
 *
 */

public class TestInterface2 {
	public static void main(String[] args) {	
	}
}


interface A{
	void testa();
}


interface B{
	void testb();
}


//接口可以实现多继承：接口C继承接口A和B
interface C extends A,B{
	void testc();
}

class Mysubclass implements C{

	@Override
	public void testa() {
		System.out.println("Test.testa()");
	}

	@Override
	public void testb() {
		System.out.println("Test.testb()");
	}

	@Override
	public void testc() {
		System.out.println("Test.testc()");
	}
	
}