package cn.sd.yzp.exam;

/**
 * ������
 * @author Joker
 *
 */
public class Artist implements Showtime{
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void playTeleplay() {
		System.out.println("�����ݵ��Ӿ�");		
	}

	@Override
	public void playMovie() {
		System.out.println("�����ݵ�Ӱ");		
	}

	@Override
	public void sing() {
		System.out.println("�һᳪ��");
	}
	
}
