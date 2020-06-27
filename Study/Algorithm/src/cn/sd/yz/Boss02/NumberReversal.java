package cn.sd.yz.Boss02;

import java.util.Scanner;

public class NumberReversal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		char[] datas = str.toCharArray();
		boolean flag = true;
		
		
		StringBuilder sb = new StringBuilder();
		
		if(datas[0]>'9'||datas[0]<'0')
		{
			sb.append(datas[0]);
			for(int i=datas.length-1;i>=1;i--)
			{
				if(datas[i]=='0'&&flag)
				{
					continue;
				}
				else
				{
					flag = false;
				}
				
				sb.append(datas[i]);
			}
		}
		else 
		{
			for(int i=datas.length-1;i>=0;i--)
			{
				if(datas[i]=='0'&&flag)
				{
					continue;
				}
				else
				{
					flag = false;
				}
				
				sb.append(datas[i]);
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
