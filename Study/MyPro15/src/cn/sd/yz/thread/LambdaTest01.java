package cn.sd.yz.thread;

public class LambdaTest01 {
	//静态内部类
	static class Like2 implements ILike{

		@Override
		public void lambda() {
			System.out.println("i like lambda2");
		}
		
	}
	
	public static void main(String[] args) {
		ILike like = new Like();
		like.lambda();

		like = new Like2();
		like.lambda();

		//局部内部类
		class Like3 implements ILike{

			@Override
			public void lambda() {
				System.out.println("i like lambda3");
			}
			
		}
		like = new Like3();
		like.lambda();

		//匿名内部类
		like = new ILike(){
			@Override
			public void lambda() {
				System.out.println("i like lambda4");
			}
		};
		like.lambda();
		
		
		//lambda 表达式  (接口只有一个没有实现的方法才可以)
		like = ()->{
			System.out.println("i like lambda5");
		};
		like.lambda();
		
		/*
		 * lambda推导必须存在类型
		 * ()->{ System.out.println("i like lambda5"); };
		 */
	}
}

interface ILike{
	void lambda();
}

//外部类
class Like implements ILike{

	@Override
	public void lambda() {
		System.out.println("i like lambda");
	}
	
}