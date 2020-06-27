package cn.sd.yz.builder;

/**
 * 测试建造者模式
 * @author Yin
 *
 */
public class Demo {
	public static void main(String[] args) {
		AirshipBuilder builder = new SdAirshipBuilder();
		AirshipDirector director = new SdAirshipDirector(builder);
		
		Airship airship = director.directAirship();
		System.out.println(airship.getEngine().getName());
		System.out.println(airship.getEscapeTower().getName());
		System.out.println(airship.getOrbitalModule().getName());
		airship.launch();
	}
}
