package cn.sd.yz.io;

import java.io.UnsupportedEncodingException;

/**
 * 测试解码(decode)以及可能出现乱码的情况
 * @author Yin
 *
 */
public class TestDecode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "性命生命使命a";
		//编码：字节数组
		byte[] datas = s.getBytes(); //默认使用工程的字符集UTF-8
		
		//解码：字符串String(byte[] bytes,int offset,int length,String charsetName)
		s = new String(datas,0,datas.length,"gbk");
		System.out.println(s);
		
		//乱码
		//1、字节数不够
		s = new String(datas,0,datas.length-2,"gbk");
		System.out.println(s);
		s = new String(datas,0,datas.length-1,"gbk");		
		System.out.println(s);
		
		//2、字符集不统一
		s = new String(datas,0,datas.length,"utf16");
		System.out.println(s);
	}
}
