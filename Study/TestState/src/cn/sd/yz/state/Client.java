package cn.sd.yz.state;

/**
 * 测试状态模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		HomeContext hc = new HomeContext();
		
		hc.setState(new FreeState());
		hc.setState(new BookedState());

	
	}
}
