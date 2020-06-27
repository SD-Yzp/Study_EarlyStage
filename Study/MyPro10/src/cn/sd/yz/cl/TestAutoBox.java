package cn.sd.yz.cl;

/**
 * 测试自动装箱和拆箱
 * @author J
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
		Integer i = 23;//自动装箱
		int a = new Integer(20); //自动拆箱
		//需要注意的问题
		Integer c = null;
//		int d = c; // 此处其实就是：c.intValue(),因此抛空指针异常。报错
		
		
		Integer int1=-128;
		Integer int2=-128;
		System.out.println(int1==int2); //true 因为128在缓存范围内
		System.out.println(int1.equals(int2)); //true
		Integer int3 = 1234;
		Integer int4 = 1234;
		System.out.println(int3==int4); //false 因为1234不在缓存范围内
		System.out.println(int3.equals(int4)); // true
		
		
		
	}
}
