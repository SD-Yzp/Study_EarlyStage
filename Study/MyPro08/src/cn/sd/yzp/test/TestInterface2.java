package cn.sd.yzp.test;

/**
 * ���Խӿں�ʵ����
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


//�ӿڿ���ʵ�ֶ�̳У��ӿ�C�̳нӿ�A��B
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