
/**
 * 测试静态初始化块的使用
 * @author Yin
 *
 */
public class User04 {
	int id;
	String name;
	String pwd;
	static String company;
	
	static {
		System.out.println("执行类的初始化工作");
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
