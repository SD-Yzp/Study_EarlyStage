package cn.sd.yz.second;

import java.util.Scanner;

/**
 * 完成世界协调时(UTC)和北京时间之间的转换(BJT)
 * @author Yin
 *
 */
public class TimeChange {
	public static void main(String[] args) {
		System.out.println("请输入UTC时间：");
		Scanner in = new Scanner(System.in);
//		世界协调时		
		int utc = in.nextInt();
//		北京时间
		int bjt;
//		判断时间的输入格式是否正确
		if(utc<0||utc>2359) {
			throw new RuntimeException("输入的时间范围错误！范围为0-2359");			
		}
//		完成时间换算
		if(utc/100>7) {
			bjt = utc - 800;
		}else {
			bjt = utc - 800 + 2400;
		}
		System.out.println("北京时间为："+bjt);
	}
}
