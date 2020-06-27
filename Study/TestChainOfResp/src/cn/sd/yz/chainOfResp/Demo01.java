package cn.sd.yz.chainOfResp;

/**
 * 测试责任链模式 Chain Of Response
 * @author Yin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Leader leader1 = new Director("张三");
		Leader leader2 = new Manager("李四");
		Leader leader3 = new GeneralManager("王五");
		
		leader1.setNextLeader(leader2);
		leader2.setNextLeader(leader3);
		
		LeaveRequest request = new LeaveRequest("David", 10, "回老家探亲");
		leader1.handleRequest(request);
	}
}
