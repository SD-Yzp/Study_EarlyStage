package cn.sd.yz1;
/**
 * 测试继承
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
		System.out.println("休息一下!");
	}
}

class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("学习两小时！");
	}
	
	public Student(String name,int height,String major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student() {    //  如果我们没有定义构造器，则编译器会自动定义一个无参的构造函数。如果已定义则编译器不会自动添加!
	}
}
