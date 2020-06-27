package cn.sd.yz.qc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 日历查询第三版（添加区分平年闰年的方法）
 * @author Joker
 *
 */
public class QueryTheCalendar05 {
	public static void main(String[] args) throws ParseException {
		
		System.out.println("请输入要查询的日期：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();  //按照格式输入日期
		Calendar c = new GregorianCalendar();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = df.parse(str);  //将输入的日期转化成Date类
		c.setTime(d);   //将获得的Date类转化成Calendar类
		
		//检查年份为闰年还是平年
		int year = c.get(Calendar.YEAR);
		int record = Separate(year);   //record=1为闰年，record=0为平年
		
		
		int month = 4; //初始月份设定为4月，输入修改月份
		int monthday=30; //默认当月为30天，后续判断修改天数
		month= c.get(Calendar.MONTH)+1;  //获得当前月份，month=1代表一月
		//这里可以用方法c.getActualMaximum(Calendar.DATE)
		if(record==1) {			
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
				monthday=29;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				monthday=30;
				break;
			}
		}else {
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
			case 4:
			case 6:
			case 9:
			case 11:
				monthday=30;
				break;
			}
		}
		
		
		
		//设定本月的第一天的weekday，1-7分别对应周日-周六
		int day = c.get(Calendar.DATE);
		int weekday=0;
		//获得本月的第一天是周几
		if((c.get(Calendar.DAY_OF_WEEK)-day%7+1)<=0) {		
			weekday = 7 + c.get(Calendar.DAY_OF_WEEK)-day%7+1;	
		}else {
			weekday = c.get(Calendar.DAY_OF_WEEK)-day%7+1;
			}
		int space = weekday-1; //前边需要输入的空格
		
		//周日到周一
		System.out.println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六");
		
		for(int i=0;i<space;i++) {
			System.out.print(" \t");
		}
		
		//当月的每天
		int count1=1;
		for(int i=0;i<=((monthday+space)/7)+1;i++) {	
			for(int j=count1;(j+space)<(7+count1)&&j<=monthday;j++) {
				if(j==day) {
					System.out.print(j+"*\t");
				}else {
					System.out.print(j+"\t");
				}
						
			}
			if(weekday!=0) {
				count1+=7-space;
			}else {
				count1+=7;
			}
			space=0;
			System.out.println();
		}
	}
	
	public static int Separate(int year) {
		if(year%100==0&&year%400==0) {
			return 1;
		}if(year%100!=0&&year%4==0) {
			return 1;
		}else return 0;
	}
	
	
	
	
}
