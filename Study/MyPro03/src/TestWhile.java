
/**
 * 测试while语句
 * @author Yin
 *
 */
public class TestWhile {
	public static void main(String[]args) {
		//求1到100的累加和
		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("累加和为："+sum);
	}
}
