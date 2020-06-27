package cn.sd.yz.NoviceVillage06;

import java.util.Scanner;

public class Number_Calculate 
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int sum = 1;
		int[] a = new int[n/2+4];
		a[0] = 1;
		a[1] = 1;
		a[2] = 2;
		a[3] = 2;
		
		for(int i=4;i<=n/2;i++)   //递推,数学思维
		{
			for(int j=i/2;j>0;j--)
			{
				a[i] += a[j];
			}
			a[i]++;
		}
		
		for(int i=1;i<=n/2;i++)
		{
			sum += a[i];
		}
		
		calculate(n);
		
		System.out.println(sum2);
		System.out.println(sum);
		
		
	}	
	
	
	static int sum2;
	
	public static void calculate(int n)   //递归算法，耗时多占内存
	{
		sum2++;
		
		if(n==1)
		{
			return;
		}
		
		
		for(int i=n/2;i>0;i--)
		{
			calculate(i);
		}
		
	}
}
