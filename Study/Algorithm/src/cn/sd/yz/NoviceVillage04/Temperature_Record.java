package cn.sd.yz.NoviceVillage04;


import java.util.Scanner;

public class Temperature_Record 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.next());
		int today = Integer.parseInt(in.next());
		int yesterday = today;
		int count = 1;
		int temp = 1;
		
		for(int i=0;i<n-1;i++)
		{
			today = Integer.parseInt(in.next());
			if(yesterday<today) 
			{
				count++;
			}else
			{
				temp = (temp<count)?count:temp;
				count=1;
			}
			yesterday = today;
		}
		
		temp = (temp<count)?count:temp;

		
		System.out.println(temp);
		in.close();
	}
}
