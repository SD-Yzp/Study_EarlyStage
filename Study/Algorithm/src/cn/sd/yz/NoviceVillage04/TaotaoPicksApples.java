package cn.sd.yz.NoviceVillage04;

import java.util.Scanner;

public class TaotaoPicksApples {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] apple_Height = new int[10];
		int tao_Height;
		
		for(int i=0;i<10;i++) {   //100<=apple_Height<=200
			apple_Height[i] = in.nextInt();
		}
		
		tao_Height = in.nextInt();   //100<=tao_Height<=120
		
		int max_Height = tao_Height+30;
		
		int count=0;
		for(int i=0;i<10;i++) {
			if(max_Height>=apple_Height[i]) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
