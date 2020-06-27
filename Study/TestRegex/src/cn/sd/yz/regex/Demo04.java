package cn.sd.yz.regex;

import java.util.Arrays;

/**
 * 测试正则表达式对象的分割字符串的操作
 * @author Yin
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		String str = "a12312asdas1243sasd";
		String[] arr = str.split("\\d+");
		System.out.println(Arrays.toString(arr));
	}
}
