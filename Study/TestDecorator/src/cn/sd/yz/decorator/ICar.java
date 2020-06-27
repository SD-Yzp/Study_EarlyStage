package cn.sd.yz.decorator;

/**
 * 抽象组件
 * @author Yin
 *
 */
public interface ICar {
	void move();
}

/**
 * 真实对象，被装饰的对象
 * @author Yin
 *
 */

class Car implements ICar {
	@Override
	public void move() {
		System.out.println("车在跑");
	}
	
}
