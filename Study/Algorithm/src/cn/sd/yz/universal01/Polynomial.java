package cn.sd.yz.universal01;

import java.util.Scanner;

public class Polynomial 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		
		int n = in.nextInt();
		int temp = n;
		int[] x = new int[n+1];
		
		for(int i=0;i<n+1;i++)
		{
			x[i] = in.nextInt();
		}
		
		if(x[0]==1)
		{			
			sb.append("x^"+n);		
		}
		else if(x[0]==-1)
		{			
			sb.append("-x^"+n);		
		}
		else
		{
			sb.append(x[0]+"x^"+n);
		}
		
		
		for(int i=1;i<temp+1;i++)   //不能小于n，因为n在变
		{
			n--;
			
			
			if(x[i]==0)
			{
				continue;
			}
			else if(x[i]>0)
			{
				if(n>0)
				{	
					if(n==1)
					{
						if(x[i]!=1)
						{						
							sb.append("+"+x[i]+"x");
						}
						else
						{						
							sb.append("+x");
						}
					}
					else 
					{						
						if(x[i]!=1)
						{						
							sb.append("+"+x[i]+"x^"+n);
						}
						else
						{						
							sb.append("+x^"+n);
						}
					}
				}
				else
				{
					sb.append("+"+x[i]);					
				}
			}
			else
			{
				if(n>0)
				{	
					if(n==1) 
					{						
						if(x[i]!=-1)
						{						
							sb.append(x[i]+"x");
						}
						else
						{						
							sb.append("-x");
						}
					}
					else
					{						
						if(x[i]!=-1)
						{						
							sb.append(x[i]+"x^"+n);
						}
						else
						{						
							sb.append("-x^"+n);
						}
					}
				}
				else
				{
					sb.append(x[i]);					
				}
			}
			
			
			
			
		}

		System.out.println(sb.toString());
		
	}
}
