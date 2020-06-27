package cn.sd.yz.universal01;

import java.util.Scanner;

public class Rock_Paper_Scissors_Up 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int na = in.nextInt();
		int nb = in.nextInt();
		
		int[] cycleA = new int[n];
		int[] cycleB = new int[n];
		
		int countA = 0;
		int countB = 0;
		for(int i=0;i<n;i++)
		{
			if(i<na)
			{				
				cycleA[i] = in.nextInt();
			}
			else
			{
				cycleA[i] = cycleA[i-na];				
			}
		}
		
		
		//如果周期大于数据量，去掉冗余数据
		if(na>n)
		{
			for(int i=0;i<na-n;i++)
			{
				int temp = in.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(i<nb)
			{
				cycleB[i] = in.nextInt();
			}
			else 
			{				
				cycleB[i] = cycleB[i-nb];				
			}
		}
		
		

		
		for(int i=0;i<n;i++)
		{
			switch(cycleA[i])
			{
			case 0:
				switch(cycleB[i])
				{
				case 0:
					break;
				case 1:
					countB++;
					break;
				case 2:
					countA++;
					break;
				case 3:
					countA++;
					break;
				case 4:
					countB++;
					break;
				}
				break;
			case 1:
				switch(cycleB[i])
				{
				case 0:
					countA++;
					break;
				case 1:
					break;
				case 2:
					countB++;
					break;
				case 3:
					countA++;
					break;
				case 4:
					countB++;
					break;
				}
				break;
			case 2:
				switch(cycleB[i])
				{
				case 0:
					countB++;
					break;
				case 1:
					countA++;
					break;
				case 2:
					break;
				case 3:
					countB++;
					break;
				case 4:
					countA++;
					break;
				}
				break;
			case 3:
				switch(cycleB[i])
				{
				case 0:
					countB++;
					break;
				case 1:
					countB++;
					break;
				case 2:
					countA++;
					break;
				case 3:
					break;
				case 4:
					countA++;
					break;
				}
				break;
			case 4:
				switch(cycleB[i])
				{
				case 0:
					countA++;
					break;
				case 1:
					countA++;
					break;
				case 2:
					countB++;
					break;
				case 3:
					countB++;
					break;
				case 4:
					break;
				}
				break;	
			}
		}
		
		System.out.println(countA+" "+countB);
	}
}
