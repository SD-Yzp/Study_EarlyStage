package recursion;

public class CalculateSum 
{
	public static void main(String[] args) 
	{
		int a = 100;
		System.out.println(calculate(a));
	}
	
	public static int calculate(int a)
	{
		if(a==1)
		{
			return 1;
		}
		
		return a+calculate(--a);
	}
}
