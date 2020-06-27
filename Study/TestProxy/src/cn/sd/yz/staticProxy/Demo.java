package cn.sd.yz.staticProxy;

/**
 * 测试静态代理
 * @author Yin
 *
 */
public class Demo {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxyStar = new ProxyStar(realStar);
		
		proxyStar.confer();
		proxyStar.bookTicket();
		proxyStar.signConstract();
		proxyStar.sing();
		
		proxyStar.collectMoney();
	}
}
