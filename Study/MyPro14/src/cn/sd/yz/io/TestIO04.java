package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件读取操作
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author Yin
 *
 */
public class TestIO04 {
	public static void main(String[] args) {
		//1、创建源
		File dest = new File("text.txt");
		//2、选择流
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(dest);
			//3、操作
			String str = "i am studying";
			try {
				os.write(str.getBytes());
				os.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(os!=null) {					
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
