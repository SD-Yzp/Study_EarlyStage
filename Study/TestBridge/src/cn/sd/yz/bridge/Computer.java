package cn.sd.yz.bridge;

/**
 * 电脑
 * 含有品牌属性
 * @author Yin
 *
 */
public class Computer {
	protected Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}
}

class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("台式机");
	}
}

class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("笔记本");
	}
}

class Pad extends Computer{

	public Pad(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("平板");
	}
}