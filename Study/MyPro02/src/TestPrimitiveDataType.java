
/**
 * 测试基本数据类型（整型变量）
 * @author Yin
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[]args) {
		//测试整形变量
		int a = 15;
		int b = 015;//以0开头8进制
		int c = 0x15;//以0x开头为16进制
		int d = 0b01110011;//以0b开头为2进制
		
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		byte age = 30 ;
		short salary = 30000;
		int population = 2000000000;//整型常量默认是int类型
		long globalPopulation = 7400000000L;//后边加l或者L就是这是一个long类型的数据，一般用L
	}
}
