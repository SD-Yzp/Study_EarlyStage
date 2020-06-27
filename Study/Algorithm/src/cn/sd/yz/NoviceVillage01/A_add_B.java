package cn.sd.yz.NoviceVillage01;

import java.util.Scanner;

public class A_add_B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		long b = in.nextLong();
		
		long sum = a+b;
		System.out.println(sum);
	}
}
