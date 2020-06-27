package cn.sd.yz.Boss02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Function 
{
	private static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		long a = 0;
		long b = 0;
		long c = 0;
		
		
		LinkedList<Save> list = new LinkedList<Save>();
		
		
		while(flag)
		{
			a = in.nextLong();
			b = in.nextLong();
			c = in.nextLong();
			
			if(-1==a && -1==b && -1==c) {
				flag = false;
			}else {
				list.add(new Save(a, b, c));
			}
		}
		
		
		Iterator<Save> it = list.iterator();
		while(it.hasNext()) {
			Save ti = it.next();
			System.out.println(String.format("w(%d, %d, %d) = %d", ti.getA(),ti.getB(),ti.getC(),w(ti.getA(),ti.getB(),ti.getC())));
		}


	}
	
	public static int w(long a, long b, long c)
	{
		int temp;
		
		if(a<=0||b<=0||c<=0)
		{
			return 1;
		}
		else if(a>20||b>20||c>20)
		{
			return w(20,20,20);
		}
		else if(map.containsKey(String.format("%d-%d-%d", a,b,c)))
		{
			return (Integer)map.get(String.format("%d-%d-%d", a,b,c));
		}	
		else if(a<b&&b<c)
		{
			temp = w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c);
			map.put(String.format("%d-%d-%d", a,b,c), temp);
		}
		else
		{
			temp = w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1);
			map.put(String.format("%d-%d-%d", a,b,c), temp);			
		}
		
		return temp;
	}
}

final class Save
{
	private long a;
	private long b;
	private long c;
	public Save(long a, long b, long c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public long getA() {
		return a;
	}
	public void setA(long a) {
		this.a = a;
	}
	public long getB() {
		return b;
	}
	public void setB(long b) {
		this.b = b;
	}
	public long getC() {
		return c;
	}
	public void setC(long c) {
		this.c = c;
	}
	
	
	
}
