package cn.sd.yzp.exam;

import static java.lang.Math.*;
/**
 * 圆柱体类
 * @author Joker
 *
 */
public class Cylinder extends Circle {
	private double hight;
	
	public Cylinder() {
		super();
	}
	
	public Cylinder(double hight) {
		super();
		this.hight = hight;
	}
	
	public Cylinder(double radius,double hight) {
		super(radius);
		this.hight = hight;
	}
	
	
	
	//无参构造需要设置height
	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getVolume() {
		double V;
		V=getRadius()*getRadius()*PI*hight;
		return V;
	}
	
	public void showVolume() {
		if(getRadius()<=0) {
			System.out.println("请设置正确的半径长度！");
			}else {
				System.out.println("圆柱体的体积为："+getVolume());
			}
	}
}
