package cn.sd.yz.io;

import java.io.File;
import java.io.IOException;

/**
 * �������ļ���ɾ���ļ�
 * @author Yin
 *
 */
public class TestFile06 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(src.exists());   //�ж��ļ��Ƿ����
		boolean flag = src.createNewFile();    //ֻ�����ļ������ڵ������²��ܴ���
		System.out.println(flag);
		
		System.out.println("---------------");
		
		File src2 = new File("D:/JAVA Code/workspace/MyPro13/io.txt");
		
		System.out.println(src2.exists());   //�ж��ļ��Ƿ����
		flag = src2.createNewFile();    //ֻ�����ļ������ڵ������²��ܴ���
		System.out.println(flag);
		
		flag = src2.delete();   //ɾ���ļ�
		System.out.println(flag);
		
		
		System.out.println("---------------");
		
		File src3 = new File("D:/JAVA Code/workspace/MyPro13/io");
		
		System.out.println(src3.exists());   //�ж��ļ��Ƿ����
		flag = src3.createNewFile();    //���ܴ����ļ��У�ֻ�ᴴ���ļ������ܴ���û�к�׺���ļ�
		System.out.println(flag);
		
		System.out.println("---------------");
		
		//���䣺�ļ���Ϊcon��com3���ļ����ܴ�������Ϊ��Щ�ǲ���ϵͳ���豸��
		File src4 = new File("D:/JAVA Code/workspace/MyPro13/con");
		flag = src4.createNewFile();
		System.out.println(flag);  //������Ȼ��ʾΪtrue������ˢ���ǲ�����ļ���
		
	}
}
