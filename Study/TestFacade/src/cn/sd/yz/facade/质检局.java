package cn.sd.yz.facade;

public interface 质检局 {
	void orgCodeCertificate();
}

class 海淀区质检局 implements 质检局{

	@Override
	public void orgCodeCertificate() {
		System.out.println("进行质量检查");
	}
	
}