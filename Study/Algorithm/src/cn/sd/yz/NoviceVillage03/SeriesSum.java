package cn.sd.yz.NoviceVillage03;

import java.util.Scanner;

/**
 * 级数求和
 * @author Yin
 *
 */
public class SeriesSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int k = in.nextInt();
		double s = 1;
		int n = 1;
		
		while(s<=k) {
			n++;
			s += 1.0/n;
		}
		
		System.out.println(n);
	}
}
