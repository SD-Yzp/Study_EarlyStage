
/**
 * ����static�ؼ���
 * @author Yin
 *
 */
public class User03 {
	int id;//id
	String name;
	String pwd;
	
	static String company = "ʯ��";
	
	public User03(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void login() {
		printCompany();
		System.out.println(company);		
		System.out.println("��½��"+name);
	}
	public static void printCompany() {
		//login(); //���÷Ǿ�̬��Ա������ᱨ��
		System.out.println(company);
	}
	public static void main(String[]args) {
		User03 u = new User03(18140039,"Joker");  //��һ��ע�͵�Ҳ����
		User03.printCompany();
		User03.company="ʯ�ʹ�ѧ";
		User03.printCompany();

	}
}
