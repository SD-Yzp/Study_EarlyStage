package cn.sd.yz.processflow;

/**
 * �ֻ�
 * @author Yin
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Iphone p = new Iphone("iphone30");
		p.show();
		System.out.println("------����ǿ����------");
		ProjectiveIphone pp = new ProjectiveIphone(p);
		pp.show();
	}
}

class Iphone{
	private String name;
	
	public Iphone(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("����"+name+",�ҿ�������Ļ����ʾ");
	}	
}


class ProjectiveIphone{
	public Iphone phone;
	public ProjectiveIphone(Iphone phone){
		this.phone = phone;
	}
	
	public void show() {
		phone.show();
		System.out.println("������������Ļ����ʾ�������Ա�ը!");
	}
}
