package cn.task4.question3;
/**
 * ��ʾ�˵�����������
 * @author Yin
 *
 */
public class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("������"+name+"\n���䣺"+age);
	}
	
	public static void main(String[]args) {
		Person y = new Person("Joker",18);
		y.display();
	}
}
