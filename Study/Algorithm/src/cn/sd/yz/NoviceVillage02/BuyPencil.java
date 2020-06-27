package cn.sd.yz.NoviceVillage02;

import java.util.Scanner;

public class BuyPencil {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int pencilNumber = in.nextInt();
		int[][] value = new int[3][2];
		int[] num = new int[3];
		int[] totalPrice = new int[3];
		int minPrice;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				value[i][j] = in.nextInt();
			}
			if(pencilNumber%value[i][0]==0) {				
				num[i] = pencilNumber/value[i][0];
			}else {
				num[i] = pencilNumber/value[i][0]+1;
			}
			totalPrice[i] = num[i]*value[i][1];
		}
		
		minPrice = totalPrice[0];
		
		for(int i=1;i<3;i++) {			
			if(minPrice>totalPrice[i]) {
				minPrice = totalPrice[i];
			}
		}
		
		System.out.println(minPrice);		
	}
}
