
/**
 * 测试嵌套循环
 * @author Yin
 *
 */
public class TestWhileQianTao {
	public static void main(String[]args) {
		for(int i=1;i<=5;i++) {    //输出一个每行为12345的五行矩阵
			for(int j=1;j<=5;j++) {
				System.out.print(j+"\t");
			}
			System.out.print("\n");			
		}
		
		System.out.println("##########");			
		
		for(int i=1;i<=9;i++) {    //9*9乘法表
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.print("\n");			
		}	
		
		
		//作业1用while循环分别计算100以内的奇数及偶数的和，并输出。
		int a=1;
		int sum1=0,sum2=0;
		while(a<=100) {
			if(a%2==1) {
				sum1+=a;
				a++;
			}else {
				sum2+=a;
				a++;
			}
		}
		System.out.println("奇数的和为："+sum1);
		System.out.println("偶数的和为："+sum2);
		
		//用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。		
		for(int i=5;i<=1000;) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+" ");
				i=i+5;
			}
			System.out.println();
		}
	}
}
