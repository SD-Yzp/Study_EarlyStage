package cn.sd.yz.decorator;

/**
 * 测试装饰器模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		ICar superCar = new FlyCar(new Car());
		ICar superCar2 = new WaterCar(superCar);
		superCar.move();
		System.out.println("=============");
		superCar2.move();
	}
}

