package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 四个步骤：分段读取
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * 
 * @author Yin
 *
 */
public class TestIO03 {
	public static void main(String[] args) {
		//1、创建源
		File src = new File("abc.txt");
		//2、选择流
		FileInputStream is = null;
		try {
			is = new FileInputStream(src);
			byte[] datas = new byte[5];   //缓冲容器
			int len = -1;  //接收长度
			try {
				//3、操作
				while((len=is.read(datas))!=-1) {
					//字节数组-->字符数组（解码）
					String str = new String(datas,0,len);
					System.out.println(str);
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
				if(is!=null) {	
					//4、释放资源
					is.close();
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
}
