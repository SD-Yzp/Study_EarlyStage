package cn.sd.yz.cl;

/**
 * ����StringBuilder��StringBuffer
 * @author J
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		//StringBuilder�̲߳���ȫ��Ч�ʸߣ�һ��ʹ��������StringBuffer�̰߳�ȫ��Ч�ʵ͡�
		StringBuilder sb = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb.hashCode()));// ��ӡ��ַ
		System.out.println(sb);
		
		sb.setCharAt(2,'C');
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}
}
