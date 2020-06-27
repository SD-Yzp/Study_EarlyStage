package cn.sd.yz.io;

import java.io.File;

/**
 * 判断文件的状态
 * @author Yin
 *
 */
public class TestFile04 {
	public static void main(String[] args) {
		File file = new File("D:/JAVA Code/workspace/MyPro13/io.jfif");
		
		System.out.println(file.exists());  //文件是否存在
		System.out.println(file.isFile());  //是否是文件
		System.out.println(file.isDirectory());  //是否是目录
		
		System.out.println("---------------");
		
		File file2 = new File("MyPro13/io.jfif");   //没有盘符，所以是相对于user.dir创建对象
		
		System.out.println(file2.getAbsolutePath());   
		System.out.println(file2.exists());
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());
		
		System.out.println("---------------");
		
		File file3 = new File("D:/JAVA Code/workspace/MyPro13");   
		
		System.out.println(file3.getAbsolutePath());   
		System.out.println(file3.exists());
		System.out.println(file3.isFile());
		System.out.println(file3.isDirectory());
		
	}
}
