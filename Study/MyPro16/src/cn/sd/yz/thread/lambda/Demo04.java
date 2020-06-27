package cn.sd.yz.thread.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo04 
{
	public static void main(String[] args) 
	{
		Person[] arr = {
				new Person("柳岩",38),
				new Person("迪丽热巴",18),
				new Person("古力娜扎",19)
		};
		
		for (Person person : arr) {
			System.out.println(person);
		}
		
		//一般形式
//		Arrays.sort(arr, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {				
//				return o1.getAge()-o2.getAge();
//			}
//		});
		
		//lambda表达式
		Arrays.sort(arr, (Person o1, Person o2)->{
			return o1.getAge()-o2.getAge();
		});
		
		for (Person person : arr) {
			System.out.println(person);
		}
	}
}
