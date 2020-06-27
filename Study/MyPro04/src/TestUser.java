
/**
 * 构造方法的重载
 * @author Yin
 *
 */
class User {
	int id;
	String name;
	String pwd;
	
	public User() {
		
	}
	public User(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User(int id,String name,String pwd) {
		this.id = id ;
		this.name = name;
		this.pwd = pwd;
	}
	
}
public class TestUser{
	public static void main(String[]args) {
		User u1 = new User();
		User u2 = new User(18140039,"Joker");
		User u3 = new User(18140039,"Joker","1111111");
		
	}
	
}
