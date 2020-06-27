package cn.sd.yz.five;

import java.util.Scanner;

/**
 * 多项式加法
 * @author Yin
 *
 */
public class PolynomialAddition {
	public static void main(String[] args) {
		System.out.println("输入多项式：");
		Scanner in = new Scanner(System.in);
		int[][] poly = new int[2][100];
		boolean flag = true;
		int i = 0;
		int shutdown = 0;
		while(shutdown!=-1)
		{
			shutdown = in.nextInt();
			if(flag) 
			{				
				poly[0][i]=shutdown;
			}
			else
			{
				poly[1][i]=shutdown;
				i++;
			}
			flag=!flag;
		}
		System.out.println(i);
		for(int j=0;j<i;j++) 
		{
			System.out.print(poly[0][j]+" ");
			System.out.print(poly[1][j]+" ");
		}
		
		int temp;
		for(int j=0;j<i-1;j++) 
		{
			for(int k=0;k<i-1;k++) 
			{				
				if(poly[0][k]<poly[0][k+1])
				{
					temp = poly[0][k];
					poly[0][k] = poly[0][k+1];
					poly[0][k+1] = temp;
					
					temp = poly[1][k];
					poly[1][k] = poly[1][k+1];
					poly[1][k+1] = temp;
				}
			} 
		}
		
		
		
		for(int j=0;j<i;j++) 
		{
			System.out.print(poly[0][j]+" ");
			System.out.print(poly[1][j]+" ");
		}
		
		
		int[][] result = new int[2][100];
		int k = 0;
		for(int j=0;j<i;j++) 
		{
			if(poly[0][j]==poly[0][j+1]) 
			{
				poly[1][j+1] = poly[1][j]+poly[1][j+1];						
			}
			else
			{
				result[0][k]=poly[0][j];
				result[1][k]=poly[1][j];
				k++;
			}
		}

		
		for(int j=1;j<k;j++) 
		{
			if(result[1][j]==0) {
				continue;
			}
			
			if(result[0][j]==1) 
			{
				if(result[1][j]<0)
				{
					System.out.print(result[1][j]+"x");
				}
				else
				{
					System.out.print("+"+result[1][j]+"x");
				}
			}
			else if(result[0][j]==0)
			{
				if(result[1][j]<0)
				{
					System.out.print(result[1][j]);
				}
				else
				{
					System.out.print("+"+result[1][j]);
				}
			}
			else
			{				
				if(result[1][j]<0)
				{
					System.out.print(result[1][j]+"x"+result[0][j]);
				}
				else
				{
					System.out.print("+"+result[1][j]+"x"+result[0][j]);
				}
			}
		}
		
	}
}
