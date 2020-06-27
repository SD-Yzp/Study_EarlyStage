package cn.sd.yz.memento;

import java.util.Stack;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author Yin
 *
 */
public class CareTaker {
	private EmpMemento em;
	
	//通过栈保存信息，实现后进先出
//	private Stack<EmpMemento> stack = new Stack<EmpMemento>();  
	
	public CareTaker() {
		
	}

	public EmpMemento getEm() {
		return em;
	}

	public void setEm(EmpMemento em) {
		this.em = em;
	}
	
	
}
