package cn.sd.yz.cl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类的使用
 * @author J
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2019,4,7);  //这里是5月
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK); // 星期几。1-7,1：星期日，2：星期一....7：星期六
		int day = calendar.get(Calendar.DATE); // 也可以使用DATE_OF_MONTH。
		
		printCalendar(calendar);
		System.out.println(year);
		System.out.println(month);  //0-11表示对应的月份。0是一月...11是十二月
		System.out.println(weekday);
		System.out.println(day);
		
		System.out.println("--------------------");
	
		//设置日期的相关元素
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 9102);
	
		printCalendar(c2);
		
		//日期的计算
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.YEAR, -100);
		printCalendar(c3);
	
		//日期对象和时间对象的转化
		Date d4 = c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());
	}
	
	
	public static void printCalendar(Calendar c) {
		//打印日期，格式为yyyy-MM-dd
		int year = c.get(Calendar.YEAR);
		int month  = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;
		String dayweek2 = dayweek==0?"日":dayweek+"";
		
		System.out.println(year+"-"+month+"-"+day+" 周"+dayweek2);
	}
	
	
	
}
