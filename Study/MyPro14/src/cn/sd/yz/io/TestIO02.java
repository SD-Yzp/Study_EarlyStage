package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ��һ�β��������������� ��׼
 * 
 * 1��ѡ��Դ
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ
 * @author Yin
 *
 */
public class TestIO02 {
	public static void main(String[] args) {
		//1��ѡ��Դ
		File src = new File("abc.txt");
		FileInputStream is = null;
		try {
			//2��ѡ����
			is = new FileInputStream(src);
			//3������
			int temp;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//4���ͷ���Դ
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
