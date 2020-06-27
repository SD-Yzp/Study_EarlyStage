package cn.sd.yz.NoviceVillage04;

import java.util.Scanner;

public class Abacus_Calculation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] num = new int[n];
		int count1 = 0;
		int count2 = 0;
		int[] sum = new int[(n-1)*n/2];
		
		
		for(int i=0;i<n;i++) {
			num[i] = in.nextInt();
		}
		
		
		
		for(int i=0;i<n;i++) {
			A:for(int j=i+1;j<n;j++) {				
				sum[count1] = num[i]+num[j];
				for(int k=0;k<count1;k++) {
					if(sum[k]==sum[count1]) {
						continue A;   //important!!!   如果数组中已经有等于两个数的和的数就不记录 例如 1+4=5 2+3=5
					}
				}
				count1++;
			}
		}
		
		for(int i=0;i<count1;i++) {   //important!!!
			for(int j=0;j<n;j++) {
				if(sum[i]==num[j]) {
					count2++;
				}
			}
		}
		
		if(n==1) {
			System.out.println(1);
		}else {			
			System.out.println(count2);
		}
		
	}
}
