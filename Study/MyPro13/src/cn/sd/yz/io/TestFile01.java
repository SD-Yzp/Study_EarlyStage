package cn.sd.yz.io;

import java.io.File;

/**
 * ����File����
 * @author Yin
 *
 */
public class TestFile01 {
	public static void main(String[] args) {
		String path = "D:/JAVA Code/workspace/MyPro13/io.jfif";
		
		//������ʽһ��ֱ�Ӽ�·������path
		File file1 = new File(path);
		System.out.println(file1);
		
		//������ʽ�����Ӹ�·�����ƺ���·������
		File file2 = new File("D:/JAVA Code/workspace/MyPro13","io.jfif");
		File file3 = new File("D:/JAVA Code/workspace","MyPro13/io.jfif");
		System.out.println(file2);
		System.out.println(file3);
		
		//������ʽ������������������·������
		File file4 = new File(new File("D:/JAVA Code/workspace/MyPro13/"),"io.jfif");
		System.out.println(file4);
	}
}
