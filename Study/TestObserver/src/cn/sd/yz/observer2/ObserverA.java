package cn.sd.yz.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * 通过java自带的包实现观察者模式
 * @author Yin
 *
 */
public class ObserverA implements Observer{
	private int myState;
	
	@Override
	public void update(Observable o, Object arg) {
		myState = ((ConcreteSubject)o).getState();
	}

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}
	
}
