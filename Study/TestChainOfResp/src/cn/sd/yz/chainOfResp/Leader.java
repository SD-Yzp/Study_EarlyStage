package cn.sd.yz.chainOfResp;

/**
 * 抽象类
 * @author Yin
 *
 */
public abstract class Leader {
	//设置为protected是为了让子类继承
	protected String name;
	protected Leader nextLeader; //上一阶领导
	
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	/**
	 * 处理业务的核心方法
	 * @param request
	 */
	abstract void handleRequest(LeaveRequest request);
}
