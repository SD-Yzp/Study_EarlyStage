package cn.sd.yz.io;

import java.io.*;

/**
 * ���Ի����ַ�������  BufferedReader
 * �·�����readLine()
 * @author Yin
 *
 */

public class TestIO12 {	
	public static void main(String[] args) {		
		File src = new File("text06.txt");
		//ע�ⴴ������ʱ����Ҫ�����������,��ΪreadLine������ķ���				
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
