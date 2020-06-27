package cn.sd.yz.template;

/**
 * 测试模板方法
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		BankTempleteMethod client1 = new DrawMoney();
		client1.process();
		
		
		//匿名内部类
		BankTempleteMethod client2 = new BankTempleteMethod() {			
			@Override
			public void transact() {
				System.out.println("我要理财，我有一亿韩元！");
			}
		};
		client2.process();
	}
}

class DrawMoney extends BankTempleteMethod{

	@Override
	public void transact() {
		System.out.println("我要取钱！");
	}
	
}