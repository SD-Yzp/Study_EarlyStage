package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 第一次操作：理解操作步骤
 * 
 * 1、选择源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author Yin
 *
 */
public class TestIO01 {
	public static void main(String[] args) {
		//1、选择源
		File src = new File("abc.txt");
		
		try {
			//2、选择流
			FileInputStream is = new FileInputStream(src);
			//3、操作
			int data1 = is.read(); //第一个数据h
			int data2 = is.read(); //第二个数据e
			int data3 = is.read(); //第三个数据l
			System.out.println((char)data1);
			System.out.println((char)data2);
			System.out.println((char)data3);
			//4、释放资源
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
