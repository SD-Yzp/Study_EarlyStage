package cn.sd.yz.state;

public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("已经被预定了");
	}

}
