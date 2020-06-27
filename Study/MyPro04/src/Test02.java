
/**
 * 测试构造方法
 * @author Yin
 *
 */

class Point{
	double x,y;
	
	//构造方法,类名保持一致
	public Point(double _x,double _y) {
		x=_x;
		y=_y;
	}
	
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}


public class Test02 {
	public static void main(String[]args) {
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0.0,0.0);
		System.out.println(p);
		System.out.println(origin);
		System.out.println(p.getDistance(origin));
	}
}
