package cn.sd.yzp.test;

/**
 * 测试String的常用方法
 * @author Yin
 *
 */
public class TestString2 {
	public static void main(String[] args) {
		String s1 = "core java";  //字符串从0开始索引
		String s2 = "Core java";
		String s3 = "ejava java";
		System.out.println(s1.charAt(3));  //提取下标为3的字符
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("java"));  //这个字符这一次出现的位置
		System.out.println(s3.indexOf("java"));  
		System.out.println(s1.indexOf("apple"));  // 没有出现的字符返回-1
		String s = s1.replace(" ", "&");  // 替换
		System.out.println("result is:"+s);
	}
}
