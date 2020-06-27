package cn.sd.yz.abstractFactory;

public interface CarFactory {
	Seats createSeats();
	Tyre createTyre();
	Engine createEngine();
	
}
