
/**
 * 逻辑运算符
 * @author Yin
 *
 */
public class TestOperator03 {
	public static void main(String[]args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b2);
		
		//短路
	//	int c = 3/0; 报错
		boolean b3 = 1>2&&2<(3/0);//短路与，第一个操作值为false，则不需要进行后边的运算
		System.out.println(b3);
		
	}
}
