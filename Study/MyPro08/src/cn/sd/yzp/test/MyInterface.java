package cn.sd.yzp.test;

/**
 * ���Խӿ�
 * @author Yin
 *
 */

public interface MyInterface {

	/* public static final */ int MAX_AGE = 100;   //�ӿڳ���Ĭ�����δ���public static final���Ӳ��Ӷ�һ��

	/* public static */ void test01();   //�ӿڷ���Ĭ�����δ���public static���Ӳ��Ӷ�һ��

}


class MyClass implements MyInterface{

	@Override
	public void test01() {
		System.out.println(MAX_AGE);
		System.out.println("��С��~");
	}
	
}
