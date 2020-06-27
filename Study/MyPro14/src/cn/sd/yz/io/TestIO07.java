package cn.sd.yz.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 测试字节数组输入流
 * 输入字节
 * 1、创建源：换成字符数组
 * 2、选择流
 * 3、操作
 * 4、释放资源：可以不用释放、也可以为了形式统一添加
 * @author Yin
 *
 */
public class TestIO07 {
	public static void main(String[] args) {
		//1、创建源
		String s = "i am going to school";
		//2、选择流
		ByteArrayInputStream is = null;
		byte[] datas = s.getBytes();
		is = new ByteArrayInputStream(datas);
		//3、操作
		byte[] datas_read = new byte[1024];
		int len = -1;
		try {
			while((len=is.read(datas_read))!=-1) {
				String string = new String(datas_read,0,len);
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//4、释放资源
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		System.out.println();
	
	}
}
