package cn.sd.yz.abstractFactory;

public class LuxuryCarFactory implements CarFactory {

	@Override
	public Seats createSeats() {
		// TODO Auto-generated method stub
		return new LuxurySeats();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new LuxuryTyre();
	}

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LuxuryEngine();
	}

}
