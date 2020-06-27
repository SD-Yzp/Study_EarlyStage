package cn.sd.yz.facade;

public interface 工商局 {
	void checkName();
}

class 海淀区工商局 implements 工商局 {

	@Override
	public void checkName() {
		System.out.println("检查名字是否冲突");
	}
	
}
