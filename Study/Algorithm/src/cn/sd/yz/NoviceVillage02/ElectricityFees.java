package cn.sd.yz.NoviceVillage02;

import java.util.Scanner;

public class ElectricityFees {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int elec = in.nextInt();
		double fees = 0;
		
		if(elec<=150) {
			fees = elec*0.4463;
		}else if(elec>150&&elec<=400) {
			fees = 150*0.4463+(elec-150)*0.4663;			
		}else {
			fees = 150*0.4463+250*0.4663+(elec-400)*0.5663;			
		}

		fees = (double) Math.round(fees*10)/10; //保留一位小数
		
		System.out.println(fees);
	}
}