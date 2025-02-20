package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 文件输入字符流
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author Yin
 *
 */
public class TestIO05 {
	public static void main(String[] args) {
		//1、创建源	
		File src = new File("abc.txt");
		//2、选择流
		Reader reader = null;
		try {
			reader = new FileReader(src);
			char[] ch = new char[1024];
			int len = -1;
			try {
				while((len=reader.read(ch))!=-1) {
					String s = new String(ch,0,len);
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) {					
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
