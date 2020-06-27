package cn.sd.yz.template;

public abstract class BankTempleteMethod {
	//具体方法
	public void takeNumber() {
		System.out.println("取号排队");
	}
	
	public abstract void transact();  
	
	public void evaluate() {
		System.out.println("反馈评价");
	}
	
	//模板方法,整个流程已经确定，具体步骤可以视行为而定
	public final void process() {
		takeNumber();
		
		transact();  //抽象方法
		
		evaluate();
	}
}
