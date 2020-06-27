package cn.sd.yz.Boss02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Function_CSDN {
	private static Scanner cin;
	private static HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public static void main(String args[]) throws Exception {
		cin = new Scanner(System.in);
		boolean loop = true;
		int a = 0;
		int b = 0;
		int c = 0;
		//为了减少IO等待时间，先把数据读取进来存储到List
		LinkedList<TripleInteger> list = new LinkedList<TripleInteger>();
		while(loop) {
			a = cin.nextInt();
			b = cin.nextInt();
			c = cin.nextInt();
			if(-1==a && -1==b && -1==c) {
				loop = false;
			}else {
				list.add(new TripleInteger(a,b,c));
			}
		}
		
		Iterator<TripleInteger> it = list.iterator();
		while(it.hasNext()) {
			TripleInteger ti = it.next();
			System.out.println(String.format("w(%d, %d, %d) = %d", ti.getA(),ti.getB(),ti.getC(),calc(ti.getA(),ti.getB(),ti.getC())));
		}
	}
 
	public static int calc(int a, int b, int c) {
		int ret = 1;
				
		if( a<=0 || b<=0 || c<=0) {
			return ret;
		}else if(a>20 || b>20 || c>20){
			ret = calc(20,20,20);
		}else if(map.containsKey(String.format("%d-%d-%d", a,b,c))) {
			return (Integer)map.get(String.format("%d-%d-%d", a,b,c));
		}
		//如果a<b并且b<c 就返回w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c)
		else if(a<b && b<c) {
			ret = calc(a,b,c-1)+calc(a,b-1,c-1)-calc(a,b-1,c);
			map.put(String.format("%d-%d-%d", a,b,c), ret);
		}
		//w(a−1,b,c)+w(a−1,b−1,c)+w(a−1,b,c−1)−w(a−1,b−1,c−1)
		else {
			ret = calc(a-1,b,c)+calc(a-1,b-1,c)+calc(a-1,b,c-1)-calc(a-1,b-1,c-1);
			map.put(String.format("%d-%d-%d", a,b,c), ret);
		}
		return ret;
	}
	
}
 
final class TripleInteger{
	int a;
	int b;
	int c;
	
	public TripleInteger(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
}
