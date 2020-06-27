package cn.sd.yz.strategy;

public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrince) {
		System.out.println("打8折");
		return standardPrince*0.8;
	}

}
