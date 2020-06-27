package cn.sd.yz.io;

import java.io.*;

/**
 * 测试缓冲字符输入流  BufferedReader
 * 新方法：readLine()
 * @author Yin
 *
 */

public class TestIO12 {	
	public static void main(String[] args) {		
		File src = new File("text06.txt");
		//注意创建对象时，不要创建父类对象,因为readLine是子类的方法				
		try (BufferedReader reader = new BufferedReader(new FileReader(src))){						
			String line = null;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
