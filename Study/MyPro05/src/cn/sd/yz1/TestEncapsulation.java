package cn.sd.yz1;
/**
 * 测试封住
 * @author Yin
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;
		h.name = "Joker";
		
		Person4 p4 = new Person4();
		p4.setName("Joker");
		System.out.println(p4.getName());
		p4.setAge(-14);
	}
}


class Boy extends Human{
/*	void sayHello() {
		System.out.println(age);  //子类不能调用父类private的属性
	}   */
}