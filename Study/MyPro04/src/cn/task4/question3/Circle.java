package cn.task4.question3;
/**
 * Բ�࣬���Լ����ܳ������
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
		System.out.println("Բ�����Ϊ��"+Area);
	}
	
	public void getPerimeter() {
		double Perimeter = 2*PI*r;
		System.out.println("Բ���ܳ�Ϊ��"+Perimeter);
	}
}
