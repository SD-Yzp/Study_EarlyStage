package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ��һ�β���������������
 * 
 * 1��ѡ��Դ
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ
 * @author Yin
 *
 */
public class TestIO01 {
	public static void main(String[] args) {
		//1��ѡ��Դ
		File src = new File("abc.txt");
		
		try {
			//2��ѡ����
			FileInputStream is = new FileInputStream(src);
			//3������
			int data1 = is.read(); //��һ������h
			int data2 = is.read(); //�ڶ�������e
			int data3 = is.read(); //����������l
			System.out.println((char)data1);
			System.out.println((char)data2);
			System.out.println((char)data3);
			//4���ͷ���Դ
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
