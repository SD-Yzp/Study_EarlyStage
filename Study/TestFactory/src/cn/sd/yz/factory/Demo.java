package cn.sd.yz.factory;

/**
 * 测试工厂模式
 * @author Yin
 *
 */
public class Demo {
	public static void main(String[] args) {
		Car byd = new BydFactory().createCar();
		Car benz = new BenzFactory().createCar();
		
		byd.run();
		benz.run();
	}
}
