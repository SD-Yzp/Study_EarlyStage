
/**
 * 测试变量
 * @author Yin
 *
 */
public class TestVariable {
	
	int a ; //成员变量，如果不进行初始化，它会自动初始化成该类型的默认初始值（速课堂网页有介绍）
	static int size ;// 静态变量，从属于类，生命周期最长
	
	public static void main(String[]args) {
		int age;//局部变量，仅限于所在的花括号，必须初始化赋值，不然不能使用该变量
		age = 18 ;
		int salary = 3000 ;
		
		int gao = 13 ;
		System.out.println(gao);
	}
}
