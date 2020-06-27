package cn.sd.yz.thread.lambda;

public class Demo05 
{
	public static void main(String[] args) 
	{
		
		
		
		//一般形式
//		test(3, 4, new Calculator() {
//			
//			@Override
//			public int claculate(int a, int b) 
//			{
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//		});
		
		//lambda表达式
		test(3, 4, (int a,int b)->{
			return a+b;
		});
		
	}
	
	public static void test(int a,int b,Calculator cal)
	{
		int sum = cal.claculate(a, b);
		System.out.println(sum);
	}
	
}
