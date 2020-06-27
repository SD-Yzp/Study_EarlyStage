package cn.sd.yz.thread;

/**
 * 静态代理
 * 接口
 * 1、真实角色
 * 2、代理角色
 * @author Yin
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		new WeddingCompany(new You()).happyMarry();
	}
}

interface Marry {
	void happyMarry();
}

class You implements Marry{
	@Override
	public void happyMarry() {
		System.out.println("You and 嫦娥终于奔月了");
	}	
}


class WeddingCompany implements Marry{
	private You you;
	
	public WeddingCompany(You you) {
		super();
		this.you = you;
	}

	@Override
	public void happyMarry() {
		ready();
		
		this.you.happyMarry();
		
		after();
	}
	
	private void ready() {
		System.out.println("布置婚房");
	}
	
	private void after() {
		System.out.println("闹洞房");
	}
}