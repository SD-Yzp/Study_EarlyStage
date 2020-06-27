package day13.ObjectMethodReference;

/**
 * 构造方法引用
 * @author Yin
 *
 */
public class Demo04BuilderRef {
	public static void printName(String name,PersonBuilder pb)
	{
		Person p = pb.personBuilder(name);
		System.out.println(p.getName());
	}
	
	public static void main(String[] args) 
	{
		printName("刘亦菲", (String name)->{
			return new Person(name);
		});
		
		
		/*
		 	简化lambda表达式
		 	类名已经存在 Person
		 	构造方法已经存在new
		 	可以使用构造方法引用
		 */
		printName("赵丽颖",Person::new);
		
	}
}
