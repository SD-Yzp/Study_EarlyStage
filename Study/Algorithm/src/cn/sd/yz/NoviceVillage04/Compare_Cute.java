package cn.sd.yz.NoviceVillage04;

import java.util.Scanner;

public class Compare_Cute {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] cuteLevel = new int[n];
		int temp = 0;
		
		for(int i=0;i<n;i++) {
			cuteLevel[i] = in.nextInt();
		}
				
		System.out.print(0+" ");
		for(int i=1;i<n;i++) {
			temp=0;
			for(int j=0;j<i;j++) {
				if(cuteLevel[i]>cuteLevel[j]) {
					temp++;
				}
			}
			System.out.print(temp+" ");
		}
		
	}
}
