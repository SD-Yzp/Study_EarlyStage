package cn.sd.yz.chainOfResp;

public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<3) {
			System.out.println("员工："+request.getName()+"请假"+request.getLeaveDays()+"天,理由为："+request.getReason()+"。");
			System.out.println("主任："+this.name+"审批通过。");
		}else {
			nextLeader.handleRequest(request);
		}
	}
	
}
