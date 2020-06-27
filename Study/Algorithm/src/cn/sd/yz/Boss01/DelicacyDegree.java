package cn.sd.yz.Boss01;

import java.util.Scanner;

public class DelicacyDegree 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int temp1 = 1;
		int temp2 = 1;
		
		int sum = 0;
		
		if(n<10||n>30)
		{
			System.out.println(0);
		}		
		else if(n==10||n==30)
		{
			System.out.println(1);
		}
		else
		{
			n -= 10;
			if(n<=10)
			{
				
				for(int i=0;i<=n/2;i++)
				{		
					
					for(int j=1;j<=n-i;j++)
					{
						temp1 *= 10-j+1;
						temp2 *= j;
					}
					
					for(int k=1;k<=i;k++)
					{
						temp1 *= n-i-k+1;
						temp2 *= k;
					}
					
					sum += temp1/temp2;
					
					
					temp1 = 1;
					temp2 = 1;
				}	
			
			}
			else
			{
				for(int j=1;j<=n-10;j++)
				{
					temp1 *= 10-j+1;
					temp2 *= j;
				}
				
				sum += temp1/temp2;
				
				temp1 = 1;
				temp2 = 1;
				
				if(n%2==0)
				{
					for(int i=9;i>=n/2;i--)
					{		
						for(int j=1;j<=i;j++)
						{
							temp1 *= 10-j+1;
							temp2 *= j;
						}
						
						for(int k=1;k<=n-i;k++)
						{
							temp1 *= i-k+1;
							temp2 *= k;
						}
						sum += temp1/temp2;
						
						
						temp1 = 1;
						temp2 = 1;
					}
				}
				else
				{
					for(int i=9;i>n/2;i--)
					{		
						
						for(int j=1;j<=i;j++)
						{
							temp1 *= 10-j+1;
							temp2 *= j;
						}
						
						for(int k=1;k<=n-i;k++)
						{
							temp1 *= i-k+1;
							temp2 *= k;
						}
						
						sum += temp1/temp2;
						
						
						temp1 = 1;
						temp2 = 1;
					}
				}
			}
			
			
			System.out.println(sum);
		}
		
		
		
		
	}

}
