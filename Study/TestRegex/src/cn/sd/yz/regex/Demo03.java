package cn.sd.yz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式对象的替换操作
 * @author Yin
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		//表达式对象
		Pattern p = Pattern.compile("[0-9]");
		//创建Matcher对象
		Matcher m = p.matcher("asd12312&&123sad");
		
		String newStr = m.replaceAll("#");
		System.out.println(newStr);
	}
}
