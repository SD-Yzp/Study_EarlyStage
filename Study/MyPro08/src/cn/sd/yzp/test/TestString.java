package cn.sd.yzp.test;

/**
 * �����ַ�����Ļ����÷�
 * @author Yin
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String(" World");
		String str3 = str1 + str2;
		String str4 = "18"+19;   //���Ǽӷ����ַ������ӷ���
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("##########");
		
		
		String str5 ="Joker";
		String str6 ="Joker";
		String str7 =new String("Joker");
		
		System.out.println(str5 == str6);  //str5,str7�ڳ������ڣ���ַ��ͬ
		System.out.println(str5 == str7);  //str5,str7����һ������==�Ƚϵ�ַ
		System.out.println(str5.equals(str7));   //�Ƚ��ַ����Ļ���û�����equals����
		
		
		System.out.println("#############");
		String str8 = "Hello World";
		System.out.println(str8==str3);   //�����ʱ��֪�������д洢����ʲô,����û�취�ڱ����ʱ���Ż�
		System.out.println(str8.equals(str3));
		System.out.println("hello world".equalsIgnoreCase(str8));  // ���Դ�Сд���ַ����Ƚ�
		
	}
}
