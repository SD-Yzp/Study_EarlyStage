package Test1;

public class TestJoin {
	public static void main(String[] args) {
		System.out.println("�ְֺͶ������̵Ĺ���");
		Son son = new Son();
		new Thread(new Father(son)).start();
	}
}

class Father implements Runnable{
	private Son son;
	
	
	
	public Father(Son son) {
		super();
		this.son = son;
	}



	@Override
	public void run() {
		System.out.println("�ְֺͶ����ڿ����ӣ��ְ�����̷���û���ˣ��ö���ȥ���̡�");
		System.out.println("�ְָ��˶���ʮ��Ǯ������ȥ����");
		Thread t = new Thread(son);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ְ��õ��̣���ʣ�µ�Ǯ���˶���");
	}
	
}

class Son implements Runnable{
	@Override
	public void run() {
		System.out.println("������·�Ͽ�������Ϸ������ȥ����һ��");
		for(int i=0;i<10;i++)
		{	
			try {
				Thread.sleep(1000);
				System.out.println("����"+(i+1)+"����");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("����Ҫ����");
		System.out.println("�����̻ؼ�");
		System.out.println("���̸��˰ְ�");
	}
}