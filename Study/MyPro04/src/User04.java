
/**
 * ���Ծ�̬��ʼ�����ʹ��
 * @author Yin
 *
 */
public class User04 {
	int id;
	String name;
	String pwd;
	static String company;
	
	static {
		System.out.println("ִ����ĳ�ʼ������");
		company="shida";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[]args) {
		User04 u04 = null;
	}
}
