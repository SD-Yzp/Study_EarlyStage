
/**
 * 条件运算符（三元运算符）
 * @author Yin
 *
 */
public class TestOperatoer06 {
	public static void main(String[]args) {
		int score = 80;
		String type = score<60?"不及格":"及格"; //类似简单的if...else...语句
		System.out.println(type);
		
		int x = -100;
		System.out.println(x>0?1:(x==0?0:-1));
		
	}
}
