package cn.sd.yz.simplefactory;

/**
 * 测试简单工厂模式
 * @author Yin
 *
 */
public class Demo {
	public static void main(String[] args) {
		Car byd = CarFactory.createCar("比亚迪");
		Car benz = CarFactory.createCar("奔驰");
		
		byd.run();
		benz.run();
	}
}
