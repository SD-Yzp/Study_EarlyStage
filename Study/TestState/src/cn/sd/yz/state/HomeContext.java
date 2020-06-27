package cn.sd.yz.state;

/**
 * 处理状态的类
 * 房间对象
 * @author Yin
 *
 */
public class HomeContext {
	//如果是银行系统，这个Context类就是账号。根据金额不同，切换不同的状态！
	private State state;

	public State getState() {
		return state;
	}

	//修改状态时可以调用方法
	public void setState(State state) {
		System.out.println("状态修改！");
		this.state = state;
		state.handle();
	}

	
	
	
}
