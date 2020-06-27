package cn.sd.yz.Boss02;

import java.util.Scanner;

public class Cantor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		int line = 1;
		int row = 0;
		
		int count = 3;
		
		
		if(n==0)
		{
			System.out.println("1/1");
		}
		else if(n==1)
		{
			System.out.println("1/2");
		}
		else if(n==2)
		{
			System.out.println("2/1");
		}
		else
		{
			A:while(true)
			{
				
				if(line==0)
				{
					row++;
					count++;
					if(count==n)
					{
						break A;
					}
				}
				else if(row==0)
				{							
					line++;
					count++;
					if(count==n)
					{
						break A;
					}	
					
				}
				
				
				if(line==0)
				{
					while(row!=0)
					{						
						line++;
						row--;
						count++;
						if(count==n)
						{
							break A;
						}
					}
				}
				else if(row==0)
				{
					while(line!=0)
					{
						row++;
						line--;
						count++;
						if(count==n)
						{
							break A;
						}
					}
				}
				
				
				

				
				
				
			}
			
			
			System.out.println((line+1)+"/"+(row+1));
		}
	}
}
