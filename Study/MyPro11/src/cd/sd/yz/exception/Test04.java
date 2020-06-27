package cd.sd.yz.exception;

/**
 * 自定义异常(继承Exception)
 * @author Y
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Boy b = new Boy();
		b.setAge(-10);
				
	}
}

class Boy{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			try {
				throw new IllegalAgeException2("年龄不能为负数！");
			} catch (IllegalAgeException2 e) {
				e.printStackTrace();
			}
		}
		
		this.age = age;
	}
	
}

class IllegalAgeException2 extends Exception{
	public IllegalAgeException2(){
	}
	
	public IllegalAgeException2(String msg) {
		super(msg);
	}
}