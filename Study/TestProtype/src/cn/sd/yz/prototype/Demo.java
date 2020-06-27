package cn.sd.yz.prototype;

/**
 * 测试克隆耗时
 * 如果需要短时间创建大量对象，并且new的过程比较耗时，则可以考虑使用原型模式！
 * @author Yin
 *
 */
public class Demo {
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	public static void test1() {
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1000;i++) {
			Laptop laptop = new Laptop();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("不使用原型模式耗时为："+(end-start));
	}
	
	public static void test2() {
		long start = System.currentTimeMillis();
		
		Laptop laptop = new Laptop();
		for(int i=0;i<1000;i++) {
			try {
				Laptop laptop_clone = (Laptop) laptop.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("不使用原型模式耗时为："+(end-start));
	}
}

class Laptop implements Cloneable{

	public Laptop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}