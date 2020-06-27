package day13.ObjectMethodReference;

/**
 * 通过类名引用静态方法
 * 类已经存在
 * 静态方法已经存在
 * @author Yin
 *
 */
public class Demo03Calculate {
	public static void calculatePow(double a,double b,Calculator cal)
	{
		System.out.println(cal.powCalculate(a, b));
	}
	
	public static void main(String[] args) 
	{
		
		
		calculatePow(10,3,(double a,double b)->{
			return Math.pow(a, b);
		});
		
		/*
		 * 使用方法引用优化Lambda表达式
		 */
		calculatePow(5, 3, Math::pow);
	}
}
