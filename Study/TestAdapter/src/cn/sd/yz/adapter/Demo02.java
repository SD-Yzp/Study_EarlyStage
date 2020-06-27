package cn.sd.yz.adapter;

public class Demo02 {
	public static void main(String[] args) {
		Demo02 demo = new Demo02();
		
		Adapter adapter = new Adapter();
		Adaptee2 adaptee = new Adaptee2(adapter);
		
		demo.test1(adaptee);
		
	}
	
	public void test1(Target t) {
		t.handleReq();
	}
}	
