package cn.sd.yzp.test;

/**
 * 测试静态内部类
 * @author Yin
 *
 */
public class TestStaticInnerClass {
	public static void main(String[] args) {
		Outer2.Inner2 inner = new Outer2.Inner2();  //静态内部类不依托于外部类
	}
}


class Outer2{
	
	static class Inner2{  //静态内部类
		
	}
}