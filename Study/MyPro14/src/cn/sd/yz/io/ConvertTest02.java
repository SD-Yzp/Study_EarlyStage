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
public class ConvertTest02 {
	public static void main(String[] args) {
		//操作网络流，下载百度源码
		try(BufferedReader is = 
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));){
			//操作（读取）
			String msg = "";
			while((msg=is.readLine())!=null) {
				System.out.println(msg);  //可能出现乱码的原因：字符集不匹配
			}		
		}catch(IOException e) {
			System.out.println("操作错误");
		}
	}
	
	
	
	
	public static void test02() {
		//操作网络流，下载百度源码
		try(InputStreamReader is = 
				new InputStreamReader(
						new URL("http://www.baidu.com").openStream(),"UTF-8");){
			//操作（读取）
			int temp;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);  //出现乱码的原因：字节数不够造成乱码
			}		
		}catch(IOException e) {
			System.out.println("操作错误");
		}		
	
	}
	



	public static void test01() {
		//操作网络流，下载百度源码
		try(InputStream is = new URL("http://www.baidu.com").openStream();){
			//操作（读取）
			int temp = -1;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}		
		}catch(IOException e) {
			System.out.println("操作错误");
		}		
	}
}
