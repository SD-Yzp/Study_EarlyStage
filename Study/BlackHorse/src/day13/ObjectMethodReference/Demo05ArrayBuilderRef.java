package day13.ObjectMethodReference;

public class Demo05ArrayBuilderRef {
	public static void printArray(int length,ArrayBuilder ab)
	{
		int[] arr = ab.arrayBuilder(length);
		System.out.println(arr.length);
	}
	
	public static void main(String[] args) 
	{
		printArray(41, (int length)->{
			return new int[length];
		});
		
		
		/*
		 	数组的类已经存在
		 	数组的构造方法已经存在 new
		 	简化Lambda表达式
		 */
		printArray(56, int[]::new);
	}
}
