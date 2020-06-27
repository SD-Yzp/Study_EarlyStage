package cn.sd.yz.chainOfResp;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<10) {
			System.out.println("员工："+request.getName()+"请假"+request.getLeaveDays()+"天,理由为："+request.getReason()+"。");
			System.out.println("经理："+this.name+"审批通过。");
		}else {
			nextLeader.handleRequest(request);
		}
	}
	
}
