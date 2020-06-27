package cn.sd.yz.io;

import java.io.*;
import java.net.URL;

/**
 * 测试转换流
 * 1、以字符流的形式操作字节流（纯文本的）
 * 2、指定字符集
 * @author Yin
 *
 */
public class ConvertTest03 {
	public static void main(String[] args) {
		//操作网络流，下载百度源码
		try(BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));
				BufferedWriter writer = 
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html"),"UTF-8"));){
			//操作（读取）
			String msg = "";
			while((msg=reader.readLine())!=null) {
//				System.out.println(msg);
				writer.write(msg);
				writer.newLine();
			}
			writer.flush();
		}catch(IOException e) {
			System.out.println("操作错误");
		}
	}
}
