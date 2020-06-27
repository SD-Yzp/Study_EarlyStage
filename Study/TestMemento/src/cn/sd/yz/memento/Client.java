package cn.sd.yz.memento;

/**
 * 测试备忘录模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		Emp emp = new Emp("莹莹", 17, 10000);
		
		CareTaker ct = new CareTaker();
		ct.setEm(emp.getMemento());
		
		System.out.println("第一次打印信息："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.setAge(3);
		emp.setName("成成");
		emp.setSalary(25);
		System.out.println("第二次打印信息："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		//备忘录恢复
		emp.recovery(ct.getEm());
		System.out.println("第三次打印信息："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		
	}
}
