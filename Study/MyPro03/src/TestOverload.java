
/**
 * ����������
 * @author Yin
 *
 */
public class TestOverload {
	public static void main(String[]args) {
		int n1=1;
		int n2=2;
		int n3=3;
		double m1=3.12;
		double m2=22.3;
		int sum1=add(n1,n2);
		int sum2=add(n1,n2,n3);
		double sum3=add(m1,m2);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);		
	}
	
	//��������ͬ�������������͡�������˳��ͬ����������
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static int add(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	public static double add(double a,double b) {
		double sum=a+b;
		return sum;
	}
}
