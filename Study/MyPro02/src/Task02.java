//import java.util.Scanner;
/**
 * �������б�Ϣ�ϼ�
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
		System.out.println("����10000");
		System.out.println("����1�걾���ܼƣ�"+(int)b1);
		System.out.println("����1�걾���ܼƣ�"+(int)b2);
		System.out.println("����2�걾���ܼƣ�"+(int)b3);
		System.out.println("����2�걾���ܼƣ�"+(int)b4);

	}
}
