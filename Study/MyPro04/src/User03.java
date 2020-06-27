
/**
 * 测试static关键字
 * @author Yin
 *
 */
public class User03 {
	int id;//id
	String name;
	String pwd;
	
	static String company = "石大";
	
	public User03(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void login() {
		printCompany();
		System.out.println(company);		
		System.out.println("登陆："+name);
	}
	public static void printCompany() {
		//login(); //调用非静态成员，编译会报错
		System.out.println(company);
	}
	public static void main(String[]args) {
		User03 u = new User03(18140039,"Joker");  //这一行注释掉也可以
		User03.printCompany();
		User03.company="石油大学";
		User03.printCompany();

	}
}
