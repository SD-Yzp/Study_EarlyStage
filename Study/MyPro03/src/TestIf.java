
/**
 * 测试if单选择结构
 * @author Yin
 *
 */
public class TestIf {
	public static void main(String[]args) {
		double d = Math.random();  //返回0到1区间的double类型随机数，但不包括1
		System.out.println(d);
		
/*		int i = (int)(6*Math.random())+1;
		System.out.println(i);
		if(i<=3) {
			System.out.println("小");
		}
*/
		
		System.out.println("##########");
		int i = (int)(6*Math.random())+1;//通过Math.random()产生随机数
		int j = (int)(6*Math.random())+1;
		int k = (int)(6*Math.random())+1;
		int count = i+j+k;
		//如果三个骰子之和大于15，则手气不错
		if(count>15) {
			System.out.println("今天手气不错");
		}
		//如果三个骰子之和在10到15之间，则手气一般
		if(count>=10&&count<=15) {
			System.out.println("今天手气一般");
		}
		//如果三个骰子之和小于10，则手气不怎么样
		if(count<10) {
			System.out.println("今天手气不怎么样");
		}
		System.out.println("今天得了"+count+"分");
	}
}
