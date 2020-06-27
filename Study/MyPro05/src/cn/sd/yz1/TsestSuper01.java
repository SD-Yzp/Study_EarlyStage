package cn.sd.yz1;
/**
 * 测试super类
 * @author Yin
 *
 */
public class TsestSuper01 {
	public static void main(String[] args) {
		new ChildClass().f();
	}
}

class FatherClass{
	public int value;
	public void f() {
		value = 1000;
		System.out.println("FatherClass.value="+value);
	}
}

class ChildClass extends FatherClass{
	public int value;
	public void f() {
		super.f(); //调用父类对象的普通方法
		value = 200;
		System.out.println("ChildClass.value="+value);
		System.out.println(value);
		System.out.println(super.value); //调用父类对象的成员变量
	}
}