package cn.sd.yz.builder;

/**
 * 制造飞船的组件
 * @author Yin
 *
 */
public class SdAirshipBuilder implements AirshipBuilder {

	@Override
	public OrbitalModule builderOrbitalModule() {
		OrbitalModule om = new OrbitalModule("炒鸡牌轨道炮！");
		return om;
	}

	@Override
	public Engine builderEngine() {
		Engine e = new Engine("炸鸡牌引擎！");
		return e;
	}

	@Override
	public EscapeTower builderEscapeTower() {
		EscapeTower et = new EscapeTower("空山牌逃离塔！");
		return et;
	}

}
