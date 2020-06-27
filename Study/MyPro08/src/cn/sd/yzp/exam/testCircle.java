package cn.sd.yzp.exam;

/**
 * ≤‚ ‘‘≤¿‡∫Õ‘≤÷˘¿‡
 * @author Joker
 *
 */
public class testCircle {
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRadius(3);
		c1.show();
		
		Cylinder c2=new Cylinder(3,3);
//		c2.setRadius(4);

		c2.showVolume();
	}
}
