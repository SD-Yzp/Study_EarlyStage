package cn.sd.yz.three;

import java.util.Scanner;

/**
 * ͨ����ż������ö�������
 * @author Yin
 *
 */
public class ParityFeature {
	public static void main(String[] args) {
		System.out.println("��������������");
		Scanner in = new Scanner(System.in);
//		�����������
		int num = in.nextInt();
//		��¼num��ÿλ��
		int temp;
//		λ��
		int i=1;
//		��õĽ��
		int result = 0;
		while(num!=0) 
		{
			temp = num % 10;
			num /= 10;
			if((temp%2==0&&i%2==0)||(temp%2!=0&&i%2!=0)) 
			{
				result += (int) Math.pow(2, i-1);				
			} 
			i++;
		}
//		������
		System.out.println(result);
		
	}
}
