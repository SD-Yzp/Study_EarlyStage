package cn.sd.yz.qc;

import java.util.Scanner;

/**
 * ������ѯ�ڶ��棨��Ӧ�ܼ���
 * @author Joker
 *
 */
public class QueryTheCalendar02 {
	public static void main(String[] args) {
		
		//�õ�������·ݵ�����
		Scanner scanner = new Scanner(System.in);
		int month = 4; //��ʼ�·��趨Ϊ4�£������޸��·�
		int monthday=30; //Ĭ�ϵ���Ϊ30�죬�����ж��޸�����
		month= scanner.nextInt();
		if(month>=1&&month<=12) {	
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
			}
		}
		else {
			System.out.println("��������ȷ���·ݣ�");
		}
		
		
		//�趨���µĵ�һ���weekday��1-7�ֱ��Ӧ����-����
		int weekday = 5;	//ǰ�ߵ�5��������
		int space = weekday-1;
		
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
