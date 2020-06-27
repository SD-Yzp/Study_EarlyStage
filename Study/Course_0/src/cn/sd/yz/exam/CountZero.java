package cn.sd.yz.exam;

import java.util.Scanner;

/**
 * 二进制的前导的零
 * @author Yin
 *
 */
public class CountZero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int countZero = 0;
			
		while(num != 0)
		{
			count++;
			num /= 2;
		}
		countZero = 32 - count;
		System.out.println(countZero);
		
		
	}
}
