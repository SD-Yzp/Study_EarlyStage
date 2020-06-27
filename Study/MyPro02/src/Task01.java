import java.util.Scanner;
/**
 * 计算圆的周长和面积
 * @author Yin
 *
 */
public class Task01 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double r = scanner.nextDouble();
		double C = 2*3.14*r;
		double S = 3.14*r*r;
		System.out.println("该圆的半径为：R="+r);
		System.out.println("该圆的周长为：C=2*3.14*"+r+"="+C);
		System.out.println("该圆的面积为：S=3.14*"+r+"*"+r+"="+S);

	}
}
