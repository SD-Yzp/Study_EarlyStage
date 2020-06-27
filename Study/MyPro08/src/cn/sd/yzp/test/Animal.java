package cn.sd.yzp.test;

/**
 * ���������������ڣ�Ϊ�����ṩͳһ�ġ��淶��ģ�塣�������ʵ����صĳ��󷽷���
 * @author Yin
 *
 */

public abstract class Animal {   //�������󷽷���������ǳ�����
	
	//��һ��û��ʵ�֡� �ڶ����������ʵ�֡�
	abstract public void shout();
	
	public void run() {
		System.out.println("�ܰ��ܣ�");
	}
	
	
	public static void main(String[] args) {
		Animal a = new Dog();   //�����಻��new��ֻ��new����
		
		a.shout();
		a.run();
	}
	
}



class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("��������");
	}
	
}
