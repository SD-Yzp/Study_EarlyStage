package cn.sd.yz.universal01;

import java.util.Scanner;

public class Carpet 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] coordinate_x = new int[n];
		int[] coordinate_y = new int[n];
		int[] length_x = new int[n];
		int[] length_y = new int[n];
		int result = -1;
		
		
		
		for(int i=0;i<n;i++)
		{
			coordinate_x[i] = in.nextInt();
			coordinate_y[i] = in.nextInt();
			length_x[i] = in.nextInt();
			length_y[i] = in.nextInt();
		}
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		
		
		
		
		
			
		for(int i=n-1;n>=0;i--)
		{
			if(x>=coordinate_x[i]&&x<=coordinate_x[i]+length_x[i]
					&&y>=coordinate_y[i]&&y<=coordinate_y[i]+length_y[i])
			{
				result=i+1;
				break;
			}
		}

		
		
		System.out.println(result);
		
		
	}
}
