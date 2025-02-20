package cn.sd.yz.io;

import java.io.ByteArrayOutputStream;

/**
 * 测试字节数组输出流
 * 输出字节
 * 1、创建源：源换成字符数组
 * 2、选择流
 * 3、操作
 * 4、释放资源：可以不释放
 * @author Yin
 *
 */
public class TestIO08 {
	public static void main(String[] args) {
		//1、创建源
		byte[] dest = null;
		//2、选择流
		ByteArrayOutputStream os = null;
		os = new ByteArrayOutputStream();
		String string = "abcdefg";
		byte[] datas = string.getBytes();
		os.write(datas, 0, datas.length);
		dest = os.toByteArray();
		System.out.println(dest.length);
	}
}
