package Test1;



public class TestStatic {
	public static void main(String[] args) {
		
		A.test();
		
	}
}



class A{
	static int a = 2;
	 int b = 3;
	
	public static void test() {
		a=4;
//		b=4;   报错，因为静态方法只能访问静态变量
		System.out.println(a);
	}
}