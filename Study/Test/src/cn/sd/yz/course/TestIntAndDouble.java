package cn.sd.yz.course;

import java.util.Scanner;

public class TestIntAndDouble {
	public static void main(String[] args) {	
		int foot;
		int inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		double metre;
		System.out.println(getType(foot+(float)inch/10));
		//���ּ��㷽��
		metre =  (foot+((float)inch/12))*0.3048;
		System.out.println(metre);
		metre =  (foot+inch/12.0)*0.3048;
		System.out.println(metre);
		//�������ļ�����������
		System.out.println(1.2-1.1);
	}
	private static String getType(Object o) {
		// TODO Auto-generated method stub
		return o.getClass().toString();
	}
}

