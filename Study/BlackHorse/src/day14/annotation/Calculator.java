package day14.annotation;

public class Calculator {
	@Check
	public void add()
	{
		System.out.println("1+0="+(1+0));
	}
	
	@Check
	public void sub()
	{
		String str = null;
		System.out.println(str.toString());
		System.out.println("1-0="+(1-0));
	}
	
	@Check
	public void div()
	{
		System.out.println("1/0="+(1/0));
	}
	
	@Check
	public void rid()
	{
		System.out.println("1*0="+(1*0));
	}
	
	public void show() 
	{
		System.out.println("Calculator.show()");
	}
}
