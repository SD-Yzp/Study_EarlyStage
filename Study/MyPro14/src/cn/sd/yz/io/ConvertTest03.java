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
public class ConvertTest03 {
	public static void main(String[] args) {
		//���������������ذٶ�Դ��
		try(BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));
				BufferedWriter writer = 
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html"),"UTF-8"));){
			//��������ȡ��
			String msg = "";
			while((msg=reader.readLine())!=null) {
//				System.out.println(msg);
				writer.write(msg);
				writer.newLine();
			}
			writer.flush();
		}catch(IOException e) {
			System.out.println("��������");
		}
	}
}
