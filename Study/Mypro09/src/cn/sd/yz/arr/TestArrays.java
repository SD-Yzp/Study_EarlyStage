package cn.sd.yz.arr;

import java.util.Arrays;

/**
 * ����java.util.Arrays�������ʹ��
 * @author Joker
 *
 */
public class TestArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		System.out.println(a);  //��ӡ�������õ�ֵ
		System.out.println(Arrays.toString(a)); //��ӡ���������
		
		System.out.println("------------");
		
		int[] b = {34,455,123,555,126};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.binarySearch(b, 123));  //���ַ����ҷ�������
		System.out.println(Arrays.binarySearch(a, 123));  //���ַ����ҷ�������
		
	}
}
