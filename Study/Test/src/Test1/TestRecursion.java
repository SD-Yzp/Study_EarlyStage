package Test1;

/**
 * 测试递归打印a-b
 * 递归：方法自己调用自己
 * 递归头：何时结束递归
 * 递归体：重复调用
 * @author Yin
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
		printFigure(1,10);
	}
	
	
	public static void printFigure(int a,int b) {
		if(a>b) {
			throw new RuntimeException("输入格式为：a<=b！");
		}
		
		//优化
		System.out.print(a+"\t");
		if(a==b) {
			return;
		}
		printFigure(a+1,b);
		
		
		
//		if(a==b) {         //递归头
//			System.out.print(a+"\t");
//		}else {
//			System.out.print(a+"\t");
//			printFigure(a+1,b);         //递归体
//		}
		
	}
	
}
