
/**
 * ����this01
 * @author Yin
 *
 */

public class User02{
	int id;
	String name;
	String pwd;
	
	public User02(){
		
	}
	
	public User02(int id,String name){
		System.out.println("���ڳ�ʼ���Ѿ������õĶ���"+this);
		this.id = id;   //��дthis���޷����־ֲ�����id�ͳ�Ա����id
		this.name =name;
	}
	
	public void login() {
		System.out.println(this.name+"��Ҫ��½��");
	}
	
	public static void main(String[]args) {
		User02 user = new User02(18140039,"Joker");
		System.out.println("��ӡJoker�Ķ���"+user);
		user.login();
	}
}
