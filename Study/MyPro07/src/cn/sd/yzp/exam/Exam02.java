package cn.sd.yzp.exam;

import java.util.Scanner;

/**
 * �����±�̵�һ�⣨�������룩
 * @author Joker
 *
 */
public class Exam02 {
	public static void main(String[] args) {
		String[] str1 = new String[10];
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("������һ���ַ���");
		String str2 = scanner.next();   //�Ӽ�������str2
			
		//����a1����
		for(int i=0;i<str1.length;i++) {
			str1[i]="a"+i;
		}
		
//		//������������
//		for(int i=0;i<str1.length;i++) {
//			System.out.print(str1[i]+" ");
//		}		
		
		int i=0;
		while(true) {
			if(str2.equals(str1[i])) {
				System.out.println("Yes");
				break;
			}else {i++;}

			
			if(i==str1.length) {
				System.out.println("No");
				break;
			}
		}
		
	}	
}	
	



//@Override
//public String toString(String[] str) {
//	StringBuilder sb = new StringBuilder();
//	sb.append("[");
//	for(int i=0;i<str.length;i++) {
//		sb.append(str[i]+",");
//	}
//	sb.indexOf("]", str.length-1);
//	return sb.toString();
//}



