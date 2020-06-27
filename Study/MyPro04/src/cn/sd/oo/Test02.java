package cn.sd.oo;
/**
 * 测试import
 * @author Yin
 *
 */
import java.sql.Date;
import java.util.*;

public class Test02 {
	public static void main(String[]args) {
		Date now;  //这里指的是java.sql.Date
		java.util.Date now2 = new java.util.Date();  //java.util.Date因为和java.sql.Date类同名，需要完整路径
		System.out.println(now2);
		//java.uitl包的非同类名不需要完整的路径
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextInt());

	}	
}
