package cn.sd.yz.NoviceVillage02;

import java.util.Scanner;

public class PinMoney {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] budget = new int[12];  //预算
		int deposit = 0;  // 存款
		int balance = 0;  //余额
		int temp = 0;
		
		for(int i=0;i<12;i++) {
			budget[i] = in.nextInt();
			balance = balance + 300 - budget[i];
			if(balance<0) {
				temp = i+1;
				break;
			}
			if(balance>100) {
				deposit += (balance/100)*100;
				balance -= (balance/100)*100;
			}
		}
		
		if(temp!=0) {
			System.out.println(-temp);
		}else {
			System.out.println((int)(deposit*1.2+balance));
		}	
	}
}