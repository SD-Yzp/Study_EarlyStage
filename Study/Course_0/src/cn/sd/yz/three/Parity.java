package cn.sd.yz.three;

import java.util.Scanner;

/**
 * �ж���ż����
 * @author Yin
 *
 */
public class Parity {
	public static void main(String[] args) {
		System.out.println("������һϵ����������");
		Scanner in = new Scanner(System.in);
//		���������������
		int num = in.nextInt();
//		�����ĸ���
		int oddNumber = 0;
//		ż���ĸ���
		int evenNumber = 0;		
		while(num != -1) 
		{
			if(num>=100000||num<=0) {
				throw new RuntimeException("�����ķ�Χ���󣡷�ΧΪ(0,100000)");
			}
			if(num%2 == 0) 
			{
				evenNumber++;		
			}
			else 
			{
				oddNumber++;
			}
			num = in.nextInt();
		}
	
		System.out.println(oddNumber+" "+evenNumber);
	}
}
