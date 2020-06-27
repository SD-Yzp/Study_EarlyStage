package cn.sd.yz.strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrince) {
		System.out.println("打8.5折");
		return standardPrince*0.85;
	}

}
