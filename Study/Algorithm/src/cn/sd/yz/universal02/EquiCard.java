package cn.sd.yz.universal02;

import java.util.Scanner;
/**
 * 注意方法
 * @author Yin
 *
 */

public class EquiCard 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] nums = new int[n];
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			nums[i] = in.nextInt();
			sum += nums[i];
		}
		
		int temp = 0;
		int average = sum/n;
		int count = 0;
		for(int i=0;i<n-1;i++)
		{
			if(nums[i]==average)
			{
				continue;
			}
			
			count++;
			temp = average-nums[i];
			nums[i+1] -= temp;
		}
		
		
		System.out.println(count);
		
		
	}
}
