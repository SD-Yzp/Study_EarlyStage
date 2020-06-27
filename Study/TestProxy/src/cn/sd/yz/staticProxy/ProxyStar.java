package cn.sd.yz.staticProxy;

/**
 * 静态代理类
 * @author Yin
 *
 */
public class ProxyStar implements Star {

	private Star star;

	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signConstract() {
		System.out.println("ProxyStar.signConstract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

}
