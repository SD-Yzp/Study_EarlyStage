package cn.sd.yz.universal01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MachineTransiation 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>(); 
		
		
		int m = in.nextInt();
		int n = in.nextInt();
		int temp = -1;
		list.add(-2);
		int count = 0;
		boolean flag = true;
		
		
		for(int i=0;i<n;i++)
		{
			temp = in.nextInt();
			for (Integer num : list) {
				if(num==temp)
				{
					flag = false;
					break;
				}
			}
			
			if(flag)
			{
				list.add(temp);
				count++;
			}
			
			
			if(list.size()>m)
			{
				list.remove(0);
			}
			
			flag = true;
		}
			
		
		System.out.println(count);
	}
}
