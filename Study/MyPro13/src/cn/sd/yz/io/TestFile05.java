package cn.sd.yz.io;

import java.io.File;

/**
 * ����ļ��ĳ���
 * @author Yin
 *
 */
public class TestFile05 {
	public static void main(String[] args) {
		File src = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(src.length());  //��ȡ�ļ��ĳ���
		
		//�ļ�����Ϊ0���������
		
		//1���ļ���
		File src2 = new File("D:/JAVA Code/workspace/MyPro13");
		System.out.println(src2.length());
		
		//2���ļ�������
		File src3 = new File("D:/JAVA Code/workspace/MyPro13/io.png");
		System.out.println(src3.length());
	}
}
