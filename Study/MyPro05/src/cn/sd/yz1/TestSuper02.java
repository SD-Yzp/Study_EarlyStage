package cn.sd.yz1;
/**
 * ����super����
 * @author Yin
 *
 */
public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("��ʼ����һ��ChildClass����....");
		new ChildClass2();
	}
}

class FatherClass2{
	public FatherClass2() {
	//	super(); // ����Ҳ���Զ����ã�������Ҫ�ڹ��췽�����һЩ��Ӱ���Ժ�ִ�е����
		System.out.println("����FatherClass");
	}
}

class ChildClass2 extends FatherClass2{

	public ChildClass2() {
		System.out.println("����ChildClass");
	}
	
}