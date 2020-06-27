package cn.sd.yz.decorator;

/**
 * 抽象装饰器
 * @author Yin
 *
 */
public class SuperCar implements ICar {

	protected ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();		
	}
}

/**
 * 具体装饰器
 * @author Yin
 *
 */
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	void fly() {
		System.out.println("可以飞");
	}
	
	@Override
	public void move() {
		car.move();
		this.fly();
	}
}

class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	void swim() {
		System.out.println("可以水上走");
	}
	
	@Override
	public void move() {
		car.move();
		this.swim();
	}
}

class AICar extends SuperCar {

	public AICar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	void autoMove() {
		System.out.println("可以自动驾驶");
	}
	
	@Override
	public void move() {
		car.move();
		this.autoMove();
	}
	
}