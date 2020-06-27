package cn.sd.yz.io;

import java.io.*;

/**
 * 测试缓冲字符输出流  BufferedWriter
 * 新增方法 newLine()
 * @author Yin
 *
 */
public class TestIO13 {
	public static void main(String[] args) {
		File src = new File("test.txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(src));){			
			writer.append("尘归尘，土归土");
			writer.newLine();
			writer.append("愿灵的碎片随风");
			writer.flush();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
