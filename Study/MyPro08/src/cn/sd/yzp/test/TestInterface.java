package cn.sd.yzp.test;

/**
 * ���Խӿں�ʵ����
 * @author Yin
 *
 */

public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angel();
		v.fly();
		
		Honest h = new GoodMan();
		h.helpOther();
	}

}


//���нӿ�
interface Volant{
	int FLY_HEIGHT=1000;
	void fly();
}

//�����ӿ�
interface Honest{
	void helpOther();
}
class Angel implements Volant,Honest{   //ʵ�������ʵ�ֶ�����ӿڣ�

	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther()");
	}

	@Override
	public void fly() {
		System.out.println("Angel.fly()");
	}  
	
}


class GoodMan implements Honest{

	@Override
	public void helpOther() {
		System.out.println("GoodMan.helpOther()");
	}
	
}


class BirdMan implements Volant{

	@Override
	public void fly() {
		System.out.println("BirdMan.fly()");
	}
	
}