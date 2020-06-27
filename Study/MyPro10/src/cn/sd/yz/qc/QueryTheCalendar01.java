package cn.sd.yz.qc;

import java.util.Scanner;

/**
 * 日历查询第一版（完成输出某个月的日期，不需要对应周几）
 * @author Joker
 *
 */
public class QueryTheCalendar01 {
	public static void main(String[] args) {
		
		//得到输入的月份的天数
		Scanner scanner = new Scanner(System.in);
		int month = 4; //初始月份设定为4月，输入修改月份
		int monthday=30; //默认当月为30天，后续判断修改天数
		month= scanner.nextInt();
		if(month>=1&&month<=12) {	
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				monthday=31;
				break;
			case 2:
				monthday=28;
				break;
			}
		}
		else {
			System.out.println("请输入正确的月份！");
		}
		
		//周日到周一
		System.out.println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六");
		//当月的每天
		int count1=1;
		for(int i=0;i<=(monthday/7)+1;i++) {	
			for(int j=count1;j<7+count1&&j<=monthday;j++) {
				System.out.print(j+"\t");
				
			}
			count1+=7;
			System.out.println();
		}
		
		
	}
}
