package cn.sd.yz1;
/**
 * ������д
 * @author Yin
 *
 */
public class TestOverride {
	public static void main(String[]args) {
		Horse h = new Horse();
		h.run();
	}
}

class Vehicle{
	public void run() {
		System.out.println("��...");
	}
	
	public void stop() {
		System.out.println("ͣ...");
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("�N�N�N...");
	}
	
	public Student whoIsPsg() {  // ����ֵ����С�ڵ��ڸ��������
		return new Student();
	}
}