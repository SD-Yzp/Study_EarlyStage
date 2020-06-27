package cn.sd.yz.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * �����ļ�����ַ���
 * 1������Դ
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ
 * @author Yin
 *
 */
public class TestIO06 {
	public static void main(String[] args) {
		//1������Դ
		File dest = new File("text06.txt");
		//2��ѡ����
		Writer writer = null;
		try {
			writer = new FileWriter(dest);
			//3������
			String str = "���鳾�������������ű˷�\r\n";

//			//д��һ
//			char[] datas = str.toCharArray();   //�ַ���---->�ַ�����
//			writer.write(datas,0,datas.length);
			
			//д����
//			writer.write(str);

			//д����
			writer.append(str).append("ninelie");  //append���
			writer.append("----Aimer");
			
			
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
