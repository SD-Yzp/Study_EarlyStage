
/**
 * 测试this01
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
		System.out.println("正在初始化已经创建好的对象："+this);
		this.id = id;   //不写this，无法区分局部变量id和成员变量id
		this.name =name;
	}
	
	public void login() {
		System.out.println(this.name+"，要登陆！");
	}
	
	public static void main(String[]args) {
		User02 user = new User02(18140039,"Joker");
		System.out.println("打印Joker的对象："+user);
		user.login();
	}
}
