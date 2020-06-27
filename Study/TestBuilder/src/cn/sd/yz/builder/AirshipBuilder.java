package cn.sd.yz.builder;

public interface AirshipBuilder {
	OrbitalModule builderOrbitalModule();
	Engine builderEngine();
	EscapeTower builderEscapeTower();
}
