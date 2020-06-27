package cn.sd.yz.adapter;

public class Demo01 {
	public static void main(String[] args) {
		Demo01 demo = new Demo01();
		
		Adaptee1 adapter = new Adaptee1();
		
		demo.test1(adapter);		
	}
	
	public void test1(Target t) {
		t.handleReq();
	}
}	
