package cn.sd.yz.NoviceVillage06;

import java.util.ArrayList;
import java.util.Scanner;

public class ChoiceNumber 
{
	
	private static ArrayList <Integer>tmpArr = new ArrayList<>();
	private static int sum = 0; //记录和
	private static int result = 0; // 记录结果
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int[] x = new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			x[i] = in.nextInt();
		}
	
		combine(0,k,x);			
		
		System.out.println(result);
		
	
	}
	

	public static boolean judge(int num)
	{
		if(num==1||num==2)
		{
			return true;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void combine(int index,int k,int[] arr) {

		if(k == 1){

			for (int i = index; i < arr.length; i++) {

				tmpArr.add(arr[i]);

				
				for (int num : tmpArr) {
					sum += num;
				}
			
				if(judge(sum))
				{
					result++;
				}
				
				sum=0;
				
				tmpArr.remove((Object)arr[i]);

			}

		}else if(k > 1){

			for (int i = index; i <= arr.length -k; i++) {

				tmpArr.add(arr[i]);

				combine(i + 1,k - 1, arr);

				tmpArr.remove((Object)arr[i]);

			}

		}else{

			return ; 

		}

	}
	
}
