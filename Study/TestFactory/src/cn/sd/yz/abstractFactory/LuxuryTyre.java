package cn.sd.yz.abstractFactory;

public class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("不磨损");
	}

}
