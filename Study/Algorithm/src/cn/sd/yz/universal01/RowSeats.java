package cn.sd.yz.universal01;

import java.util.Scanner;

public class RowSeats 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		//输入四个数据
		int m = in.nextInt();
		int n = in.nextInt();
		int k = in.nextInt();
		int l = in.nextInt();
		int d = in.nextInt();
		
		int x1 = -1;
		int y1 = -1;
		int x2 = -1;
		int y2 = -1;
		int low;
		
		
		int[] numK = new int[d];
		int[] countK = new int[d];
		int[] numL = new int[d];
		int[] countL = new int[d];
		int temp1 = 0;
		int temp2 = 0;
		
		A:for(int i=0;i<d;i++)
		{
			x1 = in.nextInt();
			y1 = in.nextInt();
			x2 = in.nextInt();
			y2 = in.nextInt();
			
			if(x1==x2)
			{
				low = y1>y2?y2:y1;//两者之中选小的
				for(int j=0;j<temp2;j++)
				{
					if(low==numL[j])
					{
						countL[j]++;
						continue A;
					}					
				}
				
				
				numL[temp2]=low;
				
				temp2++;
			}
			else
			{
				low=x1>x2?x2:x1; //两者之中选小的
				for(int j=0;j<temp1;j++)
				{
					
					if(low==numK[j])
					{
						countK[j]++;
						continue A;
					}
					
				}
				
				numK[temp1]=low;
				temp1++;
			}			 
		}
		
		//排序  冒泡法
		for(int i=0;i<temp1-1;i++)
		{
			for(int j=0;j<temp1-1;j++)
			{
				int temp;
				int temp3;
				if(countK[j]<countK[j+1])     //按次数多少选出大的
				{
					temp = countK[j+1];
					countK[j+1] = countK[j];
					countK[j] = temp;
					temp3 = numK[j+1];
					numK[j+1] = numK[j];
					numK[j] = temp3;
				}
			}
		}
		
		for(int i=0;i<k-1;i++)    //将k个大的数按从小到大再次排序
		{
			for(int j=0;j<k-1;j++)
			{
				int temp3;
				if(numK[j]>numK[j+1])
				{					
					temp3 = numK[j+1];
					numK[j+1] = numK[j];
					numK[j] = temp3;
				}
			}
		}
		
		
		
		
		for(int i=0;i<k-1;i++)
		{
			System.out.print(numK[i]+" ");
		}		
		
		System.out.println(numK[k-1]);
		
		
		//排序  冒泡法
		for(int i=0;i<temp2-1;i++)
		{
			for(int j=0;j<temp2-1;j++)
			{
				int temp;
				int temp3;
				if(countL[j]<countL[j+1])     //按次数多少选出大的
				{
					temp = countL[j+1];
					countL[j+1] = countL[j];
					countL[j] = temp;
					temp3 = numL[j+1];
					numL[j+1] = numL[j];
					numL[j] = temp3;
				}
			}
		}
		
		for(int i=0;i<l-1;i++)    //将k个大的数按从小到大再次排序
		{
			for(int j=0;j<l-1;j++)
			{
				int temp3;
				if(numL[j]>numL[j+1])
				{					
					temp3 = numL[j+1];
					numL[j+1] = numL[j];
					numL[j] = temp3;
				}
			}
		}
		
		
		
		
		for(int i=0;i<l-1;i++)
		{
			System.out.print(numL[i]+" ");
		}		
		
		System.out.println(numL[l-1]);
		
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


