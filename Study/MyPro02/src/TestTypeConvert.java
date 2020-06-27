
/**
 * 测试自动类型转化
 * @author Yin
 *
 */
public class TestTypeConvert {
	public static void main(String[]args) {
		int a = 324;
		long b = a;
		double d = b;
//		a=b;   //报错，long的类型比int大，不能进行赋值
//		long e = 3.14
		float f = 234323L;
		
		//特例
		byte b2 = 123;
		
	}
}
