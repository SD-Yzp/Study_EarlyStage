import java.util.Scanner;
/**
 * ��ҵ1��ʮ����ת��������
 * @author Yin
 *
 */
public class Task01 {
	public static void main(String[]args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.print("����ʮ����������");
		int a = scanner.nextInt();
		int b = 0;  
		int k = 1;
		while(a!=0) {			
				b+=k*(a%2);  //��ʮ����ת���ɶ�����
				k*=10;  //�������
				a=a/2;
		}
		System.out.println("����Ķ���������Ϊ��"+b);	
		
		/*
		 * 
		int decimal;
        String Sbinary;
        int  binary;
 
        Scanner input = new Scanner(System.in);
        System.out.print("������һ������:");
        decimal = input.nextInt();
        Sbinary = Integer.toBinaryString(decimal);
        binary  = Integer.parseInt(Sbinary);
        System.out.printf("��������Ϊ:%d",binary);

--------------------- 
���ߣ���ѩ���� 
��Դ��CSDN 
ԭ�ģ�https://blog.csdn.net/qq_34834846/article/details/81392699 
��Ȩ����������Ϊ����ԭ�����£�ת���븽�ϲ������ӣ�
		 */

	}
}
