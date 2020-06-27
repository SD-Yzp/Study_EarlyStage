package cn.sd.yz.cl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * �����������ʹ��
 * @author J
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2019,4,7);  //������5��
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK); // ���ڼ���1-7,1�������գ�2������һ....7��������
		int day = calendar.get(Calendar.DATE); // Ҳ����ʹ��DATE_OF_MONTH��
		
		printCalendar(calendar);
		System.out.println(year);
		System.out.println(month);  //0-11��ʾ��Ӧ���·ݡ�0��һ��...11��ʮ����
		System.out.println(weekday);
		System.out.println(day);
		
		System.out.println("--------------------");
	
		//�������ڵ����Ԫ��
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 9102);
	
		printCalendar(c2);
		
		//���ڵļ���
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.YEAR, -100);
		printCalendar(c3);
	
		//���ڶ����ʱ������ת��
		Date d4 = c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());
	}
	
	
	public static void printCalendar(Calendar c) {
		//��ӡ���ڣ���ʽΪyyyy-MM-dd
		int year = c.get(Calendar.YEAR);
		int month  = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;
		String dayweek2 = dayweek==0?"��":dayweek+"";
		
		System.out.println(year+"-"+month+"-"+day+" ��"+dayweek2);
	}
	
	
	
}
