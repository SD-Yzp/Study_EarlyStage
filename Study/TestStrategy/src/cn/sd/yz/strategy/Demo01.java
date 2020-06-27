package cn.sd.yz.strategy;

/**
 * 不使用策略模式	
 * @author Yin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		TestStrategy test = new TestStrategy();
		double price = test.getPrice("OldCustomerFew", 998);
		System.out.println("你需要付的金额为："+price);
	}
}
