package cn.sd.yz.course;

import java.util.Scanner;

/**
 * 求平均数
 * @author Yin
 *
 */
public class Average {
	public static void main(String[] args) {
//		每次输入的数
		int num = 0;
//		总和
		int sum = 0;
//		输入了多少个数
		int count = -1;
//		平均数
		double average = 0;
		Scanner in = new Scanner(System.in);
//		当输入-1时停止程序
		while(num!=-1){
			sum += num;
			count++; 
			num = in.nextInt();
		}
		if(count == 0) {
			System.out.println("没有输入有效的数据");
		}else {			
			average = sum*1.0/count;
			System.out.println(average);
		}
	}
}
