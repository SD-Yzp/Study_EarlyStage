package cd.sd.yz.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格数据的存储
 * ORM思想的简单实验：map表示一行数据，多行数据是多个map；将多个map放到list中
 * @author Y
 *
 */
public class TestStoreData01 {
	public static void main(String[] args) {
		User u1 = new User("1001","J",20000,"2018-5-20");
		User u2 = new User("1002","K",23000,"2018-4-15");
		User u3 = new User("1003","G",25000,"2018-3-24");
		
		//使用List遍历
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		for(Iterator<User> iter=list.iterator();iter.hasNext();) {
			User temp = iter.next();
			System.out.println(temp);
		}
		
		//使用Map遍历
		Map<Integer,User> map = new HashMap<Integer, User>();
		map.put(1001, u1);
		map.put(1002, u2);
		map.put(1003, u3);
		
		Set<Integer> s = map.keySet();
		for(Iterator<Integer> iter=s.iterator();iter.hasNext();) {
			Integer key = iter.next();
			System.out.println(key+"------"+map.get(key));
		}
		
	}
}


class User{
	private String id;
	private String name;
	private double salary;
	private String hiredata;
	
	//一个完整的javabean要有set和get方法以及一个空的构造。
	public User() {
		super();
	}	
	
	public User(String id, String name, double salary, String hiredata) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hiredata = hiredata;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHiredata() {
		return hiredata;
	}
	public void setHiredata(String hiredata) {
		this.hiredata = hiredata;
	}


	@Override
	public String toString() {
		return "id:"+id+",name:"+name+",salary:"+salary+",hiredata:"+hiredata;
	}
	
	
	
}