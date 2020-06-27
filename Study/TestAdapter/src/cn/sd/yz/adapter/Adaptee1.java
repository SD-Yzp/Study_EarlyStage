package cn.sd.yz.adapter;

public class Adaptee1 extends Adapter implements Target{
	
	@Override
	public void handleReq() {
		super.request();
	}
}
