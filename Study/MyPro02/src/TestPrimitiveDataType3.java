
/**
 * �����ַ����ͺͲ�������
 * @author Yin
 *
 */
public class TestPrimitiveDataType3 {
	public static void main(String[]args) {
		char a = 'T';
		char b = '花';
		char c = '\u0061';//�����ñ��룬����ı������a
		System.out.println(c);
		
		//ת���ַ�
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b'); //a'b
		
		//String�����ַ�����
		String d = "bac";
		
		//���Բ�������
		boolean man = true;
		
		if(man) { // ���˲��Ƽ���man==true
			System.out.println("����");
		}
		
	}
}
