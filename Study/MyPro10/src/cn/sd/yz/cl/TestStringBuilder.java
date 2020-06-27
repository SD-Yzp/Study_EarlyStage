package cn.sd.yz.cl;

/**
 * 测试StringBuilder、StringBuffer
 * @author J
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		//StringBuilder线程不安全，效率高（一般使用它）；StringBuffer线程安全，效率低。
		StringBuilder sb = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb.hashCode()));// 打印地址
		System.out.println(sb);
		
		sb.setCharAt(2,'C');
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}
}
