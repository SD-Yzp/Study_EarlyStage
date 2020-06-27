package cn.sd.yz.cl;

/**
 * 测试StringBuilder、StringBuffer
 * @author J
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefg");
		
		for(int i=0;i<19;i++) {
			char temp = (char)('h'+i);
			sb.append(temp);
		}
		
		System.out.println(sb);
		
		sb.reverse(); // 倒序
		System.out.println(sb);
		
		sb.setCharAt(2, 'X');
		System.out.println(sb);

		sb.insert(0, "我").insert(6, "爱").insert(10, "你"); //链式调用。核心就是：该方法调用了return this,把自己返回了。
		System.out.println(sb);

		
		
		
		
		
	}
}
