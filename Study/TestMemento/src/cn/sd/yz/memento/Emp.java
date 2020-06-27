package cn.sd.yz.memento;

/**
 * 源发器类
 * @author Yin
 *
 */
public class Emp {
	private String name;
	private int age;
	private double salary;
	
	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	//进行备忘操作，并且返回备忘录
	public EmpMemento getMemento() {
		return new EmpMemento(this);
	}
	
	//通过备忘录恢复信息，恢复成指定备忘录对象的值
	public void recovery(EmpMemento em) {
		this.name = em.getName();
		this.age = em.getAge();
		this.salary = em.getSalary();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
