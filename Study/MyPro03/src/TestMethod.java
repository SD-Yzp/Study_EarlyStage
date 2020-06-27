
/**
 * 测试方法的使用
 * @author Yin
 *
 */
public class TestMethod {
	public static void main(String[]args) {
		int num1 = 10;
		int num2 = 20;
		int sum = add(num1,num2);   
		System.out.println(sum);
		print();
		
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.print();
		
	}
	public static int add(int n1,int n2){
			int sum=n1+n2;
			return sum;
		}
	public static void print() {
		System.out.println("葛老师是小猪~");		
	}
}
