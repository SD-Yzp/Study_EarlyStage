package cn.sd.yz.qc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ������ѯ�����棨���ո�ʽ�������ڣ���õ��µ�������
 * @author Joker
 *
 */
public class QueryTheCalendar03 {
	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();  //���ո�ʽ��������
		Calendar c = new GregorianCalendar();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = df.parse(str);  //�����������ת����Date��
		c.setTime(d);   //����õ�Date��ת����Calendar��
		
		
		
		int month = 4; //��ʼ�·��趨Ϊ4�£������޸��·�
		int monthday=30; //Ĭ�ϵ���Ϊ30�죬�����ж��޸�����
		month= c.get(Calendar.MONTH)+1;  //��õ�ǰ�·ݣ�month=1����һ��
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
		
		
		
		//�趨���µĵ�һ���weekday��1-7�ֱ��Ӧ����-����
		int day = c.get(Calendar.DATE);
		int weekday=0;
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		if((c.get(Calendar.DAY_OF_WEEK)-day%7+1)<=0) {		
			weekday = 7 + c.get(Calendar.DAY_OF_WEEK)-day%7+1;	
		}else {
			weekday = c.get(Calendar.DAY_OF_WEEK)-day%7+1;
			}
		int space = weekday-1; //ǰ����Ҫ����Ŀո�
		
		//���յ���һ
		System.out.println("��"+"\t"+"һ"+"\t"+"��"+"\t"+"��"+"\t"+"��"+"\t"+"��"+"\t"+"��");
		
		for(int i=0;i<space;i++) {
			System.out.print(" \t");
		}
		
		//���µ�ÿ��
		int count1=1;
		for(int i=0;i<=((monthday+space)/7)+1;i++) {	
			for(int j=count1;(j+space)<(7+count1)&&j<=monthday;j++) {
				System.out.print(j+"\t");
						
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
}
