package cn.sd.yzp.exam;

import static java.lang.Math.*;
/**
 * Բ������
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
	
	
	
	//�޲ι�����Ҫ����height
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
			System.out.println("��������ȷ�İ뾶���ȣ�");
			}else {
				System.out.println("Բ��������Ϊ��"+getVolume());
			}
	}
}
