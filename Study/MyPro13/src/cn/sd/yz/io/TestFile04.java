package cn.sd.yz.io;

import java.io.File;

/**
 * �ж��ļ���״̬
 * @author Yin
 *
 */
public class TestFile04 {
	public static void main(String[] args) {
		File file = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(file.exists());  //�ļ��Ƿ����
		System.out.println(file.isFile());  //�Ƿ����ļ�
		System.out.println(file.isDirectory());  //�Ƿ���Ŀ¼
		
		System.out.println("---------------");
		
		File file2 = new File("MyPro13/io.jfif");   //û���̷��������������user.dir��������
		
		System.out.println(file2.getAbsolutePath());   
		System.out.println(file2.exists());
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());
		
		System.out.println("---------------");
		
		File file3 = new File("D:/JAVA Code/workspace/MyPro13");   
		
		System.out.println(file3.getAbsolutePath());   
		System.out.println(file3.exists());
		System.out.println(file3.isFile());
		System.out.println(file3.isDirectory());
		
	}
}
