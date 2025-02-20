package cn.sd.yz.io;

import java.io.UnsupportedEncodingException;

/**
 * 测试编码(encode)
 * @author Yin
 *
 */
public class TestEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "性命生命使命a";
		//编码：字节数组
		byte[] datas = s.getBytes(); //默认使用工程的字符集UTF-8
		System.out.println(datas);
		
		//编码：使用其他字符集
		datas = s.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas = s.getBytes("GBK");
		System.out.println(datas.length);
	}
}
