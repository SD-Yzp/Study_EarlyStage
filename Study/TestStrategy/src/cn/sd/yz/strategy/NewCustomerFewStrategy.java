package cn.sd.yz.strategy;

public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrince) {
		System.out.println("不打折");
		return standardPrince;
	}

}
