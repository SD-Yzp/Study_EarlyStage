package cn.sd.yz.io;

import java.io.File;

/**
 * 获得文件的长度
 * @author Yin
 *
 */
public class TestFile05 {
	public static void main(String[] args) {
		File src = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(src.length());  //获取文件的长度
		
		//文件长度为0的两种情况
		
		//1、文件夹
		File src2 = new File("D:/JAVA Code/workspace/MyPro13");
		System.out.println(src2.length());
		
		//2、文件不存在
		File src3 = new File("D:/JAVA Code/workspace/MyPro13/io.png");
		System.out.println(src3.length());
	}
}
