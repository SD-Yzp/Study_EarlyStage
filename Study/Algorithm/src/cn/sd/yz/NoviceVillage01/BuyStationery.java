package cn.sd.yz.NoviceVillage01;

import java.util.Scanner;

public class BuyStationery {
	public static void main(String[] args) {
		double pen_Value = 19;
		
		double num;//可以买的数量
		
		//输入价格
		Scanner in = new Scanner(System.in);
		//a元b角
		int a = in.nextInt();
		int b = in.nextInt();
		
		double sum = a*10.0+b;
		
		num = sum/pen_Value;
		
		System.out.println((int)num);
	}
}
