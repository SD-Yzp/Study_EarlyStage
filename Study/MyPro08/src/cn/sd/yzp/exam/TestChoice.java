package cn.sd.yzp.exam;

public class TestChoice {
    public static void main(String[] args) {
        Base base= new Child();  //��ת�Ͷ��󣬲��ܵ�������ĳ�Ա����������ʹ��������������ķ���
//      base.methodB();   //��������
        base.method();  //������д�ķ���
        
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
    	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  //��÷�������
    }
}
