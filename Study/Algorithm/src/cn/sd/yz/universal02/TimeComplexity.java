package cn.sd.yz.universal02;

import java.util.Scanner;

public class TimeComplexity 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		
		for(int i=0;i<t;i++)
		{
			int l = in.nextInt();
			String complexity = in.next();
			
			for(int j=0;j<l;j++)
			{
				String nameF = in.next();
				if(nameF.equals("F"))
				{
					String nameP = in.next();
					String param1 = in.next();
					String param2 = in.next();					
				}
				
			}
		}
	}
}
