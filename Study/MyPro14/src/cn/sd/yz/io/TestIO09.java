package cn.sd.yz.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ��ѧ���ڵ��ֽ���������������
 * @author Yin
 *
 */
public class TestIO09 {
	public static void main(String[] args) {
		byte[] b = "abcdefg".getBytes();   //���ַ���ת��Ϊ�ֽ�����
		test(b);
	}
	
	public static void test(byte[] b) {
		InputStream is = new ByteArrayInputStream(b);
		StringBuilder sb = new StringBuilder();
		int temp = 0;
		int sum = 0;  //���ڱ����ȡ���ֽ���
		
		try {
			while((temp=is.read())!=-1) {
				sb.append((char)temp);
				sum++;
			}
			System.out.println(sb);
			System.out.println("������ֽ���Ϊ��"+sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) {					
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
