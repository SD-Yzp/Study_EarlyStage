package cn.sd.yz.second;

import java.util.Scanner;

/**
 * 信号报告
 * @author Yin
 *
 */
public class SignalReport {
	public static void main(String[] args) {
		System.out.println("请输入要报告的数字：");
		Scanner in = new Scanner(System.in);
//		要报告的数字
		int report = in.nextInt();
//		检测数据是否在范围内
		if(report<11||report>59) {
			throw new RuntimeException("输入的数字不在测试数据中！测试数据范围11-59");
		}
//		将检测数据分开
		int report_first = report / 10;
		int report_second = report % 10;
		switch(report_second) 
		{
		case 1:
			System.out.print("Faint signals,barely perceptible");
			break;
		case 2:
			System.out.print("Very weak signals");
			break;
		case 3:
			System.out.print("Weak signals");
			break;
		case 4:
			System.out.print("Fair signals");
			break;
		case 5:
			System.out.print("Fairly good signals");
			break;
		case 6:
			System.out.print("Good signals");
			break;
		case 7:
			System.out.print("Moderately strong signals");
			break;
		case 8:
			System.out.print("Strong signals");
			break;
		case 9:
			System.out.print("Extremely strong signals");
			break;
		}
		System.out.print(", ");
		switch(report_first) 
		{
		case 1:
			System.out.print("unreadable");
			break;
		case 2:
			System.out.print("barely readable, occasional words distinguishable");
			break;
		case 3:
			System.out.print("readable with considerable difficulty");
			break;
		case 4:
			System.out.print("readable with practically no difficulty");
			break;
		case 5:
			System.out.print("perfectly readable");
			break;
		}
	
	}
}
