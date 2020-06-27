package cn.sd.yz.state;

public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("确认已经入住");
	}

}
