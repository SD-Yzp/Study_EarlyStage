package cn.sd.yz.NoviceVillage05;

import java.util.Scanner;

public class Vertical_Histogram 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int[] count = new int[26];
		int max = 0;
		
		for(int a=0;a<4;a++)
		{			
			String str = in.nextLine();
			char[] datas = str.toCharArray();
			
			
			for(int i=0;i<datas.length;i++)
			{			
				for(int j=0;j<26;j++)
				{
					if(datas[i]=='A'+j)
					{
						count[j]++;
						if(max<count[j])
						{
							max = count[j];
						}
						break;
					}
				}
			}
		}
		
		
		int[][] printStar = new int[max][26];
		
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<count[i];j++)
			{
				printStar[max-j-1][i] = 1;
			}
		}
		
		int[] stars = new int[max];
		for(int i=0;i<max;i++)
		{
			for(int j=0;j<26;j++)
			{
				if(printStar[i][j]==1)
				{
					stars[i]++;
				}				
			}
		}

		int temp = 0;
		for(int i=0;i<max;i++)
		{
			for(int j=0;j<26;j++)
			{
				if(printStar[i][j]==1)
				{
					System.out.print("* ");
					temp++;
					if(temp==stars[i])
					{
						break;
					}
				}			
				else 
				{
					System.out.print("  ");
				}
			}
			temp=0;
			System.out.println();
		}
		
		System.out.print("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
	}
}
