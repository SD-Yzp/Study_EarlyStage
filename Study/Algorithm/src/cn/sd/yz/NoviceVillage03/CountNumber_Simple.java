package cn.sd.yz.NoviceVillage03;

import java.util.Scanner;

public class CountNumber_Simple {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();  //1<=n<=1000000
		int x = in.nextInt();  //0<=x<=9
		int temp;
		int count = 0;
		
		for(int i=1;i<=n;i++) {
			temp = i;
			while(temp>0) {
				if(temp%10==x) {
					count++;
				}
				temp/=10;
			}
		}

		
		System.out.println(count);
		
		
	}
}
