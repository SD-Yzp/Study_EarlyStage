package cn.sd.yzp.exam;

/**
 * ������
 * @author Yin
 *
 */
public abstract class Instrument {
	 public abstract void makeSound() ;
}

class Erhu extends Instrument{
	@Override
	public void makeSound() {
		System.out.println("������...");	
	}
}

class Piano extends Instrument{

	@Override
	public void makeSound() {
		System.out.println("���嶣��...");
		
	}
	
}

class Violin extends Instrument{

	@Override
	public void makeSound() {
		System.out.println("�ߺߺ�...");
		
	}
	
}
