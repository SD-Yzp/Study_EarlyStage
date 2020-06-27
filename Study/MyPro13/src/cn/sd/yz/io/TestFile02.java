package cn.sd.yz.io;

import java.io.File;

/**
 * ���·�����������̷� ����user.dir��Ϊ���Ŀ¼
 * ����·���������̷�
 * 
 * File���Թ����ļ���Ҳ�ɹ��������ڵ��ļ���·��
 * 
 * @author Yin
 *
 */
public class TestFile02 {
	public static void main(String[] args) {
		String path = "D:/JAVA Code/workspace/MyPro13/io.jfif";
		
		//1������·����������
		File file1 = new File(path);
		System.out.println(file1.getAbsolutePath());
		
		//2�����·����������
		System.out.println(System.getProperty("user.dir"));  //�����ǰ�������ڵ�Ŀ¼����һ���˽⼴��
		File file2 = new File("io.jfif");
		System.out.println(file2.getAbsolutePath());
		
		
		//3������һ�������ڵ��ļ�
		File file3 = new File("aaa/io2.png");
		System.out.println(file3.getAbsolutePath());
	}
}
