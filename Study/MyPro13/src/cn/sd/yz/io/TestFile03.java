package cn.sd.yz.io;

import java.io.File;

/**
 * ���Ի�ȡ�ļ�����·����
 * @author Yin
 *
 */
public class TestFile03{
	public static void main(String[] args) {
		File file = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(file.getName());   //��ȡ�ļ�������
		System.out.println(file.getPath());   //��ȡ�ļ���·��
		System.out.println(file.getAbsolutePath());   //��ȡ�ļ��ľ���·��
		System.out.println(file.getParent());   //��ȡ�ļ��ĸ�·��
		
		File file2 = new File("MyPro13/io.jfif");
		
		System.out.println(file2.getName());   //��ȡ�ļ�������
		System.out.println(file2.getPath());   //��ȡ�ļ���·��
		System.out.println(file2.getAbsolutePath());   //��ȡ�ļ��ľ���·��
		System.out.println(file2.getParent());   //��ȡ�ļ��ĸ�·��
	}
}
