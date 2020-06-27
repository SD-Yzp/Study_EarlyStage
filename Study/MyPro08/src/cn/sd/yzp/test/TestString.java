package cn.sd.yzp.test;

/**
 * 测试字符串类的基本用法
 * @author Yin
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String(" World");
		String str3 = str1 + str2;
		String str4 = "18"+19;   //不是加法是字符串连接符。
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("##########");
		
		
		String str5 ="Joker";
		String str6 ="Joker";
		String str7 =new String("Joker");
		
		System.out.println(str5 == str6);  //str5,str7在常量池内，地址相同
		System.out.println(str5 == str7);  //str5,str7不是一个对象，==比较地址
		System.out.println(str5.equals(str7));   //比较字符串的话最好还是用equals方法
		
		
		System.out.println("#############");
		String str8 = "Hello World";
		System.out.println(str8==str3);   //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
		System.out.println(str8.equals(str3));
		System.out.println("hello world".equalsIgnoreCase(str8));  // 忽略大小写的字符串比较
		
	}
}
