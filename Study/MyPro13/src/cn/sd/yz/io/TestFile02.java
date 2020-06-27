package cn.sd.yz.io;

import java.io.File;

/**
 * 相对路径：不存在盘符 ，以user.dir作为相对目录
 * 绝对路径：存在盘符
 * 
 * File可以构建文件，也可构建不存在的文件和路径
 * 
 * @author Yin
 *
 */
public class TestFile02 {
	public static void main(String[] args) {
		String path = "D:/JAVA Code/workspace/MyPro13/io.jfif";
		
		//1、绝对路径创建对象
		File file1 = new File(path);
		System.out.println(file1.getAbsolutePath());
		
		//2、相对路径创建对象
		System.out.println(System.getProperty("user.dir"));  //输出当前工程所在的目录，这一句了解即可
		File file2 = new File("io.jfif");
		System.out.println(file2.getAbsolutePath());
		
		
		//3、构建一个不存在的文件
		File file3 = new File("aaa/io2.png");
		System.out.println(file3.getAbsolutePath());
	}
}
