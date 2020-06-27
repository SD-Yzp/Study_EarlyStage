package cn.yz.sd.mediator;

public class Market implements Department {
	
	private Mediator m;
		
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);  
	}

	@Override
	public void selfAction() {
		System.out.println("市场调研，接项目");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，缺钱！");
		m.commond("finacial");   //跟其他部门的工作在外部方法设置好
	}

	

}
