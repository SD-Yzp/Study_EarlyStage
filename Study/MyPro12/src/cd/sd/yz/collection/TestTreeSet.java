package cd.sd.yz.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet
 * @author Y
 *
 */
public class TestTreeSet {
	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
		
		s1.add(10);
		s1.add(50);
		s1.add(60);
		s1.add(20);
		s1.add(40);
		
		System.out.println(s1);

		Set<Emp2> s2 = new TreeSet<>();
		
		s2.add(new Emp2(100,"张三",10000));
		s2.add(new Emp2(200,"李四",20000));
		s2.add(new Emp2(130,"王五",30000));
		s2.add(new Emp2(150,"赵六",50000));
		s2.add(new Emp2(140,"孙八",20000));
	
		for(Emp2 e:s2) {
			System.out.println(e);
		}
	}
}





//Comparable接口用来比较
class Emp2 implements Comparable<Emp2>{
	int id;
	String name;
	double salary;
	
	
	
	public Emp2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return  "id:"+id+",name:"+name+",salary:"+salary;
	}



	@Override
	public int compareTo(Emp2 o) {   //正数返回1，负数返回-1，相等返回0
		if(this.salary>o.salary) {
			return 1;
		}else if(this.salary<o.salary) {
			return -1;
		}else {
			if(this.id>o.id) {
				return 1;
			}else if(this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	
	
	
}




