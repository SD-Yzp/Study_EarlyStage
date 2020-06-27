package cn.sd.yz.seven;

import java.util.Scanner;

/**
 * ÍêÊı
 * @author Yin
 *
 */
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int beginNum = in.nextInt();
		int endNum = in.nextInt();
		int count = 0;
		boolean flag;
		for(int i=beginNum;i<=endNum;i++)
		{
			flag = judge(i);
			if(flag)
			{
				if(count>=1)
				{
					System.out.print(" ");
				}
				System.out.print(i);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println();
		}
	}
	
	public static boolean judge(int num) 
	{
		int sum = 0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num) 
		{
			return true;
		}
		return false;
	}
}
