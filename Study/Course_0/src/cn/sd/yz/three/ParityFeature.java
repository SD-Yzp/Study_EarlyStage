package cn.sd.yz.three;

import java.util.Scanner;

/**
 * 通过奇偶特征获得二进制数
 * @author Yin
 *
 */
public class ParityFeature {
	public static void main(String[] args) {
		System.out.println("请输入正整数：");
		Scanner in = new Scanner(System.in);
//		输入的正整数
		int num = in.nextInt();
//		记录num的每位数
		int temp;
//		位数
		int i=1;
//		获得的结果
		int result = 0;
		while(num!=0) 
		{
			temp = num % 10;
			num /= 10;
			if((temp%2==0&&i%2==0)||(temp%2!=0&&i%2!=0)) 
			{
				result += (int) Math.pow(2, i-1);				
			} 
			i++;
		}
//		输出结果
		System.out.println(result);
		
	}
}
