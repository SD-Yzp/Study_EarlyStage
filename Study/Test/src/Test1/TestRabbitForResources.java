package Test1;

public class TestRabbitForResources {
	public static void main(String[] args) {
		Account account = new Account("中国银行",100);
		new Thread(new Draw(account,"夫人",80)).start();
		new Thread(new Draw(account,"you",80)).start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		new Thread(new Draw(account,"aaa",30)).start();
	}
}

class Account{
	String name;
	int amount;
	
	public Account(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}	
}

class Draw implements Runnable{
	private Account account;
	private String name;
	private int drawMoney;
	
	
	public Draw(Account acconut, String name, int drawMoney) {
		this.account = acconut;
		this.name = name;
		this.drawMoney = drawMoney;
	}



	public String getName() {
		return name;
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println(this.name+"要取"+drawMoney);
		
		if(account.amount<drawMoney)
		{
			System.out.println("你的余额不足！差");
			return;
		}
		
		synchronized (account) {			
			System.out.println("账户金额为："+account.amount);
			
			if(account.amount<drawMoney)
			{
				System.out.println("你的余额不足！");
				return;
			}
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			account.amount -= drawMoney;
			System.out.println(this.name+"取完后，账户余额为："+account.amount);
		}
	}
}