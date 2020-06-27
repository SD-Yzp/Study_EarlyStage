package cn.sd.yz.factory;

public class BydFactory implements CarFactory {

	
	public Car createCar() {
		return new Byd();
	}

}
