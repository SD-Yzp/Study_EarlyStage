package cn.sd.yz.qc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 日历查询（尚学堂）
 * @author Joker
 *
 */
public class QueryTheCalendar_SXT {
	public static void main(String[] args) throws ParseException {
		
		System.out.println("请输入要查询的日期：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();  //按照格式输入日期
		Calendar c = new GregorianCalendar();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = df.parse(str);  //将输入的日期转化成Date类
		c.setTime(d);   //将获得的Date类转化成Calendar类
		
		
		int day=c.get(Calendar.DATE);
		int days=c.getActualMaximum(Calendar.DATE);
		
		
		
		
		//设定本月的第一天的weekday，1-7分别对应周日-周六
		c.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		int space = weekday-1; //前边需要输入的空格
		
		//周日到周一
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		for(int i=0;i<space;i++) {
			System.out.print(" \t");
		}
		
		//当月的每天
		for(int i=1;i<=days;i++) {
			if(i==day) {
				System.out.print(i+"*\t");
			}else {
				System.out.print(i+"\t");
			}
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				System.out.println();
			}
			c.add(Calendar.DAY_OF_MONTH, 1);		
		}
		
			
		
	}	
}
