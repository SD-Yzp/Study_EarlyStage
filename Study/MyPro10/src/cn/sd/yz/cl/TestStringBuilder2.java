package cn.sd.yz.cl;

/**
 * ����StringBuilder��StringBuffer
 * @author J
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefg");
		
		for(int i=0;i<19;i++) {
			char temp = (char)('h'+i);
			sb.append(temp);
		}
		
		System.out.println(sb);
		
		sb.reverse(); // ����
		System.out.println(sb);
		
		sb.setCharAt(2, 'X');
		System.out.println(sb);

		sb.insert(0, "��").insert(6, "��").insert(10, "��"); //��ʽ���á����ľ��ǣ��÷���������return this,���Լ������ˡ�
		System.out.println(sb);

		
		
		
		
		
	}
}
