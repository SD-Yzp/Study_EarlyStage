package cn.sd.yz2;
/**
 * ���Զ�̬
 * @author Yin
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		Animal d = new Dog();    //�Զ�����ת��
		animalCry(d);    //��������ָ���������
		animalCry(new Tong());
		Animal c = new Cat();
		
	//	d.seeDoor();  //������ʹ�ã���Ϊ��������Ϊd��Animal��
		
		Dog d2 = (Dog) d;
	//	Dog d3 = (Dog) c;  //���лᱨ��Cat�಻����ת��Dog��
		
		d2.seeDoor();
	//	d3.seeDoor();  //��Ȼ����û�������ǲ�������
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
}

class Animal{
	public void shout() {
		System.out.println("����һ����");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("������~");
	}
	
	public void seeDoor() {
		System.out.println("����.");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("������~");
	}
}

class Tong extends Animal{
	public void shout() {
		System.out.println("������~");
	}
}