package P1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *���������ڶ���
 *������������
 * @author Yin
 *
 */
public class MyCalendar4 {
	public static void main(String[] args) {
		System.out.println("���������ڣ���ʽΪyyyy-MM-dd����");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] date = str.split("-");
		int year = Integer.parseInt(date[0]);
//		�·ݴ�0��ʼ
		int month = Integer.parseInt(date[1])-1;
		int day = Integer.parseInt(date[2]);
		Calendar c = new GregorianCalendar(year,month,day);
		
		int days = c.getActualMaximum(Calendar.DATE);//��ñ��µ����ֵ
		
		//��������Ϊ���µ�һ��
		c.set(Calendar.DATE,1);
		int startDay = c.get(Calendar.DAY_OF_WEEK);
		
		//��ӡ������һ��
		System.out.print("��\tһ\t��\t��\t��\t��\t��\n");
		
		//ͨ����һ������ǰ�߿ճ����ĸ���
		for(int i=1;i<startDay;i++)
		{
			System.out.print(" \t");
		}
		
		//��ӡ����ÿһ��
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
