package cn.sd.yz.io;

import java.io.File;

/**
 * 构建File对象
 * @author Yin
 *
 */
public class TestFile01 {
	public static void main(String[] args) {
		String path = "D:/JAVA Code/workspace/MyPro13/io.jfif";
		
		//构建方式一：直接加路径名称path
		File file1 = new File(path);
		System.out.println(file1);
		
		//构建方式二：加父路径名称和子路径名称
		File file2 = new File("D:/JAVA Code/workspace/MyPro13","io.jfif");
		File file3 = new File("D:/JAVA Code/workspace","MyPro13/io.jfif");
		System.out.println(file2);
		System.out.println(file3);
		
		//构建方式三：构建父类对象和子路径名称
		File file4 = new File(new File("D:/JAVA Code/workspace/MyPro13/"),"io.jfif");
		System.out.println(file4);
	}
}
