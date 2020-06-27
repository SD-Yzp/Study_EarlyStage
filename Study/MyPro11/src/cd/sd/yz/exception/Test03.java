package cd.sd.yz.exception;

/**
 * 自定义异常(继承RuntimeException)
 * @author Y
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-10);
				
	}
}

class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			throw new IllegalAgeException1("年龄不能为负数！");
		}
		
		this.age = age;
	}
	
}

class IllegalAgeException1 extends RuntimeException{
	public IllegalAgeException1(){
	}
	
	public IllegalAgeException1(String msg) {
		super(msg);
	}
}