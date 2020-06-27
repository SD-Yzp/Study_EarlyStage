package cn.sd.yz.NoviceVillage04;

import java.util.Scanner;

public class Number_Game {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] num = new int[100];
		
		int i=0;
		
		do{
			num[i]=in.nextInt();
			i++;
		}while(num[i-1]!=0);
		
		if(i!=1) {			
			for(int j=i-2;j>=0;j--) {
				System.out.print(num[j]+" ");
			}
		}
		
	}
}
