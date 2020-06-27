package cn.sd.yz.universal03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FractionalLine 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++)
		{
			map.put(in.nextInt(), in.nextInt());
		}
		
		int count = (int)(m*1.5);
				
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() 
		{

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
			{
				// TODO Auto-generated method stub
				if(o2.getValue()==o1.getValue())
				{
					return o1.getKey().compareTo(o2.getKey());
				}
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		int temp = 0;
		int temp2 = 0;
		StringBuilder sb = new StringBuilder();
		for (Entry<Integer, Integer> e : list) 
		{
			if(temp+1>count&&temp2!=e.getValue())
			{				
				break;				
			}
			
			sb.append(e.getKey()+" "+e.getValue()+"\n");
			temp++;
			if(temp==count)
			{
				temp2 = e.getValue();				
			}
			
		}
		
		System.out.println(temp2+" "+temp);
		System.out.println(sb.toString());
	}
}
