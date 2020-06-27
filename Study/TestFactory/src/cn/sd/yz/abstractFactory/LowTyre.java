package cn.sd.yz.abstractFactory;

public class LowTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("磨损快");
	}

}
