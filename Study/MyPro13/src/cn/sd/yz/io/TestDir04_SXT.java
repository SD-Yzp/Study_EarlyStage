package cn.sd.yz.io;

import java.io.File;

/**
 * ��ӡ�ļ��д�С
 * @author Yin
 *
 */
public class TestDir04_SXT {
	public static void main(String[] args) {
		File file = new File("D:/�������");
		countFileLength(file);
		System.out.println(len);
	}
	
	private static int len=0;
	
	public static void countFileLength(File file) {
		//�ݹ�ͷ
		if(file == null || !file.exists()) {
			throw new RuntimeException("�ļ������ڣ�") ;
		}
		
		//�ݹ���
		if(file.isFile()) {
			len+=file.length();			
		}else{
			File[] src = file.listFiles();
			for(File f:src) {
				countFileLength(f);
			}
		}
		
		
	}
}
