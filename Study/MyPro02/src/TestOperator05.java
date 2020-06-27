
/**
 * 字符串运算符
 * @author Yin
 *
 */
public class TestOperator05 {
	public static void main(String[]args) {
		String a = "3";
		int b = 4;
		int c = 5;
		char d = 'a';
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(c+b);
		System.out.println(a+b+c);//结果345
		System.out.println(b+c+a);//结果93
		System.out.println(d+4);//结果101，字符a的SCII码为97，运算时作为整数
		
	}
}
