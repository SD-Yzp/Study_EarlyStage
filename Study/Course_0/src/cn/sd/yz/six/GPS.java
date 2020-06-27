package cn.sd.yz.six;

import java.util.Scanner;

/**
 * GPS数据处理
 * @author Yin
 *
 */
public class GPS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] gps = str.split(",");
		String[] tempStr = str.split("\\*");
		char[] c = tempStr[0].substring(1,tempStr[0].length()).toCharArray();
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+" ");
		}
		
		int cal = c[0]^c[1];
		for(int i=1;i<c.length-1;i++) 
		{	
			cal=cal^c[i+1];
		}
		/*
		char[] c = gps[0].substring(1,gps[0].length()).toCharArray();
		for(int i=1;i<c.length-1;i++) 
		{	
//			if(c[i]=='.') 
//			{
//				continue;
//			}
			cal=cal^c[i+1];
		}
		
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+" ");
		}
		System.out.println();
		
		for(int i=1;i<gps.length-1;i++)
		{
			if(gps[i].equals(""))
			{
				continue;
			}
			else
			{				
				c = gps[i].substring(0,gps[i].length()).toCharArray();
				for(int j=1;j<c.length-1;j++) 
				{			
					cal=cal^c[j+1];
				}
				
				for(int k=0;k<c.length;k++)
				{
					System.out.print(c[k]+" ");
				}
				System.out.println();
				
			}
		}
		String[] tempStr = gps[gps.length-1].split("\\*");
		c = tempStr[0].substring(0,tempStr[0].length()).toCharArray();
		for(int i=1;i<c.length-1;i++) 
		{			
			cal=cal^c[i+1];
		}
		
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+" ");
		}
		System.out.println();
		
		cal%=65536;
		*/
		
		System.out.println();
		System.out.println(cal);
		
		int time = Integer.parseInt(gps[1].substring(0, 6));
		int hour = time/10000;
		int minute = (time - hour*10000)/100;
		int second = time - hour*10000-minute*100;
		int bHour = hour + 8;
		if(bHour>23) 
		{
			bHour-=24;			
		}
		if(bHour<10)
		{
			System.out.print("0"+bHour+":");
		}
		else
		{
			System.out.print(bHour+":");
		}
		System.out.print(minute+":"+second);
	}
}
