package cn.sd.yz.io;

import java.io.File;

/**
 * ��ӡ�ļ��д�С
 * @author Yin
 *
 */
public class TestDir04 {
	public static void main(String[] args) {
		File file = new File("D:/�������");
		int length = countFileLength(file);
		System.out.println(length);
	}
	
	public static int countFileLength(File file) {
		//�ݹ�ͷ
		if(file == null || !file.exists()) {
			throw new RuntimeException("�ļ������ڣ�") ;
		}
		
		int sum=0;
		if(file.isFile()) {
			
			sum+=file.length();
		}else {
			File[] src = file.listFiles();
			for(File f:src) {
				sum+=countFileLength(f);
			}
		}
		
		return sum;
	}
}
