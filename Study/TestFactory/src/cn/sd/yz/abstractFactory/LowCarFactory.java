package cn.sd.yz.abstractFactory;

public class LowCarFactory implements CarFactory {

	@Override
	public Seats createSeats() {
		// TODO Auto-generated method stub
		return new LowSeats();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new LowTyre();
	}

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LowEngine();
	}

}
