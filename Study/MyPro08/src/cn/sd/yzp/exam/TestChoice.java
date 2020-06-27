package cn.sd.yzp.exam;

public class TestChoice {
    public static void main(String[] args) {
        Base base= new Child();  //上转型对象，不能调用子类的成员变量，不能使用子类声明定义的方法
//      base.methodB();   //不能运行
        base.method();  //调用重写的方法
        
        new Child().methodA();
    }
}
class Base {
    public void method(){
        System.out.print ("Base method");
    }        
}


class Child extends Base{   
    
	public void methodB(){
        System.out.print ("Child methodB");
    }

	@Override
	public void method() {
		System.out.println("override");
	}
    
    public void methodA() {
    	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  //获得方法名字
    }
}
