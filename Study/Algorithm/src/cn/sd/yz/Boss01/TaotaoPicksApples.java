package cn.sd.yz.Boss01;

import java.util.Scanner;

public class TaotaoPicksApples 
{
	 public static void main(String[] args) 
	 {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int s = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		if(n==0||s==0)
		{
			System.out.println(0);
		}
		else 
		{			
			int[][] apples = new int[n][2];
			int count = 0;  //apples数组的实际长度
			
			int high = a+b;
			int temp1,temp2;  //接收数据的同时，丢弃不需要的数据		
			for(int i=0;i<n;i++)
			{			
				temp1 = in.nextInt();
				temp2 = in.nextInt();
				if(temp1<=high)
				{
					apples[count][0] = temp1;
					apples[count][1] = temp2;
					count++;
				}
			}
			
			
			
			//排序  冒泡法
			for(int i=0;i<count-1;i++)
			{
				for(int j=0;j<count-1;j++)
				{
					int temp;
					if(apples[j][1]>apples[j+1][1])
					{
						temp = apples[j+1][1];
						apples[j+1][1] = apples[j][1];
						apples[j][1] = temp;
					}
				}
			}
			
			int sum = 0; //花的力气
			
			for(int i=0;i<count;i++)
			{
				sum+=apples[i][1];
				if(sum==s)
				{
					System.out.println(i+1);
					break;
				}
				else if(sum>s)
				{
					System.out.println(i);
					break;
				}
			}
		}
		
			
	}
	 
	 
	 public static void swap(int a,int b)
	 {
		 int temp;
		 if(a>b)
		 {
			 temp = b;
			 b = a;
			 a = temp;
		 }
	 }
	 
	 
}
