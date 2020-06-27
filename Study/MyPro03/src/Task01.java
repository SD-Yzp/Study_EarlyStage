import java.util.Scanner;
/**
 * 作业1，十进制转换二进制
 * @author Yin
 *
 */
public class Task01 {
	public static void main(String[]args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入十进制整数：");
		int a = scanner.nextInt();
		int b = 0;  
		int k = 1;
		while(a!=0) {			
				b+=k*(a%2);  //将十进制转换成二进制
				k*=10;  //逆序输出
				a=a/2;
		}
		System.out.println("输出的二进制整数为："+b);	
		
		/*
		 * 
		int decimal;
        String Sbinary;
        int  binary;
 
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        decimal = input.nextInt();
        Sbinary = Integer.toBinaryString(decimal);
        binary  = Integer.parseInt(Sbinary);
        System.out.printf("二进制数为:%d",binary);

--------------------- 
作者：流雪扶风 
来源：CSDN 
原文：https://blog.csdn.net/qq_34834846/article/details/81392699 
版权声明：本文为博主原创文章，转载请附上博文链接！
		 */

	}
}
