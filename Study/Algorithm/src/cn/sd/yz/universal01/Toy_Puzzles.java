package cn.sd.yz.universal01;

import java.util.Scanner;

public class Toy_Puzzles 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();  //玩具数量
		int m = in.nextInt();  //指令条数
		
		int location = 0;
		
		int[] locations = new int[n];
		String[] names = new String[n];
		
		for(int i=0;i<n;i++)
		{
			locations[i] = in.nextInt();
			names[i] = in.next();
		}
		
		int[] orientations = new int[m];
		int[] steps = new int[m];
		
		for(int i=0;i<m;i++)
		{
			orientations[i] = in.nextInt();
			steps[i] = in.nextInt();
		}

		for(int i=0;i<m;i++)
		{
			if(orientations[i]==locations[location])
			{
				location -= steps[i];
				if(location<0)
				{
					location += n;
				}
			}
			else
			{
				location += steps[i];
				if(location>=n)
				{
					location -= n;
				}
			}
		}
		
		System.out.println(names[location]);
		
		
	}
}
