package cn.sd.yz1;
/**
 * ���Լ̳�
 * @author Yin
 *
 */
public class TestExtends {
	public static void main(String[]args) {
		Student stu = new Student();
		stu.name = "Joker";
		stu.height = 175;
		stu.rest();
		
		Student stu2 = new Student("zhuzhu",172,"fibre-optical");
		
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof Person);
		System.out.println(new Person() instanceof Student);
		
	}
}

class Person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("��Ϣһ��!");
	}
}

class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("ѧϰ��Сʱ��");
	}
	
	public Student(String name,int height,String major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student() {    //  �������û�ж��幹����������������Զ�����һ���޲εĹ��캯��������Ѷ���������������Զ����!
	}
}
