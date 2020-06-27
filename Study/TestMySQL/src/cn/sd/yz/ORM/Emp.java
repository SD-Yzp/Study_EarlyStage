package cn.sd.yz.ORM;

public class Emp {
	private Integer id;
	private String name;
	private Double salary;
	private Integer age;
	public Emp(Integer id, String name, Double salary, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	
	public Emp() {
		super();
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
