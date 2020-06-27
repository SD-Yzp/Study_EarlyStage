package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 第一次操作：理解操作步骤 标准
 * 
 * 1、选择源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author Yin
 *
 */
public class TestIO02 {
	public static void main(String[] args) {
		//1、选择源
		File src = new File("abc.txt");
		FileInputStream is = null;
		try {
			//2、选择流
			is = new FileInputStream(src);
			//3、操作
			int temp;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//4、释放资源
			try {
				if(is!=null) {					
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
