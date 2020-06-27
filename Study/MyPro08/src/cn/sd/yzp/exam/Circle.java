package cn.sd.yzp.exam;

import static java.lang.Math.*;
/**
 * 圆类
 * @author Joker
 *
 */
public class Circle {
	private double radius;  //圆的半径
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//无参构造时，设置半径和获得半径
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		if(radius<=0) {
			System.out.println("请设置正确的半径长度！");
			}
		return radius;
	}
	
	public double getArea() {
		if(radius<=0) {
			System.out.println("请设置正确的半径长度！");
			}
		double S;
		S = radius*radius*PI;
		return S;
	}
	
	public double getPerimeter() {
		if(radius<=0) {
			System.out.println("请设置正确的半径长度！");
			}
		double C;
		C = 2*radius*PI;		
		return C;
	}
	
	public void show() {
		if(radius<=0) {
			System.out.println("请设置正确的半径长度！");
			}else {
				System.out.println("圆的半径为："+radius);
				System.out.println("圆的周长为："+getPerimeter());
				System.out.println("圆的面积为："+getArea());
			}
	}
		
}
