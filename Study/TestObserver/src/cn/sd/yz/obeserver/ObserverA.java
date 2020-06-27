package cn.sd.yz.obeserver;

public class ObserverA implements Observer {
	private int state;
	
	
	public ObserverA() {
		super();
	}


	public ObserverA(int state) {
		super();
		this.state = state;
	}


	public int getMyState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	@Override
	public void update(Subject subject) {
		this.state = ((ConcreteSubject)subject).getState();
	}

}
