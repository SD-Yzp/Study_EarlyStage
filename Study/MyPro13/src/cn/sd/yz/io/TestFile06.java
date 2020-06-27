package cn.sd.yz.io;

import java.io.File;
import java.io.IOException;

/**
 * 创建新文件与删除文件
 * @author Yin
 *
 */
public class TestFile06 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(src.exists());   //判断文件是否存在
		boolean flag = src.createNewFile();    //只有在文件不存在的条件下才能创建
		System.out.println(flag);
		
		System.out.println("---------------");
		
		File src2 = new File("D:/JAVA Code/workspace/MyPro13/io.txt");
		
		System.out.println(src2.exists());   //判断文件是否存在
		flag = src2.createNewFile();    //只有在文件不存在的条件下才能创建
		System.out.println(flag);
		
		flag = src2.delete();   //删除文件
		System.out.println(flag);
		
		
		System.out.println("---------------");
		
		File src3 = new File("D:/JAVA Code/workspace/MyPro13/io");
		
		System.out.println(src3.exists());   //判断文件是否存在
		flag = src3.createNewFile();    //不能创建文件夹，只会创建文件，可能创建没有后缀的文件
		System.out.println(flag);
		
		System.out.println("---------------");
		
		//补充：文件名为con，com3的文件不能创建，因为这些是操作系统的设备名
		File src4 = new File("D:/JAVA Code/workspace/MyPro13/con");
		flag = src4.createNewFile();
		System.out.println(flag);  //这里虽然显示为true，但是刷新是不会出文件的
		
	}
}
