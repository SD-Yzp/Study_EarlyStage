package cn.sd.yz.cl;

import java.util.Date;

/**
 * ����Date��
 * @author J
 *
 */
public class TestDate {
	public static void main(String[] args) {
		Date d = new Date(2000);  //CSTָ���Ƕ�����ʱ��
		System.out.println(d);
		
		System.out.println(d.getTime());
		
		Date d2 = new Date();  //Ĭ��Ϊ��ǰʱ��
		System.out.println(d2.getTime());
		
		System.out.println(d2.after(d));
		
		//��ɾ���ߵĴ������ַ����Ѿ����ϳ����ˣ����Ƽ�ʹ�ã��������ڴ���ʹ��Calender������
		Date d3 = new Date(2019-1900,5,6);  //2019��6��6��
		System.out.println(d3);
	}
}
