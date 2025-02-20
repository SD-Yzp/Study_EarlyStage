package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 使用输入、输出字符流来实现拷贝（字节流都可以实现，只用来联系）
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源（先打开的后关闭）
 * @author Yin
 *
 */
public class Copy_String {
	public static void main(String[] args) {
		copy_String("text06.txt","text06_copy.txt");
		
	}
	
	static void copy_String(String srcPath,String destPath) {		
		//1、创建源
		File src = new File("text06.txt");       //源设备
		File dest = new File("text06_copy.txt");  //目标设备
		//2、选择流
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(src);
			//3、操作
			//输入操作
			char[] datas = new char[1024];
			int len = -1;
			try {
				writer = new FileWriter(dest);
				while((len=reader.read(datas))!=-1) {
					String s = new String(datas,0,len);
					writer.append(s);
					writer.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer==null) {				
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(reader==null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
