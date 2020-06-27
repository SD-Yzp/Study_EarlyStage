package cn.sd.yzp.exam;

/**
 * 递归打印九九乘法表
 * @author Joker
 *
 */
public class Recursion01 {
	public static void main(String[] args) {
		printTen(1);
		
	}
	
	
	public static void	printTen(int n){
		if(n>9){
			return;
		}
		printTen2(1, n);
		System.out.println();
		printTen(n+1);
	}
	
	//打印每一行
	public static void printTen2(int m,int n) { 
		if(m>n) {
			return;
		}
		System.out.print(m+"*"+n+" ");
		printTen2(m+1, n);
	}
	
	
}	
	
 





