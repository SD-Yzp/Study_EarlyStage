package cn.sd.yz.obeserver;

public class ConcreteSubject extends Subject {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyAllObserver();
	}
	
	
}
