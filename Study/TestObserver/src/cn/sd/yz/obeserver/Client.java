package cn.sd.yz.obeserver;

/**
 * 测试观察者模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		//目标对象
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建多个观察者
		ObserverA obs1 = new ObserverA(10);
		ObserverA obs2 = new ObserverA(15);
		ObserverA obs3 = new ObserverA(20);
		
		//将观察者注册到目标对象
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//目标对象改变状态后，观察者同步更新
		subject.setState(30);
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//目标对象改变状态后，观察者同步更新
		subject.setState(303);
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		
	}
}
