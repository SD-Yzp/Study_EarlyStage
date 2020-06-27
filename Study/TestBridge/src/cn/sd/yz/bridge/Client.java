package cn.sd.yz.bridge;

/**
 * 测试桥接模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		Computer c1 = new Laptop(new Lenovo());
		Computer c2 = new Desktop(new Dell());
				
		c1.sale();
		c2.sale();		
	}
}
