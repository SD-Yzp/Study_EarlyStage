package cn.sd.yz.processflow;

/**
 * ������
 * @author Yin
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Person p = new Person(40);
		p.says();
		System.out.println("------------");
		Amplifier amp = new Amplifier(p);
		amp.says();
	}	
}



abstract class soundSource{
	private int volume;	
	public abstract void says();
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}

class Person extends soundSource{
	public Person(int volume) {
		setVolume(volume);
	}
	
	@Override
	public void says() {			
		System.out.println("�˵�����Ϊ"+getVolume()+"�ֱ�");
	}
		
}

class Amplifier extends soundSource{
	public soundSource ss;
	
	
	public Amplifier(soundSource ss) {
		super();
		this.ss = ss;
	}

	
	
	@Override
	public void says() {
		ss.says();
		System.out.println("��������������Ϊ"+(ss.getVolume())*5+"�ֱ�");
	}
	
}
