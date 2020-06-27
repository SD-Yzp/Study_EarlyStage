
/**
 * 测试强制类型转换
 * @author Yin
 *
 */
public class TestTypeConvert2 {
	public static void main(String[]args) {
		double x = 3.14;
		int nx = (int)x;//nx=3
		char c = 'a';
		int d = c+1;
		System.out.println(nx);
		System.out.println(d);//d=98,自动转换
		System.out.println((char)d);//d='b'
		
	}
}
