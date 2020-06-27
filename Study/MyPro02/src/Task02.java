//import java.util.Scanner;
/**
 * 计算银行本息合计
 * @author Yin
 *
 */
public class Task02 {
	public static void main(String[]args) {
//		Scanner scanner = new Scanner(System.in);
		double a = 10000;
		double b1,b2,b3,b4;
		b1 = a*0.35E-2+a;
		b2 = a*1.50E-2+a;
		b3 = a*0.35E-2*2+a;
		b4 = a*2.10E-2*2+a;
		System.out.println("本金：10000");
		System.out.println("活期1年本金总计："+(int)b1);
		System.out.println("定期1年本金总计："+(int)b2);
		System.out.println("活期2年本金总计："+(int)b3);
		System.out.println("定期2年本金总计："+(int)b4);

	}
}
