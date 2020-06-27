package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ĸ����裺�ֶζ�ȡ
 * 1������Դ
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ
 * 
 * @author Yin
 *
 */
public class TestIO03 {
	public static void main(String[] args) {
		//1������Դ
		File src = new File("abc.txt");
		//2��ѡ����
		FileInputStream is = null;
		try {
			is = new FileInputStream(src);
			byte[] datas = new byte[5];   //��������
			int len = -1;  //���ճ���
			try {
				//3������
				while((len=is.read(datas))!=-1) {
					//�ֽ�����-->�ַ����飨���룩
					String str = new String(datas,0,len);
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) {	
					//4���ͷ���Դ
					is.close();
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
}
