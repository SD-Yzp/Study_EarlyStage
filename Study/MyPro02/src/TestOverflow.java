
/**
 * �����������
 * @author Yin
 *
 */
public class TestOverflow {
	public static void main(String[]args) {
		int money = 1000000000;  //10��
		int years = 20;
		int total = money*years;  //���ص�total�Ǹ�����������int�ķ�Χ
		System.out.println("total="+total);
		long total1 = money*years;  //���ص�total��Ȼ�Ǹ�����Ĭ����int����˽����ת��Ϊintֵ����ת��long�������Ѿ����������ݶ�ʧ
		System.out.println("total1="+total1);
		long total2 = money*((long)years);  //���ص�total2��ȷ���Ƚ�һ�����ӱ��long���������ʽ����������ȫ����long�����㡣
		System.out.println("total2="+total2);	
		
		long total3 = 34444444444444L*years;  //Ϊ�˱���������Ƚ�һ����ֵ��Ϊlong����
		System.out.println("total3="+total3);	
		
		int l = 2;  //�ֲ�����L����1
		long a = 23456l;  //����ʹ�ô�дL
		System.out.println(l+1);
			
	}
}
