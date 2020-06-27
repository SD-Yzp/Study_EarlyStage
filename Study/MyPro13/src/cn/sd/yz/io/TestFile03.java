package cn.sd.yz.io;

import java.io.File;

/**
 * 测试获取文件名、路径名
 * @author Yin
 *
 */
public class TestFile03{
	public static void main(String[] args) {
		File file = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(file.getName());   //获取文件的名称
		System.out.println(file.getPath());   //获取文件的路径
		System.out.println(file.getAbsolutePath());   //获取文件的绝对路径
		System.out.println(file.getParent());   //获取文件的父路径
		
		File file2 = new File("MyPro13/io.jfif");
		
		System.out.println(file2.getName());   //获取文件的名称
		System.out.println(file2.getPath());   //获取文件的路径
		System.out.println(file2.getAbsolutePath());   //获取文件的绝对路径
		System.out.println(file2.getParent());   //获取文件的父路径
	}
}
