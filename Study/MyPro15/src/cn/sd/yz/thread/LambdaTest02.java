package cn.sd.yz.thread;

public class LambdaTest02 {
	//静态内部类
	static class Love2 implements ILove{

		@Override
		public void lambda(int a) {
			System.out.println("i love lambda===>"+a);
		}
		
	}
	
	public static void main(String[] args) {
		ILove love = new Love();
		love.lambda(100);
		
		love = new Love2();
		love.lambda(50);
		
		//局部内部类
		class Love3 implements ILove{

			@Override
			public void lambda(int a) {
				System.out.println("i love lambda===>"+a);
			}
			
		}
		love = new Love3();
		love.lambda(25);
		//匿名内部类
		love = new ILove(){
			@Override
			public void lambda(int a) {
				System.out.println("i love lambda===>"+a);				
			}			
		};
		love.lambda(10);
		
		//lambda表达式
		love = (int a) ->{
			System.out.println("i love lambda===>"+a);						
		};
		love.lambda(5);
		
		love = (a) ->{
			System.out.println("i love lambda===>"+a);						
		};
		love.lambda(3);
		
		love = a ->{  //只有一个形参时括号也可以省略
			System.out.println("i love lambda===>"+a);						
		};
		love.lambda(2);
		//只有一行代码时，花括号也可以省略
		love = a -> System.out.println("i love lambda===>"+a);								
		love.lambda(1);
	}
}

interface ILove{
	void lambda(int a);
}

class Love implements ILove{

	@Override
	public void lambda(int a) {
		System.out.println("i love lambda===>"+a);
	}
	
}