package cn.sd.yz.facade;

public interface 税务局 {
	void taxCertificate();
}

class 海淀区税务局 implements 税务局{

	@Override
	public void taxCertificate() {
		System.out.println("在税务局登记");
	}
	
}