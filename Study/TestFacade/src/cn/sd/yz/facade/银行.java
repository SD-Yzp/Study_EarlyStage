package cn.sd.yz.facade;

public interface 银行 {
	void openAccount();
}

class 中国银行 implements 银行 {

	@Override
	public void openAccount() {
		System.out.println("在银行开户");
	}
	
}