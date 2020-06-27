package cn.sd.yz.sorm.utils;

public class Test {
	public static void main(String[] args) {
		String s = "cn.yz.sd.a";
		
		String str = s.replace(".", "\\\\");
		
		System.out.println(str);
	}
}
