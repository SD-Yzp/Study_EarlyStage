package cn.sd.yz.io;

import java.io.File;

/**
 * ���Ʒָ���separator  \ /
 * @author Yin
 *
 */
public class TestPath01 {
	public static void main(String[] args) {
		String path = "D:\\JAVA Code\\workspace\\MyPro13\\io.jfif";	
		System.out.println(path);
		
		//����1��ʹ��/
		path = "D:/JAVA Code/workspace/MyPro13/io.jfif";
		System.out.println(path);
		
		//����2��ʹ�ó���separatorƴ��
		path = "D:"+File.separator+"JAVA Code"+File.separator+"workspace"+File.separator+"Mypro13"+File.separator+"io.jfif";
		System.out.println(path);
	}
}
