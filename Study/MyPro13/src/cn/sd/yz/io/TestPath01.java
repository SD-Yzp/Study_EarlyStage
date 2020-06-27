package cn.sd.yz.io;

import java.io.File;

/**
 * 名称分隔符separator  \ /
 * @author Yin
 *
 */
public class TestPath01 {
	public static void main(String[] args) {
		String path = "D:\\JAVA Code\\workspace\\MyPro13\\io.jfif";	
		System.out.println(path);
		
		//建议1、使用/
		path = "D:/JAVA Code/workspace/MyPro13/io.jfif";
		System.out.println(path);
		
		//建议2、使用常量separator拼接
		path = "D:"+File.separator+"JAVA Code"+File.separator+"workspace"+File.separator+"Mypro13"+File.separator+"io.jfif";
		System.out.println(path);
	}
}
