package cn.sd.yz.NoviceVillage03;

import java.util.Scanner;

public class YuSwimming {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int step = 1;
		double aimDistance = in.nextDouble();
		double metre = 2;
		double distance = step*metre;
		
		while(distance<aimDistance) {
			metre *= 0.98;
			distance += metre;
			step++;
		}
		
		
		System.out.println(step);
		
	}
}
