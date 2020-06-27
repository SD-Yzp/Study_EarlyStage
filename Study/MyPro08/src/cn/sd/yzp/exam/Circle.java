package cn.sd.yzp.exam;

import static java.lang.Math.*;
/**
 * Բ��
 * @author Joker
 *
 */
public class Circle {
	private double radius;  //Բ�İ뾶
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//�޲ι���ʱ�����ð뾶�ͻ�ð뾶
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		if(radius<=0) {
			System.out.println("��������ȷ�İ뾶���ȣ�");
			}
		return radius;
	}
	
	public double getArea() {
		if(radius<=0) {
			System.out.println("��������ȷ�İ뾶���ȣ�");
			}
		double S;
		S = radius*radius*PI;
		return S;
	}
	
	public double getPerimeter() {
		if(radius<=0) {
			System.out.println("��������ȷ�İ뾶���ȣ�");
			}
		double C;
		C = 2*radius*PI;		
		return C;
	}
	
	public void show() {
		if(radius<=0) {
			System.out.println("��������ȷ�İ뾶���ȣ�");
			}else {
				System.out.println("Բ�İ뾶Ϊ��"+radius);
				System.out.println("Բ���ܳ�Ϊ��"+getPerimeter());
				System.out.println("Բ�����Ϊ��"+getArea());
			}
	}
		
}
