package day13.ObjectMethodReference;

/**
 * 测试使用this调用本类成员方法
 * @author Yin
 *
 */
public class Husband {
	
	public void buyHouse()
	{
		System.out.println("在北京买了一套四合院");
	}
	
	public void marry(Richable r)
	{
		r.buy();
	}
	
	public void soHappy() 
	{
		marry(()->this.buyHouse());
		
		marry(this::buyHouse);
	}
	
	public static void main(String[] args) 
	{
		new Husband().soHappy();
	}
}
