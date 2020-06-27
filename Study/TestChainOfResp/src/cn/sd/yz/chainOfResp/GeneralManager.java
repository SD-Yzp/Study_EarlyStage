package cn.sd.yz.chainOfResp;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30) {
			System.out.println("员工："+request.getName()+"请假"+request.getLeaveDays()+"天,理由为："+request.getReason()+"。");
			System.out.println("总经理："+this.name+"审批通过。");
		}else {
			System.out.println("员工："+request.getName()+"居然请假"+request.getLeaveDays()+"天，他是不是不想干了！");
		}
	}
	
}
