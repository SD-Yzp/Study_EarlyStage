package cn.sd.yz1;
/**
 * ����Object 
 * @author Yin
 *
 */
public class TestObject {
	public static void main(String[]args) {
//		Object obj;
	
		TestObject to = new TestObject();
		System.out.println(to.toString());
		
		Person2 per2 = new Person2("Joker",18);
		System.out.println(per2.toString());
	}
	
	public String toString() {   //   �޸�Object���toString����
		return "����";
	}
}

class Person2{
	String name;
	int age;
	
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+",���䣺"+age;
	}
}
