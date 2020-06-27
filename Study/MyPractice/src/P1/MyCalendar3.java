package P1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *自制日历第二版
 *标出对应日期,优化之前的版本
 * @author Yin
 *
 */
public class MyCalendar3 {
	public static void main(String[] args) {
		String str = "2019-8-30";
		String[] date = str.split("-");
		int year = Integer.parseInt(date[0]);
//		月份从0开始
		int month = Integer.parseInt(date[1])-1;
		int day = Integer.parseInt(date[2]);
		Calendar c = new GregorianCalendar(year,month,day);
		
		int days = c.getActualMaximum(Calendar.DATE);//获得本月的最大值
		
		//设置日期为本月第一天
		c.set(Calendar.DATE,1);
		int startDay = c.get(Calendar.DAY_OF_WEEK);
		
		//打印日历第一行
		System.out.print("日\t一\t二\t三\t四\t五\t六\n");
		
		//通过第一天设置前边空出来的格子
		for(int i=1;i<startDay;i++)
		{
			System.out.print(" \t");
		}
		
		//打印日历每一行
		int count = 1;
		while(count<=days)
		{				
			for(int i=0;i<7-startDay+1&&count<=days;i++)
			{
				if(count==day)
				{							
					System.out.print(count+"*");
				}
				else
				{
					System.out.print(count);
				}
				
				if(i==7-startDay) 
				{		
					System.out.print("\n");
				}
				else
				{
					System.out.print("\t");
				}
				count++;
			}
			startDay = 1;			
		}
	}
}
