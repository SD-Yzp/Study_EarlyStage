package cn.sd.yz.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 尚学堂内的字节数组输入流测试
 * @author Yin
 *
 */
public class TestIO09 {
	public static void main(String[] args) {
		byte[] b = "abcdefg".getBytes();   //将字符串转换为字节数组
		test(b);
	}
	
	public static void test(byte[] b) {
		InputStream is = new ByteArrayInputStream(b);
		StringBuilder sb = new StringBuilder();
		int temp = 0;
		int sum = 0;  //用于保存读取的字节数
		
		try {
			while((temp=is.read())!=-1) {
				sb.append((char)temp);
				sum++;
			}
			System.out.println(sb);
			System.out.println("输入的字节数为："+sum);
		} catch (IOException e) {
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
		
		
	}
	
}
