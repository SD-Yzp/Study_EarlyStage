package cn.sd.yz.three;

import java.util.Scanner;

/**
 * 判断奇偶个数
 * @author Yin
 *
 */
public class Parity {
	public static void main(String[] args) {
		System.out.println("请输入一系列正整数：");
		Scanner in = new Scanner(System.in);
//		接收输入的正整数
		int num = in.nextInt();
//		奇数的个数
		int oddNumber = 0;
//		偶数的个数
		int evenNumber = 0;		
		while(num != -1) 
		{
			if(num>=100000||num<=0) {
				throw new RuntimeException("整数的范围错误！范围为(0,100000)");
			}
			if(num%2 == 0) 
			{
				evenNumber++;		
			}
			else 
			{
				oddNumber++;
			}
			num = in.nextInt();
		}
	
		System.out.println(oddNumber+" "+evenNumber);
	}
}
