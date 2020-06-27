package cn.sd.yz.io;

import java.io.*;

/**
 * 采用缓冲字符流实现字符串的拷贝
 * @author Yin
 *
 */
public class Copy_String02 {
	public static void main(String[] args) {
		File src = new File("test.txt");
		File dest = new File("test_copy.txt");
		try (BufferedReader reader = new BufferedReader(new FileReader(src));
				BufferedWriter writer = new BufferedWriter(new FileWriter(dest));){
			String line = null;
			while((line=reader.readLine())!=null) {
				writer.append(line);
				writer.newLine();
			}
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
