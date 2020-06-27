package cn.sd.yz2;
/**
 * 测试多态
 * @author Yin
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		Animal d = new Dog();    //自动向上转型
		animalCry(d);    //父类引用指向子类对象
		animalCry(new Tong());
		Animal c = new Cat();
		
	//	d.seeDoor();  //不可以使用，因为编译器认为d是Animal类
		
		Dog d2 = (Dog) d;
	//	Dog d3 = (Dog) c;  //运行会报错，Cat类不可以转成Dog类
		
		d2.seeDoor();
	//	d3.seeDoor();  //虽然编译没报错，但是不能运行
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
}

class Animal{
	public void shout() {
		System.out.println("叫了一声！");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪~");
	}
	
	public void seeDoor() {
		System.out.println("看门.");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵~");
	}
}

class Tong extends Animal{
	public void shout() {
		System.out.println("嘤嘤嘤~");
	}
}