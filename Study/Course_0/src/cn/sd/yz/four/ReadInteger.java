package cn.sd.yz.four;

import java.util.Scanner;

/**
 * 念整数
 * @author Yin
 *
 */
public class ReadInteger {
	public static void main(String[] args) {
		System.out.println("输入数据:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
//		判断数据范围
		if(num>100000&&num<-100000) 
		{
			throw new RuntimeException("数据范围错误！范围为[-100000,10000]");
		}
//		存放数据的数组
		int[] readNum = new int[6];
//		记录位数
		int digit = 0;
		if(num<0) 
		{
			System.out.print("fu ");
			num=-num;  //如果为负，变成正数
		}
//		拆分数据，保存到数组中
		for(int i=0;i<readNum.length;i++) {
			readNum[i] = num%10;
			num /= 10;
			digit = i;
			if(num==0) 
			{
				break;
			}
		}
//		输出数据
		for(int i=digit;i>0;i--) {
			judge1(readNum[i]);
		}
		judge2(readNum[0]);
	}

	public static void judge1(int a){
		switch(a) 
		{
		case 0:
			System.out.print("ling ");
			break;
		case 1:
			System.out.print("yi ");
			break;
		case 2:
			System.out.print("er ");
			break;
		case 3:
			System.out.print("san ");
			break;
		case 4:
			System.out.print("si ");
			break;
		case 5:
			System.out.print("wu ");
			break;
		case 6:
			System.out.print("liu ");
			break;
		case 7:
			System.out.print("qi ");
			break;
		case 8:
			System.out.print("ba ");
			break;
		case 9:
			System.out.print("jiu ");
			break;
		}
	}
	
	public static void judge2(int a){
		switch(a) 
		{
		case 0:
			System.out.print("ling");
			break;
		case 1:
			System.out.print("yi");
			break;
		case 2:
			System.out.print("er");
			break;
		case 3:
			System.out.print("san");
			break;
		case 4:
			System.out.print("si");
			break;
		case 5:
			System.out.print("wu");
			break;
		case 6:
			System.out.print("liu");
			break;
		case 7:
			System.out.print("qi");
			break;
		case 8:
			System.out.print("ba");
			break;
		case 9:
			System.out.print("jiu");
			break;
		}
	}
}
