package cd.sd.yz.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * ����TreeMap
 * @author Y
 *
 */
public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer,String> m1 = new TreeMap<>();
		
		m1.put(20, "aa");
		m1.put(3,"dd");
		m1.put(5, "123");
		
		
		//����key�����ķ�ʽ����
		for(Integer key:m1.keySet()) {
			System.out.println(key+"--"+m1.get(key));
		}
		
		Map<Emp,String> m2 = new TreeMap<>();
		
		m2.put(new Emp(200,"����",20000), "�����Ǹ���С�");
		m2.put(new Emp(100,"����",4000), "���Ĺ�����������");
		m2.put(new Emp(150,"����",4000), "���幤�������ԣ�");
		
		for(Emp e:m2.keySet()) {
			System.out.println(e+"--"+m2.get(e));
		}
		
	}
}


//Comparable�ӿ������Ƚ�
class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	
	
	
	public Emp(int id, String name, double salary) {
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
	public int compareTo(Emp o) {   //��������1����������-1����ȷ���0
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

