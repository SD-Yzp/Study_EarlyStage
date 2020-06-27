
/**
 * 测试IfElse语句
 * @author Yin
 *
 */
public class TestIfElse {
	public static void main(String[]args) {
		double r = 4*Math.random();//生成[0,4)的半径，求圆面积和周长
		double area = Math.PI*Math.pow(r,2);  //Math.pow(r,2)求半径的平方
		double circle = 2*Math.PI*r; 
		System.out.println("半径为："+r);
		System.out.println("面积为："+area);
		System.out.println("周长为："+circle);
		if(area>circle) {
			System.out.println("面积数值大于周长！");
		}else {
			System.out.println("周长数值大于面积！");
		}
		
	}
}
