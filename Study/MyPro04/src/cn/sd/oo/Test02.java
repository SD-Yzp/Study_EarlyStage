package cn.sd.oo;
/**
 * ����import
 * @author Yin
 *
 */
import java.sql.Date;
import java.util.*;

public class Test02 {
	public static void main(String[]args) {
		Date now;  //����ָ����java.sql.Date
		java.util.Date now2 = new java.util.Date();  //java.util.Date��Ϊ��java.sql.Date��ͬ������Ҫ����·��
		System.out.println(now2);
		//java.uitl���ķ�ͬ��������Ҫ������·��
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextInt());

	}	
}
