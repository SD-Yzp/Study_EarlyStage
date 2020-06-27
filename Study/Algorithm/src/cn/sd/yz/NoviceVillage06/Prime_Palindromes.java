package cn.sd.yz.NoviceVillage06;

import java.util.Scanner;

public class Prime_Palindromes 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int[] nums = new int[100000001];
		int count=0;
		
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a%2==0)
		{
			a++;
		}
		
		for(int i=a;i<=b;i+=2)
		{
			if(i==9989900)
			{
				break;
			}
			
			if(judgePalinromes(i)&&judgePrime(i))
			{
				nums[count]=i;
				count++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(int i=0;i<count;i++)
		{			
			sb.append(nums[i]+",");
		}
		sb.setCharAt(sb.length()-1, '}');
		
		System.out.println(sb.toString());
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

	public static boolean judgePalinromes(int n)
	{
		
		String str = n+"";
		
		char[] datas = str.toCharArray();
		
		for(int i=0;i<str.length()/2;i++)
		{
			if(datas[i]!=datas[str.length()-i-1])
			{
				return false;
			}
		}
		
		return true;
	}

}
