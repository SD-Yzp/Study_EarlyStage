package cn.sd.yz.thread;

public class LambdaTest03 {
	public static void main(String[] args) {
		IInterst interst = new Interst();
		int sum = interst.lambda(41, 5);
		
		interst = (a,c) -> { // 要省略int都省略，两个形参不可省略括号，两行代码不可以省略花括号
				System.out.println("i love lambda===>"+(a+c));
				return a+c;
		};
		sum = interst.lambda(4, 5);
	}
}

interface IInterst{
	int lambda(int a,int b);
}

class Interst implements IInterst{

	@Override
	public int lambda(int a,int c) {
		System.out.println("i love lambda===>"+(a+c));
		return a+c;
	}
	
}