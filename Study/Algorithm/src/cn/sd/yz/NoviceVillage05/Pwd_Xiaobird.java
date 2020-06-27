package cn.sd.yz.NoviceVillage05;

import java.util.Scanner;

public class Pwd_Xiaobird 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String pwd = in.next();
		
		char[] datas = pwd.toCharArray();
		
		for(int i=0;i<datas.length;i++)
		{
			datas[i] += n;
			if(datas[i]>'z')
			{
				datas[i] -= 26;
			}
			System.out.print(datas[i]);
		}
	}
}
