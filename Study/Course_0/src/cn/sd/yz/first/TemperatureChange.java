package cn.sd.yz.first;

import java.util.Scanner;

/**
 * 实现华氏温度转换成摄氏温度
 * 输入一个整数为华氏温度，输出对应的摄氏温度，也是整数
 * @author Yin
 *
 */
public class TemperatureChange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入华氏温度：");
//		华氏温度
		int fah = in.nextInt();
//		摄氏温度
		int cel;
		cel = (fah-32)*5/9;
		System.out.println(cel);
	}
}
