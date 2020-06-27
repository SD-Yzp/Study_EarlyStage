
/**
 * 测试第一个方法
 * @author Yin
 *
 */
public class TestStu {

	//属性field
	int id;
	String sname;
	int age;
	
	Computer comp;
	
	//方法method
	void study() {
		System.out.println("我在学习。使用"+comp.brand);
	}
	void play() {
		System.out.println("我在玩耍。");		
	}
	
	//程序执行的入口，必须要有
	public static void main(String[]args) {
		TestStu stu = new TestStu();   //创建一个对象
		stu.id=18140039;
		stu.sname="Joker";
		stu.age=18;
		
		Computer c1 = new Computer();
		c1.brand="DELL";
		stu.comp=c1;
		
		stu.study();
		
		stu.play();

	}	
}

class Computer{
	String brand;
}
