package cd.sd.yz.exception;

/**
 * �Զ����쳣(�̳�Exception)
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
				throw new IllegalAgeException2("���䲻��Ϊ������");
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