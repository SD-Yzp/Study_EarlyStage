package cn.sd.yz.universal02;

import java.util.Scanner;

public class PingPang 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		String str = in.nextLine();
		int count1 = 0;
		int win11 = 0;				
		int count2 = 0;
		int win21 = 0;
		char[] datas;
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		
		int temp = -1;
		while((temp=str.indexOf('E'))==-1)
		{
			datas = str.toCharArray();
			for(int i=0;i<datas.length;i++)
			{
				if(datas[i]=='W')
				{
					win11++;
					win21++;
				}
				count1++;
				count2++;
				if((win11==11||(count1-win11)==11||win11>11||(count1-win11)>11)&&Math.abs(2*win11-count1)>1)
				{
					sb1.append(win11+":"+(count1-win11)+"\n");
					count1=0;
					win11=0;
				}
				if((win21==21||(count2-win21)==21||win21>21||(count2-win21)>21)&&Math.abs(2*win21-count2)>1)
				{
					sb2.append(win21+":"+(count2-win21)+"\n");
					count2=0;
					win21=0;
				}
			}
			
			str = in.nextLine();
		}
		
		
		
		datas = str.substring(0,temp).toCharArray();
		for(int i=0;i<datas.length;i++)
		{
			if(datas[i]=='W')
			{
				win11++;
				win21++;
			}
			count1++;
			count2++;
			if((win11==11||(count1-win11)==11||win11>11||(count1-win11)>11)&&Math.abs(2*win11-count1)>1)
			{
				sb1.append(win11+":"+(count1-win11)+"\n");
				count1=0;
				win11=0;
			}
			if((win21==21||(count2-win21)==21||win21>21||(count2-win21)>21)&&Math.abs(2*win21-count2)>1)
			{
				sb2.append(win21+":"+(count2-win21)+"\n");
				count2=0;
				win21=0;
			}
		}
		
		
		sb1.append(win11+":"+(count1-win11)+"\n");
		
		sb2.append(win21+":"+(count2-win21));
		
		
		System.out.println(sb1.toString());
		System.out.print(sb2.toString());
	}
}
