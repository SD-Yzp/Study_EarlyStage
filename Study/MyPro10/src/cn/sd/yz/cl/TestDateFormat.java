package cn.sd.yz.cl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�������ַ���֮��Ļ���ת��
 * DateFormat�������SimpleDateFormatʵ�����ʹ��
 * @author J
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//��ʱ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ���ַ���
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(new Date(4000000));
		System.out.println(str);
	
		//���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ��ʱ�����
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = df2.parse("1983-5-10 10:45:39");
		System.out.println(date);
		
		//���������ĸ�ʽ�ַ�
		DateFormat df3 = new SimpleDateFormat("D");  //D��ʾ���е����������Բ�ѯAPI�˽�DateFormat����ظ�ʽ
		String str3 = df3.format(new Date());
		System.out.println(str3);
	}
}
