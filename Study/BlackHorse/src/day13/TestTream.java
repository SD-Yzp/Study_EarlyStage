package day13;

import java.util.ArrayList;
import java.util.List;

public class TestTream {
	public static void main(String[] args) {
		//创建一个list存储姓名
		List<String> list = new ArrayList<String>();
		
		list.add("张三丰");
		list.add("周芷若");
		list.add("赵敏");
		list.add("张强");
		list.add("张无忌");
		
		//对list中的元素进行过滤
//		for (String name : list) 
//		{
//			if(name.startsWith("张")&&name.length()==3)
//			{
//				System.out.println(name);
//			}
//		}
		
		//使用Stream对list中的元素进行过滤
		list.stream().
			filter(name->name.startsWith("张")).
			filter(name->name.length()==3).
			forEach(name->System.out.println(name));
		
		
		
	}
}
