import java.util.Scanner;
/**
 * ����Բ���ܳ������
 * @author Yin
 *
 */
public class Task01 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		double r = scanner.nextDouble();
		double C = 2*3.14*r;
		double S = 3.14*r*r;
		System.out.println("��Բ�İ뾶Ϊ��R="+r);
		System.out.println("��Բ���ܳ�Ϊ��C=2*3.14*"+r+"="+C);
		System.out.println("��Բ�����Ϊ��S=3.14*"+r+"*"+r+"="+S);

	}
}
