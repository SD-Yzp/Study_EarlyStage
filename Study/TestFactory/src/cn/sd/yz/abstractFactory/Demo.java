package cn.sd.yz.abstractFactory;

/**
 * 测试抽象工厂模式
 * @author Yin
 *
 */
public class Demo {
	public static void main(String[] args) {
		CarFactory carFactory = new LuxuryCarFactory();
		Engine engine = carFactory.createEngine();
		engine.run();
	}
}
