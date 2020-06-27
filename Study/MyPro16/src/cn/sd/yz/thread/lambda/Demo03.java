package cn.sd.yz.thread.lambda;

/**
 * 测试lambda表达式
 * @author Yin
 *
 */
public class Demo03 
{
	public static void main(String[] args) 
	{
		//一般形式
		invokeCook(new Cook() 
		{
			
			@Override
			public void makeFood() 
			{
				System.out.println("该吃饭了");
			}
			
		});
		
		//lambda表达式
		invokeCook(()->{
			System.out.println("简单的吃一点");
		});
		
	}
	
	public static void invokeCook(Cook cook)
	{
		cook.makeFood();
	}
}
