package cn.sd.yz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式对象中的分组处理
 * @author Yin
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//表达式对象
		Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
		//创建Matcher对象
		Matcher m = p.matcher("asdasd123123**asd12312**dasd123asdasd");
		
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
	}
}
