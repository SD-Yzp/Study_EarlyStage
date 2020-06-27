package cn.sd.yz.io;

import java.io.*;

/**
 * ���Ի����ַ������  BufferedWriter
 * �������� newLine()
 * @author Yin
 *
 */
public class TestIO13 {
	public static void main(String[] args) {
		File src = new File("test.txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(src));){			
			writer.append("���鳾��������");
			writer.newLine();
			writer.append("Ը�����Ƭ���");
			writer.flush();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
