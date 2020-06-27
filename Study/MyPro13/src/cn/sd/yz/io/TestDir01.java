package cn.sd.yz.io;

import java.io.File;

/**
 * ����mdkir��mdkirs
 * mkdir������Ŀ¼����������ϼ�Ŀ¼
 * mkdirs��ͬmkdir������ϼ�Ŀ¼�����ڣ�ͬʱ����
 * @author Yin
 *
 */
public class TestDir01 {
	public static void main(String[] args) {
		File dir = new File("D:/JAVA Code/workspace/MyPro13/dir/test1");
		
		//1��ʹ��mkdir�����ϼ�Ŀ¼�����ڵ�Ŀ¼
		boolean flag = dir.mkdir();
		System.out.println(flag);
		
		//2��ʹ��mkdirs�����ϼ�Ŀ¼�����ڵ�Ŀ¼   
		//ע�⣺mkdirsҲ���ڴ������ɹ�������������ļ��е�����ΪIO֮��
		flag = dir.mkdirs();
		System.out.println(flag);
		
		//1��ʹ��mkdir�����ϼ�Ŀ¼�����ڵ�Ŀ¼
		dir = new File("D:/JAVA Code/workspace/MyPro13/dir/test2");
		flag = dir.mkdir();
		System.out.println(flag);
	}
}
