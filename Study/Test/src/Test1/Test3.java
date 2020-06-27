package Test1;

import java.util.ArrayList;
import java.util.List;

public class Test3 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		
		
		
		
		System.out.println(list.equals(test1(list)));
	}
	
	public static List<Integer> test1(List<Integer> list)
	{
		System.out.println(list);
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		return list;
	}
}
