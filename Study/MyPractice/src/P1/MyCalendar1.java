package P1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *����������һ�� 
 *��ӡ������Ϣ�����յ�������ÿ�µ�����
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
		
		int days = c.getActualMaximum(Calendar.DATE);//��ñ��µ����ֵ
	
		
		//��ӡ������һ��
		System.out.print("��\tһ\t��\t��\t��\t��\t��\n");
		
		
		//��ӡ����ÿһ��
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
