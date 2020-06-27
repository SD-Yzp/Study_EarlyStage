package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用输入、输出字节流实现文件的拷贝
 * try...with...resource
 */
public class Copy2 {
	public static void main(String[] args) {
		copy("D:/JAVA Code/workspace/MyPro14/src/cn/sd/yz/io/Copy.java","copy.txt");
	}
	
	
	static void copy(String srcPath,String destPath) {		
		//1、创建源
		File src = new File(srcPath);  //输入文件，源头
		File src_copy = new File(destPath);  //输出文件，目的地
		//2、选择流		
		//3、操作
		try (FileInputStream is = new FileInputStream(src);
				FileOutputStream os = new FileOutputStream(src_copy);){			
			//3、操作：分段读取
			byte[] data = new byte[1024]; //缓冲容器
			int len = -1; //接收长度
			try {
				while((len=is.read(data))!=-1) {
					os.write(data,0,len);  //分段写出
				}
				os.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
