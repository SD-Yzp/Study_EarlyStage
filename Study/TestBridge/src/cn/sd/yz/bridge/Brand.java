package cn.sd.yz.bridge;

/**
 * 品牌
 * @author Yin
 *
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.print("销售联想牌");		
	}
	
}

class Dell implements Brand{
	@Override
	public void sale() {
		System.out.print("销售戴尔牌");
	}
}