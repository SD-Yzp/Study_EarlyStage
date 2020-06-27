package cn.sd.yz.builder;

/**
 * 组装飞船
 * @author Yin
 *
 */
public class SdAirshipDirector implements AirshipDirector {

	private AirshipBuilder airshipBuilder;
	
	
	public SdAirshipDirector(AirshipBuilder airshipBuilder) {
		super();
		this.airshipBuilder = airshipBuilder;
	}


	@Override
	public Airship directAirship() {
		Engine e = airshipBuilder.builderEngine();
		EscapeTower et = airshipBuilder.builderEscapeTower();
		OrbitalModule om = airshipBuilder.builderOrbitalModule();
		
		Airship airship = new Airship();
		airship.setEngine(e);
		airship.setEscapeTower(et);
		airship.setOrbitalModule(om);
		return airship;
	}

}
