package cd.sd.yz.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001,"J",1000);
		Employee e2 = new Employee(1002,"K",2000);
		Employee e3 = new Employee(1003,"L",3000);
		Employee e4 = new Employee(1004,"M",4000);

		
		Map<Integer,Employee> m1 = new HashMap<>();
		
		m1.put(1001,e1);
		m1.put(1002,e2);
		m1.put(1003,e3);
		m1.put(1001,e4);  //替代了e1
		
		
		System.out.println(m1);
		
	}
}


//雇员信息
class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return " id:" + id + " name:" + name + " salary:" + salary ;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
	
	
	
}