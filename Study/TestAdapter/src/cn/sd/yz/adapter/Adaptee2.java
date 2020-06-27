package cn.sd.yz.adapter;

public class Adaptee2 implements Target{
	private Adapter adapter;
	
	
	
	public Adaptee2(Adapter adapter) {
		super();
		this.adapter = adapter;
	}



	@Override
	public void handleReq() {
		adapter.request();
	}
}
