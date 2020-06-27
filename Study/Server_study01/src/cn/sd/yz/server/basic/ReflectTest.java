package cn.sd.yz.server.basic;

import java.lang.reflect.InvocationTargetException;

/**
 * ���䣺��java���еĸ��ֽṹ�����������ԡ���������������ӳ���һ������
 * 1����ȡClass����
 * ���ַ�ʽ���Ƽ�Class.forName("����·��")
 * 2�����Զ�̬��������
 * @author Yin
 *
 */
public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Iphone iphone = new Iphone();
		//���ַ���
		//1������.getClass()
		Class clz = iphone.getClass();
		//2����.class()
		clz = Iphone.class;
		//3��Class.forName("����.����")
		clz = Class.forName("cn.sd.yz.server.basic.Iphone");
		
		//��������
		/*�Ѿ��ϳ��ķ���
		 * Iphone iphone2 = (Iphone) clz.newInstance(); 
		 * System.out.println(iphone2);
		 */
		Iphone iphone2 = (Iphone) clz.getConstructor().newInstance();
		System.out.println(iphone2);
	}
}

class Iphone{
	
	public Iphone() {
		super();
	}
	
}