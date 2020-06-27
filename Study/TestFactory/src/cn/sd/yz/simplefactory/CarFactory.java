package cn.sd.yz.simplefactory;

public class CarFactory {
	public static Car createCar(String type) {
		if(type.equals("奔驰"))
		{
			return new Benz();
		}
		else if(type.equals("比亚迪"))
		{
			return new Byd();
		}
		else
		{			
			return null;
		}
	}
}
