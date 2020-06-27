import java.util.Scanner;
/**
 * 密码传递
 * @author Yin
 *
 */
public class Task03 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个四位整数：");
		int a = scanner.nextInt();
		int d1,d2,d3,d4,x1,x2,x3,x4,y;

		//取出每一位数据
		d1 = a/1000; //千位
		d2 = (a-d1*1000)/100; //百位
		d3 = (a-d1*1000-d2*100)/10;  //十位
		d4 = a-d1*1000-d2*100-d3*10;  //个位
		
		//每个数据+5，之后取余
		x1 = (d1+5)%10;
		x2 = (d2+5)%10;
		x3 = (d3+5)%10;
		x4 = (d4+5)%10;
		
		//求出加密后的数据
		y=x4*1000+x3*100+x2*10+x1;
		System.out.println("加密后的数字为："+y);
	}
}
