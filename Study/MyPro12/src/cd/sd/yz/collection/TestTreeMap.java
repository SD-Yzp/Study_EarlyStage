package cd.sd.yz.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * 测试TreeMap
 * @author Y
 *
 */
public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer,String> m1 = new TreeMap<>();
		
		m1.put(20, "aa");
		m1.put(3,"dd");
		m1.put(5, "123");
		
		
		//按照key递增的方式排序
		for(Integer key:m1.keySet()) {
			System.out.println(key+"--"+m1.get(key));
		}
		
		Map<Emp,String> m2 = new TreeMap<>();
		
		m2.put(new Emp(200,"张三",20000), "张三是个好小伙！");
		m2.put(new Emp(100,"李四",4000), "李四工作不积极！");
		m2.put(new Emp(150,"王五",4000), "王五工作还可以！");
		
		for(Emp e:m2.keySet()) {
			System.out.println(e+"--"+m2.get(e));
		}
		
	}
}


//Comparable接口用来比较
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
	public int compareTo(Emp o) {   //正数返回1，负数返回-1，相等返回0
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

