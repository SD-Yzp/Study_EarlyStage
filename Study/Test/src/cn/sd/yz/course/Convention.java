package cn.sd.yz.course;

import java.util.Scanner;

/**
 *�������������Լ��
 * @author Yin
 *
 */
public class Convention {
	public static void main(String[] args) {
		test2();
	}
	
	private	static void test1() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int min = a;
		if(a==b){
			System.out.println(a+"��"+b+"�����Լ��Ϊ��"+a);
		}else {		
			if(b<a) {
				min = b;
			}
			for(int i=min;i>0;i--) {
				if(a%i==0 && b%i==0) {
					System.out.println(a+"��"+b+"�����Լ��Ϊ��"+i);
					break;
				}
			}
		} 		
	}
	
	private	static void test2() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int oa = a;
		int ob = b;
		int r = 1;
		while(b!=0) {
			r = a%b;
			System.out.println(a+","+b+","+r);
			a = b;
			b = r;
		}
		System.out.println(oa+"��"+ob+"�����Լ��Ϊ��"+a);
	}
}
