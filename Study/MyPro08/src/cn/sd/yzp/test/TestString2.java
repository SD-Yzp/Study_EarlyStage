package cn.sd.yzp.test;

/**
 * ����String�ĳ��÷���
 * @author Yin
 *
 */
public class TestString2 {
	public static void main(String[] args) {
		String s1 = "core java";  //�ַ�����0��ʼ����
		String s2 = "Core java";
		String s3 = "ejava java";
		System.out.println(s1.charAt(3));  //��ȡ�±�Ϊ3���ַ�
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("java"));  //����ַ���һ�γ��ֵ�λ��
		System.out.println(s3.indexOf("java"));  
		System.out.println(s1.indexOf("apple"));  // û�г��ֵ��ַ�����-1
		String s = s1.replace(" ", "&");  // �滻
		System.out.println("result is:"+s);
	}
}
