package cn.sd.yz.first;

import java.util.Scanner;

/**
 * ʵ�ֻ����¶�ת���������¶�
 * ����һ������Ϊ�����¶ȣ������Ӧ�������¶ȣ�Ҳ������
 * @author Yin
 *
 */
public class TemperatureChange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�����뻪���¶ȣ�");
//		�����¶�
		int fah = in.nextInt();
//		�����¶�
		int cel;
		cel = (fah-32)*5/9;
		System.out.println(cel);
	}
}
