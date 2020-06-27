package cn.sd.yz.four;

import java.util.Scanner;

/**
 * 计算第n个素数到第m个素数的和
 * @author Yin
 *
 */
public class PrimeSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		第n个素数
		int n = in.nextInt();
		int nPrime = 2;
//		第m个素数
		int m = in.nextInt();
//		判断n，m是否符合范围
		if(n<=0||m>200) 
		{
			throw new RuntimeException("输入的数据范围超出！范围为0<n=m<=200");
		}
//		素数和
		int sum = 0;
//		找到第n个素数
		int temp = 1;
		for(int i=2;temp<n;i++) 
		{
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					break;
				}
				if(j==i-1) 
				{					
					temp++;
				}
			}
			nPrime = i;
		}
//		找到第m个素数并累加
		for(int i=nPrime;temp<=m;i++) 
		{
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					break;
				}
				if(j==i-1) 
				{					
					temp++;
					sum+=i;
				}
			}
		}
		
		System.out.println(sum);
	}
}
