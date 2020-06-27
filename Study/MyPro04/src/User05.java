
/**
 * 参数传值机制
 * @author Yin
 *
 */
public class User05 {
	int id;
	String name;
	String pwd;
	
	public User05(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParameterTransfer01(User05 u) {
		u.name = "j";
	}
	
	public void testParameterTransfer02(User05 u) {
		u = new User05(100,"k");
	}
	
	public static void main(String[]args) {
		User05 u1 = new User05(18140039,"joker");
		
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);
	}
}
