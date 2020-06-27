package cn.sd.yz.NoviceVillage02;

import java.util.Scanner;

public class ClassTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[7];
		int[] b = new int[7];
		int[] c = new int[7];
		
		int max = 0;
		int temp = 0;
		
		for(int i=0;i<7;i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = a[i]+b[i];
		}
		
		for(int i=0;i<7;i++) {
			if(max<c[i]) {
				max=c[i];
				temp=i;
			}
		}
		
		if(max>8) {
			System.out.println(temp+1);
		}else {
			System.out.println(0);
		}
	}
}
