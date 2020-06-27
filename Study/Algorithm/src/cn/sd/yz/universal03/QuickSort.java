package cn.sd.yz.universal03;

import java.util.Scanner;

public class QuickSort 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		int[] arr = new int[n]; 
		
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		
		quickSort(arr, 0, arr.length-1);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++)
		{
			sb.append(arr[i]+" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		
	}
	
	
	public static void quickSort(int[] arr,int startIndex,int endIndex)
	{
		if(endIndex<=startIndex)
		{
			return;
		}
		
		int pos = position(arr,startIndex,endIndex);
		quickSort(arr, startIndex, pos-1);
		quickSort(arr, pos+1, endIndex);
			
	}
	
	
	public static int position(int[] arr,int startIndex,int endIndex)
	{
		
		int index = startIndex;
		int pivot = arr[(startIndex+endIndex)/2];
		int temp;
		while(endIndex>=startIndex)
		{
			while(pivot<arr[endIndex])
			{
				endIndex--;
			}
				
			while(pivot>arr[startIndex])
			{
				startIndex++;
			}
			
			
			
			temp = arr[endIndex];
			arr[endIndex] = arr[startIndex];
			arr[startIndex] = temp;
			
			if(arr[endIndex]==pivot)
			{
				endIndex--;
			}
			if(arr[startIndex]==pivot)
			{
				startIndex++;
			}
			
			if(startIndex==endIndex)
			{
				startIndex--;
				endIndex++;
			}
		}
		
		return endIndex;
		
	}
}
