package cn.sd.yz.io;

import java.io.*;
import java.net.URL;

/**
 * ����ת����
 * 1�����ַ�������ʽ�����ֽ��������ı��ģ�
 * 2��ָ���ַ���
 * @author Yin
 *
 */
public class ConvertTest02 {
	public static void main(String[] args) {
		//���������������ذٶ�Դ��
		try(BufferedReader is = 
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));){
			//��������ȡ��
			String msg = "";
			while((msg=is.readLine())!=null) {
				System.out.println(msg);  //���ܳ��������ԭ���ַ�����ƥ��
			}		
		}catch(IOException e) {
			System.out.println("��������");
		}
	}
	
	
	
	
	public static void test02() {
		//���������������ذٶ�Դ��
		try(InputStreamReader is = 
				new InputStreamReader(
						new URL("http://www.baidu.com").openStream(),"UTF-8");){
			//��������ȡ��
			int temp;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);  //���������ԭ���ֽ��������������
			}		
		}catch(IOException e) {
			System.out.println("��������");
		}		
	
	}
	



	public static void test01() {
		//���������������ذٶ�Դ��
		try(InputStream is = new URL("http://www.baidu.com").openStream();){
			//��������ȡ��
			int temp = -1;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}		
		}catch(IOException e) {
			System.out.println("��������");
		}		
	}
}
