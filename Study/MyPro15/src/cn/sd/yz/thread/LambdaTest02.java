package cn.sd.yz.thread;

public class LambdaTest02 {
	//��̬�ڲ���
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
		
		//�ֲ��ڲ���
		class Love3 implements ILove{

			@Override
			public void lambda(int a) {
				System.out.println("i love lambda===>"+a);
			}
			
		}
		love = new Love3();
		love.lambda(25);
		//�����ڲ���
		love = new ILove(){
			@Override
			public void lambda(int a) {
				System.out.println("i love lambda===>"+a);				
			}			
		};
		love.lambda(10);
		
		//lambda���ʽ
		love = (int a) ->{
			System.out.println("i love lambda===>"+a);						
		};
		love.lambda(5);
		
		love = (a) ->{
			System.out.println("i love lambda===>"+a);						
		};
		love.lambda(3);
		
		love = a ->{  //ֻ��һ���β�ʱ����Ҳ����ʡ��
			System.out.println("i love lambda===>"+a);						
		};
		love.lambda(2);
		//ֻ��һ�д���ʱ��������Ҳ����ʡ��
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