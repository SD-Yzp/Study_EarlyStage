package cn.task4.question3;
/**
 * ���Զ���������û���
 * @author Yin
 *
 */
public class TestNetUser {
	public static void main(String[]args) {
		NetUser u1 = new NetUser(951225204,"123...","17854200056@163.com");
		System.out.println("id��"+u1.id+"\n���룺"+u1.pwd+"\n���䣺"+u1.email);
		
		NetUser u2 = new NetUser(951225204,"123...");
		System.out.println("id��"+u2.id+"\n���룺"+u2.pwd+"\n���䣺"+u2.email);
	}
}
