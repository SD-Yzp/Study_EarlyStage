package cn.sd.yzp.exam;

/**
 * ÀÖÆ÷Àà
 * @author Yin
 *
 */
public abstract class Instrument {
	 public abstract void makeSound() ;
}

class Erhu extends Instrument{
	@Override
	public void makeSound() {
		System.out.println("ÎËÎËÎË...");	
	}
}

class Piano extends Instrument{

	@Override
	public void makeSound() {
		System.out.println("¶£Áå¶£Áå...");
		
	}
	
}

class Violin extends Instrument{

	@Override
	public void makeSound() {
		System.out.println("ºßºßºß...");
		
	}
	
}
