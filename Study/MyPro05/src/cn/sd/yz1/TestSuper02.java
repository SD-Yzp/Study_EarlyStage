package cn.sd.yz1;
/**
 * 测试super方法
 * @author Yin
 *
 */
public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象....");
		new ChildClass2();
	}
}

class FatherClass2{
	public FatherClass2() {
	//	super(); // 不加也会自动调用，尽量不要在构造方法里加一些会影响以后执行的语句
		System.out.println("创建FatherClass");
	}
}

class ChildClass2 extends FatherClass2{

	public ChildClass2() {
		System.out.println("创建ChildClass");
	}
	
}