package cn.yz.sd.mediator;

public class Development implements Department {
	private Mediator m;
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}
	
	@Override
	public void selfAction() {
		System.out.println("专心科研");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，缺钱！");
		m.commond("finacial");   //跟其他部门的工作在外部方法设置好
	}


}
