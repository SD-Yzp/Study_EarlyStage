package cn.sd.yz.chainOfResp;

public class ViceGeneralManager extends Leader {

	public ViceGeneralManager(String name) {
		super(name);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<20) {
			System.out.println("员工："+request.getName()+"请假"+request.getLeaveDays()+"天,理由为："+request.getReason()+"。");
			System.out.println("副总经理："+this.name+"审批通过。");
		}else {
			nextLeader.handleRequest(request);
		}
	}
	
}
