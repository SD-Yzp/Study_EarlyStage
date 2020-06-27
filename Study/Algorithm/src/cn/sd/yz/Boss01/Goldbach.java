package cn.sd.yz.Boss01;

import java.util.Scanner;

public class Goldbach 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		A:for(int i=2;i<n;i++)
		{
			if(judgePrime(i))
			{				
				for(int j=2;j<n;j++)
				{
					if(judgePrime(j)&&judgePrime(n-i-j))
					{
						System.out.println(i+" "+j+" "+(n-i-j));
						break A;
					}
				}
			}
		}
	}
	
	public static boolean judgePrime(int n)
	{
		if(n==0||n==1)
		{
			return false;
		}
		
		if(n==2)
		{
			return true;
		}
		
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				return false;
			}
			
		}
	
		return true;
	}
}
