package cn.sd.yz.qc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ������ѯ����ѧ�ã�
 * @author Joker
 *
 */
public class QueryTheCalendar_SXT {
	public static void main(String[] args) throws ParseException {
		
		System.out.println("������Ҫ��ѯ�����ڣ�");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();  //���ո�ʽ��������
		Calendar c = new GregorianCalendar();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = df.parse(str);  //�����������ת����Date��
		c.setTime(d);   //����õ�Date��ת����Calendar��
		
		
		int day=c.get(Calendar.DATE);
		int days=c.getActualMaximum(Calendar.DATE);
		
		
		
		
		//�趨���µĵ�һ���weekday��1-7�ֱ��Ӧ����-����
		c.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		int space = weekday-1; //ǰ����Ҫ����Ŀո�
		
		//���յ���һ
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		
		for(int i=0;i<space;i++) {
			System.out.print(" \t");
		}
		
		//���µ�ÿ��
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
