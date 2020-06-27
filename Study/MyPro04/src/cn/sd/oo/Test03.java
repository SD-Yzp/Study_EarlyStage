package cn.sd.oo;
/**
 * 测试静态导入
 * @author Yin
 *
 */
import static java.lang.Math.*;   //导入Math类的所有静态属性
import static java.lang.Math.PI;   //导入Math类的PI属性
public class Test03 {
	public static void main(String[]args) {
		System.out.println(PI);
		System.out.println(random());
	}
}
