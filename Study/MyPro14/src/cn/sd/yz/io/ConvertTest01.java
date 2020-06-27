package cn.sd.yz.io;

import java.io.*;

/**
 * ����ת����
 * InputStreamReader OutputStreamWriter
 * ʹ��System.in System.out
 * @author Yin
 *
 */
public class ConvertTest01 {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));){
			//ѭ����ȡ���̵�����(exit�˳�)�����������
			String msg = "";
			while(!msg.equals("exit")) {
				msg = reader.readLine();  //ѭ����ȡ
				writer.write(msg);  //ѭ��д��
				writer.newLine();
				writer.flush();   //ע�⣺ʹ��BufferedReader���л���ģ��������û��ǿ��ˢ��ֻ�дﵽ����Ż�д��
			}
		}catch(IOException e) {
			System.out.println("��������");
		}
		
	}
}
