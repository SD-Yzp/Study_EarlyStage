package cn.task4.question3;
/**
 * 测试定义的网络用户类
 * @author Yin
 *
 */
public class TestNetUser {
	public static void main(String[]args) {
		NetUser u1 = new NetUser(951225204,"123...","17854200056@163.com");
		System.out.println("id："+u1.id+"\n密码："+u1.pwd+"\n邮箱："+u1.email);
		
		NetUser u2 = new NetUser(951225204,"123...");
		System.out.println("id："+u2.id+"\n密码："+u2.pwd+"\n邮箱："+u2.email);
	}
}
