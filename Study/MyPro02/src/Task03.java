import java.util.Scanner;
/**
 * ���봫��
 * @author Yin
 *
 */
public class Task03 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����λ������");
		int a = scanner.nextInt();
		int d1,d2,d3,d4,x1,x2,x3,x4,y;

		//ȡ��ÿһλ����
		d1 = a/1000; //ǧλ
		d2 = (a-d1*1000)/100; //��λ
		d3 = (a-d1*1000-d2*100)/10;  //ʮλ
		d4 = a-d1*1000-d2*100-d3*10;  //��λ
		
		//ÿ������+5��֮��ȡ��
		x1 = (d1+5)%10;
		x2 = (d2+5)%10;
		x3 = (d3+5)%10;
		x4 = (d4+5)%10;
		
		//������ܺ������
		y=x4*1000+x3*100+x2*10+x1;
		System.out.println("���ܺ������Ϊ��"+y);
	}
}
