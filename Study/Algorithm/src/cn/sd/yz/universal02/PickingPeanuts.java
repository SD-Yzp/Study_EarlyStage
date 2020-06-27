package cn.sd.yz.universal02;

import java.util.Scanner;

public class PickingPeanuts 
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[][] coordinates = new int[m][n];
		int[]  peanuts = new int[401];
		int[]  x = new int[401];
		int[]  y = new int[401];
		int count = 0;
		int steps = 0;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				coordinates[i][j] = in.nextInt();
				if(coordinates[i][j]!=0)
				{
					peanuts[count] = coordinates[i][j];
					x[count] = j;
					y[count] = i;
					count++;
				}
			}
		}
		
		for(int i=0;i<count-1;i++)
		{
			for(int j=0;j<count-1;j++)
			{
				int temp;
				if(peanuts[j]<peanuts[j+1])
				{
					temp = peanuts[j];
					peanuts[j] = peanuts[j+1];
					peanuts[j+1] = temp;
					
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
					
					temp = y[j];										
					y[j] = y[j+1];
					y[j+1] = temp;
				}
			}
		}
		
		int temp1 = x[0];
		int temp2 = -1;
		int result = 0;
		for(int i=0;i<count;i++)
		{
			steps += Math.abs(y[i]-temp2)+Math.abs(x[i]-temp1); //到达下一个点的时间
			steps++;  //停留一秒	
			//存储坐标
			temp2 = y[i];  
			temp1 = x[i];
			if(steps+(y[i]+1)<=k)
			{
				result += peanuts[i];
				continue;
			}
			else
			{
				break;
			}
		}
		

		System.out.println(result);
	}
}


