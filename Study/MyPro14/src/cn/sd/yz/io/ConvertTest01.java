package cn.sd.yz.io;

import java.io.*;

/**
 * 测试转换流
 * InputStreamReader OutputStreamWriter
 * 使用System.in System.out
 * @author Yin
 *
 */
public class ConvertTest01 {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));){
			//循环获取键盘的输入(exit退出)，输出此内容
			String msg = "";
			while(!msg.equals("exit")) {
				msg = reader.readLine();  //循环读取
				writer.write(msg);  //循环写出
				writer.newLine();
				writer.flush();   //注意：使用BufferedReader是有缓存的，所以如果没有强制刷新只有达到缓存才会写出
			}
		}catch(IOException e) {
			System.out.println("操作错误");
		}
		
	}
}
