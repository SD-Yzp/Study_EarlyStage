
/**
 * 测试递归
 * @author Yin
 *
 */
public class TestRecursion {
	public static void main(String[]args) {
		System.out.println("10的阶乘运算结果为:"+factorial(10));		
	}
	
	static int factorial(int n){
		if(n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
}
