package cn.sd.yzp.exam;

/**
 * �ݹ��ӡ�žų˷���
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
	
	//��ӡÿһ��
	public static void printTen2(int m,int n) { 
		if(m>n) {
			return;
		}
		System.out.print(m+"*"+n+" ");
		printTen2(m+1, n);
	}
	
	
}	
	
 





