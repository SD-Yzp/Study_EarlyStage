package cn.sd.yz.second;

import java.util.Scanner;

/**
 * �������Э��ʱ(UTC)�ͱ���ʱ��֮���ת��(BJT)
 * @author Yin
 *
 */
public class TimeChange {
	public static void main(String[] args) {
		System.out.println("������UTCʱ�䣺");
		Scanner in = new Scanner(System.in);
//		����Э��ʱ		
		int utc = in.nextInt();
//		����ʱ��
		int bjt;
//		�ж�ʱ��������ʽ�Ƿ���ȷ
		if(utc<0||utc>2359) {
			throw new RuntimeException("�����ʱ�䷶Χ���󣡷�ΧΪ0-2359");			
		}
//		���ʱ�任��
		if(utc/100>7) {
			bjt = utc - 800;
		}else {
			bjt = utc - 800 + 2400;
		}
		System.out.println("����ʱ��Ϊ��"+bjt);
	}
}
