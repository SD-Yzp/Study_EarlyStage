package cn.sd.yz.cl;

/**
 * ����String��
 * @author J
 *
 */
public class TestString01 {
	public static void main(String[] args) {
		String str1 = "aabbccdd";
		String str2 = str1.substring(2,5);
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("---------------");
		
		//�����������Ż���ֱ���ڱ����ʱ���ַ���ƴ��
		String str3 = "hello" +" java"; //�൱��str3 = "hello java";
		String str4 = "hello java";
		System.out.println(str3 == str4);  //true
		String str5 = "hello";
		String str6 = " java";
		//�����ʱ��֪��������洢����ʲô������û�а취�ڱ����ʱ���Ż�
		String str7 = str5+str6;
		System.out.println(str3 == str7); //false
		System.out.println(str3.equals(str7));  //true,���ַ����Ƚϵ�ʱ��ʹ��equals��Ҫʹ��==
	}
}
