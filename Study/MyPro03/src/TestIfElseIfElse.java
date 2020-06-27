
/**
 * 测试IfElseIfElse语句
 * @author Yin
 *
 */
public class TestIfElseIfElse {
	public static void main(String[]args) {
		int age = (int)(100*Math.random());
		System.out.println("年龄="+age);
		if (age<15) {
			System.out.println("少年");
		}else if(age<25) {
			System.out.println("青年");
		}else if(age<45) {
			System.out.println("中年");
		}else if(age<65) {
			System.out.println("中老年");
		}else if(age<85) {
			System.out.println("老年");
		}else if(age<100){
			System.out.println("古来稀");
		}
	}
}
