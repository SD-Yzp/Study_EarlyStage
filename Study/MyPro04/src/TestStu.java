
/**
 * ���Ե�һ������
 * @author Yin
 *
 */
public class TestStu {

	//����field
	int id;
	String sname;
	int age;
	
	Computer comp;
	
	//����method
	void study() {
		System.out.println("����ѧϰ��ʹ��"+comp.brand);
	}
	void play() {
		System.out.println("������ˣ��");		
	}
	
	//����ִ�е���ڣ�����Ҫ��
	public static void main(String[]args) {
		TestStu stu = new TestStu();   //����һ������
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
