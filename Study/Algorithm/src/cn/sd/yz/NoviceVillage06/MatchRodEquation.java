package cn.sd.yz.NoviceVillage06;

import java.util.Scanner;

public class MatchRodEquation 
{
	static int[] nums = {6,2,5,5,4,5,6,3,7,6,0};
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		n -= 4;
		
		
		int count = 0;
		
		
		for(int i=0;i<1000;i++)
		{
			for(int j=0;j<1000;j++)
			{				

				if(calculateNum(i)+calculateNum(j)+calculateNum(i+j)==n)
				{
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		
	}
	
	public static int calculateNum(int n)
	{
		int k = 0;
		for(int i=n;i!=0;i/=10)
		{
			k+=nums[i%10];
		}
		if(n==0)
		{
			k+=nums[0];
		}
		
		return k;
	}
	
	public static boolean judgeSum(int a,int b,int c)
	{
		if(a+b==c)
		{
			return true;
		}
		
		return false;
	}
}
