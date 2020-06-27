package cn.sd.yz.NoviceVillage03;

import java.util.Scanner;

public class VoyageOfFish {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int n = in.nextInt();
		int temp1 = 7-x+1;
		int temp2 = -1;
		if(n>temp1) {
			temp2 = (n-temp1)%7;
		}
		int distance = 0;
		
		
		if(temp2>5) {
			if(temp1>2) {				
				distance = (temp1-2)*250+((n-temp1)/7)*250*5+5*250;
			}else {
				distance = ((n-temp1)/7)*250*5+5*250;			
			}
		}else {
			
			if(temp1>2) {
				if(temp1>=n) {
					distance = (temp1-2)*250;
				}else {
					distance = (temp1-2)*250+((n-temp1)/7)*250*5+temp2*250;
				}
			}else {
				if(temp1>=n) {
					distance = 0;
				}else {
					distance = ((n-temp1)/7)*250*5+temp2*250;
				}
			}			
		
		}
		
		
		System.out.println(distance);
	}
}
