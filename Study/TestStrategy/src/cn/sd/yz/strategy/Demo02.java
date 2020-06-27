package cn.sd.yz.strategy;

/**
 * 使用策略模式	
 * @author Yin
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Context context = new Context(new OldCustomerFewStrategy());
		
		context.printPrice(998);
	}
}
