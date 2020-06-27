package cn.yz.sd.mediator;

/**
 * 测试中介者模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		
		Department market = new Market(m);
		Department finacial = new Finacial(m);
		Department development = new Development(m);
		
		market.selfAction();
		market.outAction();
	}
}
