package cn.sd.yz.factory;

public class BenzFactory implements CarFactory {


	public Car createCar() {
		return new Benz();
	}

}
