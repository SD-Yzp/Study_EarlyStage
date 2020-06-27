package cn.task4.question3;
/**
 * 显示人的姓名和年龄
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
		System.out.println("姓名："+name+"\n年龄："+age);
	}
	
	public static void main(String[]args) {
		Person y = new Person("Joker",18);
		y.display();
	}
}
