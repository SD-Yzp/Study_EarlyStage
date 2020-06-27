package cn.sd.yz.chainOfResp;

/**
 * 测试责任链模式 Chain Of Response
 * 通过责任链模式可以增加中间链，不需要修改其他代码
 * @author Yin
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Leader leader1 = new Director("张三");
		Leader leader2 = new Manager("李四");
		Leader leader3 = new ViceGeneralManager("李大四");
		Leader leader4 = new GeneralManager("王五");
		
		leader1.setNextLeader(leader2);
		leader2.setNextLeader(leader3);
		leader3.setNextLeader(leader4);
		
		LeaveRequest request = new LeaveRequest("David", 100, "回老家探亲");
		leader1.handleRequest(request);
	}
}
