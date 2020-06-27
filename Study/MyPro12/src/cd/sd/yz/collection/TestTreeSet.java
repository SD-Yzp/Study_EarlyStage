package cd.sd.yz.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * ����TreeSet
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
		
		s2.add(new Emp2(100,"����",10000));
		s2.add(new Emp2(200,"����",20000));
		s2.add(new Emp2(130,"����",30000));
		s2.add(new Emp2(150,"����",50000));
		s2.add(new Emp2(140,"���",20000));
	
		for(Emp2 e:s2) {
			System.out.println(e);
		}
	}
}





//Comparable�ӿ������Ƚ�
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
	public int compareTo(Emp2 o) {   //��������1����������-1����ȷ���0
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




