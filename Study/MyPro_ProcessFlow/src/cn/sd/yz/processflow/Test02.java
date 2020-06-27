package cn.sd.yz.processflow;

/**
 * 手机
 * @author Yin
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Iphone p = new Iphone("iphone30");
		p.show();
		System.out.println("------经过强化后------");
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
		System.out.println("我是"+name+",我可以在屏幕上显示");
	}	
}


class ProjectiveIphone{
	public Iphone phone;
	public ProjectiveIphone(Iphone phone){
		this.phone = phone;
	}
	
	public void show() {
		phone.show();
		System.out.println("不仅可以在屏幕上显示，还可以爆炸!");
	}
}
