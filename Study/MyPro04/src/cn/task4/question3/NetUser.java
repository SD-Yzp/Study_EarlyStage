package cn.task4.question3;
/**
 * ���������û���
 * @author Yin
 *
 */
public class NetUser {
	int id;
	String pwd;
	String email;
	
	public NetUser(int id,String pwd,String email) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}
	
	public NetUser(int id,String pwd) {
		this.id = id;
		this.pwd = pwd;
		email = id+"@gameschool";
	}
}
