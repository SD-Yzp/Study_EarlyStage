package cn.sd.yz.four;

import java.util.Scanner;

/**
 * �����n����������m�������ĺ�
 * @author Yin
 *
 */
public class PrimeSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		��n������
		int n = in.nextInt();
		int nPrime = 2;
//		��m������
		int m = in.nextInt();
//		�ж�n��m�Ƿ���Ϸ�Χ
		if(n<=0||m>200) 
		{
			throw new RuntimeException("��������ݷ�Χ��������ΧΪ0<n=m<=200");
		}
//		������
		int sum = 0;
//		�ҵ���n������
		int temp = 1;
		for(int i=2;temp<n;i++) 
		{
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					break;
				}
				if(j==i-1) 
				{					
					temp++;
				}
			}
			nPrime = i;
		}
//		�ҵ���m���������ۼ�
		for(int i=nPrime;temp<=m;i++) 
		{
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					break;
				}
				if(j==i-1) 
				{					
					temp++;
					sum+=i;
				}
			}
		}
		
		System.out.println(sum);
	}
}
