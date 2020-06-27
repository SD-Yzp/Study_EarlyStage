package cn.sd.yz.cl;

/**
 * 测试包装类
 * @author J
 *
 */
public class TestWrappedClass {
	public static void main(String[] args) {
		Integer int1 = new Integer(10);
		Integer int2 = Integer.valueOf(20);
		
		//Integer对象转化为int
		int a=int1.intValue();
		int b=int2;
		System.out.println(b);
		
		//字符串转化为Integer对象
		Integer int3=Integer.parseInt("334");
		Integer int4=new Integer("999");
		System.out.println(int4);
		
		//Integer对象转化为字符串
		String str1=int3.toString();
		
		//一些常见int类型相关的常量
		System.out.println("int能表示的最大整数："+Integer.MAX_VALUE);
		
	}
}
