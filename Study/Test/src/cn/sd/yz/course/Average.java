package cn.sd.yz.course;

import java.util.Scanner;

/**
 * ��ƽ����
 * @author Yin
 *
 */
public class Average {
	public static void main(String[] args) {
//		ÿ���������
		int num = 0;
//		�ܺ�
		int sum = 0;
//		�����˶��ٸ���
		int count = -1;
//		ƽ����
		double average = 0;
		Scanner in = new Scanner(System.in);
//		������-1ʱֹͣ����
		while(num!=-1){
			sum += num;
			count++; 
			num = in.nextInt();
		}
		if(count == 0) {
			System.out.println("û��������Ч������");
		}else {			
			average = sum*1.0/count;
			System.out.println(average);
		}
	}
}
