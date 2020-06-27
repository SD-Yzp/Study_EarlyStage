package cn.sd.yz.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将文件输入字节流和字节数组流结合起来
 * 1、将文件读入程序，再从程序输入到缓存区
 * 2、将缓存区的内容读入程序，再从程序输出到文件
 * @author Yin
 *
 */
public class TestIO11 {
	public static void main(String[] args) {
		byte[] datas = fileToByteArray("desk.jpg");
		byteArrayToFile(datas,"desk_copy.jpg");
	}
	
	//1、将文件读入程序，再从程序输入到缓存区
	//一、图片到程序 FileInputStream
	//二、程序到字节数组ByteArrayOutputStream
	public static byte[] fileToByteArray(String filePath) {
		File src = new File(filePath);
		
		FileInputStream is = null;
		ByteArrayOutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new ByteArrayOutputStream();
			byte[] datas = new byte[1024*10];
			int len = -1;
			try {
				while((len=is.read(datas))!=-1) {
					os.write(datas,0,len);
				}
				os.flush();
				return os.toByteArray();
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
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	
	}
		
	//2、将缓存区的内容读入程序，再从程序输出到文件
	//一、字节数组到程序 ByteArrayInputStream
	//二、程序到文件 FileOutputStream
	public static void byteArrayToFile(byte[] datas,String filePath) {
		ByteArrayInputStream is = null;
		FileOutputStream os = null;
		is = new ByteArrayInputStream(datas);
		
		byte[] datas_read = new byte[1024*10];
		int len = -1;
		try {
			os = new FileOutputStream(filePath);
			while((len=is.read(datas_read))!=-1) {
				os.write(datas_read, 0, len);
			}
			os.flush();
		} catch (IOException e) {
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
