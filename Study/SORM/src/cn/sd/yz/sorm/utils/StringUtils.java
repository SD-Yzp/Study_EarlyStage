package cn.sd.yz.sorm.utils;

/**
 * 封装了字符串常用的操作
 * @author Yin
 *
 */
public class StringUtils {
	
	public static String firstChar2UpperCase(String str)
	{
		//abcd-->Abcd
		return str.toUpperCase().substring(0,1)+str.substring(1);
	}
	
}
