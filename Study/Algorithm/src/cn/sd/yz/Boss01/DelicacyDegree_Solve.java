package cn.sd.yz.Boss01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 
public class DelicacyDegree_Solve {
	private static Scanner cin;
	private static LinkedList<String> list;
	private static int max;
	private static int[] condiments = new int[10];
	
	public static void main(String args[]) throws Exception {
		cin = new Scanner(System.in);
		max = cin.nextInt();
		if(max<10 || max>30) {
			System.out.println("0");
			return;
		}
		list = new LinkedList<String>();
		Arrays.fill(condiments, 0);
		for(int i=1;i<=3;i++) {
			condiments[0] = i;
			calc(i,9);
		}
		
		if(list.size()<=0) {
			System.out.println("0");
		}else {
			System.out.println(list.size());
			Iterator<String> is = list.iterator();
			while(is.hasNext()) {
				String value = (String)is.next();
				System.out.println(value);
			}
		}
	}
 
	public static void calc(int sum, int n) {
		if(n>0) {
			for(int i=1;i<=3;i++) {
				if(sum+i>max) {
					return;
				}else if(sum+i==max && n==1){
					condiments[9] = i;
					
					list.add(String.format("%d %d %d %d %d %d %d %d %d %d", condiments[0],condiments[1],condiments[2],
							condiments[3],condiments[4],condiments[5],condiments[6],condiments[7],condiments[8],condiments[9]));
				}else {
					condiments[9-n+1] = i;
					calc(sum+i,n-1);
				}
			}
		}
	}
	
}