package cn.sd.yz.flyweight;

/**
 * 享元类
 * @author Yin
 *
 */
public interface ChessFlyWeight {
	void setColor(String color);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight {
	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子的颜色为："+getColor());
		System.out.println("棋子的位置为：("+c.getX()+","+c.getY()+")");
	}
	
}