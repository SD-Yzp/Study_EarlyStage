package cn.sd.yz.Boss02;

import java.util.Scanner;

public class LittleFish
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		double s = in.nextDouble();
		double x = in.nextDouble();
		
		double start = s-x;
		if(start<0)
		{
			start=0;
		}
		double end = s+x;
		
		double v = 7.00;
		
		double a = 0.98;
		
		double distance = 0;
		
		
		while(true)
		{
			distance += v;
			v *= a;
			if(distance-start>0)
			{				
				break;
			}
		}
		
		
		
		
		
		if(v-(end-start)<=0)
		{
			System.out.println('y');
		}
		else
		{
			System.out.println('n');
		}
		
	}
	
}
