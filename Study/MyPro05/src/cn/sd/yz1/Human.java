package cn.sd.yz1;

public class Human {
		private int age;
		String name;  //不加修饰的话，默认default，只可以被本包下的类访问
		protected int height;  //protected修饰的可以在不同包的子类调用
		
		void sayAge() {
			System.out.println(age);
		}
		
}
