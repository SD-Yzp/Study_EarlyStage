package cn.sd.yz.cl;

/**
 * 测试String类
 * @author J
 *
 */
public class TestString01 {
	public static void main(String[] args) {
		String str1 = "aabbccdd";
		String str2 = str1.substring(2,5);
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("---------------");
		
		//编译器做了优化，直接在编译的时候将字符串拼接
		String str3 = "hello" +" java"; //相当于str3 = "hello java";
		String str4 = "hello java";
		System.out.println(str3 == str4);  //true
		String str5 = "hello";
		String str6 = " java";
		//编译的时候不知道变量里存储的是什么，所以没有办法在编译的时候优化
		String str7 = str5+str6;
		System.out.println(str3 == str7); //false
		System.out.println(str3.equals(str7));  //true,做字符串比较的时候，使用equals不要使用==
	}
}
