package cn.sd.yz.cl;

/**
 * ���Կɱ��ַ����кͲ��ɱ��ַ����е�����
 * @author J
 *
 */
public class TestStringBuilder3 {
	public static void main(String[] args) {
		//ʹ��String�����ַ�����ƴ��
		String str8 = "";
		//������ʹ�õ�StringBuilderƴ�ӣ�����ÿ��ѭ����������һ��StringBuilder����
		long num1 = Runtime.getRuntime().freeMemory(); // ��ȡϵͳʣ���ڴ�ռ�
		long time1 = System.currentTimeMillis(); // ��ȡϵͳ�ĵ�ǰʱ��
		for(int i=0;i<5000;i++) {
			str8 = str8 + i;  //�൱�ڲ�����10000������,ÿ��ѭ�����ַ���i����һ������
		}
		long num2 = Runtime.getRuntime().freeMemory();
		long time2  = System.currentTimeMillis();
		System.out.println("Stringռ�õ��ڴ棺"+(num1-num2));
		System.out.println("Stringռ�õ�ʱ�䣺"+(time2-time1));
		
		//ʹ��StringBuilder�����ַ���ƴ��
		StringBuilder str9 = new StringBuilder();
		long num3 = Runtime.getRuntime().freeMemory();
		long time3 = System.currentTimeMillis();
		for(int i=0;i<5000;i++) {
			str9.append(i);
		}
		long num4 = Runtime.getRuntime().freeMemory();
		long time4 = System.currentTimeMillis();
		System.out.println("StringBuilderռ�õ��ڴ棺"+(num3-num4));
		System.out.println("StringBuilderռ�õ�ʱ�䣺"+(time4-time3));

	}
}
