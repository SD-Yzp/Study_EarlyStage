package cn.sd.yz.io;

import java.io.UnsupportedEncodingException;

/**
 * ���Խ���(decode)�Լ����ܳ�����������
 * @author Yin
 *
 */
public class TestDecode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "��������ʹ��a";
		//���룺�ֽ�����
		byte[] datas = s.getBytes(); //Ĭ��ʹ�ù��̵��ַ���UTF-8
		
		//���룺�ַ���String(byte[] bytes,int offset,int length,String charsetName)
		s = new String(datas,0,datas.length,"gbk");
		System.out.println(s);
		
		//����
		//1���ֽ�������
		s = new String(datas,0,datas.length-2,"gbk");
		System.out.println(s);
		s = new String(datas,0,datas.length-1,"gbk");		
		System.out.println(s);
		
		//2���ַ�����ͳһ
		s = new String(datas,0,datas.length,"utf16");
		System.out.println(s);
	}
}
