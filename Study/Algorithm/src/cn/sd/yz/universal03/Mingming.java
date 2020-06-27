package cn.sd.yz.universal03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Mingming 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<Integer>();
		
		int n = in.nextInt();
		for(int i=0;i<n;i++)
		{
			set.add(in.nextInt());
		}
		
		
		System.out.println(set.size());
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (Integer temp : set) 
		{
			list.add(temp);
		}
		
		Collections.sort(list);
		
		for (Integer temp : list) 
		{
			System.out.print(temp+" ");
		}
	}
}
