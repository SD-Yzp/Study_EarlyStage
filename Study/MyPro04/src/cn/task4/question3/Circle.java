package cn.task4.question3;
/**
 * 圆类，可以计算周长和面积
 * @author Yin
 *
 */
import static java.lang.Math.*;
public class Circle {
	double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void getArea() {
		double Area = PI*r*r;
		System.out.println("圆的面积为："+Area);
	}
	
	public void getPerimeter() {
		double Perimeter = 2*PI*r;
		System.out.println("圆的周长为："+Perimeter);
	}
}
