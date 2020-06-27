package P1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *自制日历第一版 
 *打印基础信息，周日到周六和每月的天数
 * @author Yin
 *
 */
public class MyCalendar1 {
	public static void main(String[] args) {
		String str = "2019-8-30";
		String[] date = str.split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1])-1;
		int day = Integer.parseInt(date[2]);
		Calendar c = new GregorianCalendar(year,month,day);
		
		int days = c.getActualMaximum(Calendar.DATE);//获得本月的最大值
	
		
		//打印日历第一行
		System.out.print("日\t一\t二\t三\t四\t五\t六\n");
		
		
		//打印日历每一行
		int count = 1;
		while(count<=days)
		{
			for(int i=0;i<7&&count<=days;i++)
			{
				if(i==6) 
				{					
					System.out.print(count+"\n");
				}
				else
				{
					System.out.print(count+"\t");
				}
				count++;
			}
		}
	}
}
