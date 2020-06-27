package cn.sd.yz.thread;

/**
 * ��̬����
 * �ӿ�
 * 1����ʵ��ɫ
 * 2�������ɫ
 * @author Yin
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		new WeddingCompany(new You()).happyMarry();
	}
}

interface Marry {
	void happyMarry();
}

class You implements Marry{
	@Override
	public void happyMarry() {
		System.out.println("You and �϶����ڱ�����");
	}	
}


class WeddingCompany implements Marry{
	private You you;
	
	public WeddingCompany(You you) {
		super();
		this.you = you;
	}

	@Override
	public void happyMarry() {
		ready();
		
		this.you.happyMarry();
		
		after();
	}
	
	private void ready() {
		System.out.println("���û鷿");
	}
	
	private void after() {
		System.out.println("�ֶ���");
	}
}