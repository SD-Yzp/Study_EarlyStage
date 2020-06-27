package cn.sd.yz.four;

import java.util.Scanner;

/**
 * ������
 * @author Yin
 *
 */
public class ReadInteger {
	public static void main(String[] args) {
		System.out.println("��������:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
//		�ж����ݷ�Χ
		if(num>100000&&num<-100000) 
		{
			throw new RuntimeException("���ݷ�Χ���󣡷�ΧΪ[-100000,10000]");
		}
//		������ݵ�����
		int[] readNum = new int[6];
//		��¼λ��
		int digit = 0;
		if(num<0) 
		{
			System.out.print("fu ");
			num=-num;  //���Ϊ�����������
		}
//		������ݣ����浽������
		for(int i=0;i<readNum.length;i++) {
			readNum[i] = num%10;
			num /= 10;
			digit = i;
			if(num==0) 
			{
				break;
			}
		}
//		�������
		for(int i=digit;i>0;i--) {
			judge1(readNum[i]);
		}
		judge2(readNum[0]);
	}

	public static void judge1(int a){
		switch(a) 
		{
		case 0:
			System.out.print("ling ");
			break;
		case 1:
			System.out.print("yi ");
			break;
		case 2:
			System.out.print("er ");
			break;
		case 3:
			System.out.print("san ");
			break;
		case 4:
			System.out.print("si ");
			break;
		case 5:
			System.out.print("wu ");
			break;
		case 6:
			System.out.print("liu ");
			break;
		case 7:
			System.out.print("qi ");
			break;
		case 8:
			System.out.print("ba ");
			break;
		case 9:
			System.out.print("jiu ");
			break;
		}
	}
	
	public static void judge2(int a){
		switch(a) 
		{
		case 0:
			System.out.print("ling");
			break;
		case 1:
			System.out.print("yi");
			break;
		case 2:
			System.out.print("er");
			break;
		case 3:
			System.out.print("san");
			break;
		case 4:
			System.out.print("si");
			break;
		case 5:
			System.out.print("wu");
			break;
		case 6:
			System.out.print("liu");
			break;
		case 7:
			System.out.print("qi");
			break;
		case 8:
			System.out.print("ba");
			break;
		case 9:
			System.out.print("jiu");
			break;
		}
	}
}
