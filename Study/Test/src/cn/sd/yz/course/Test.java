package cn.sd.yz.course;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
    	Map<Integer,String> map = new HashMap<>();
    	map.put(1001, "庄晓曼");
    	map.put(1002, "武藤纯子");
    	map.put(1003, "方敏");
    	//通过Entry来遍历Map
    	Set<Entry<Integer,String>> set = map.entrySet();
    	for(Iterator<Entry<Integer,String>> iter = set.iterator();iter.hasNext();)
    	{
    		Entry<Integer,String> e = iter.next();
    		System.out.println(e.getKey()+"---"+e.getValue());
    	}
    	
    	System.out.println("----我是分割线----");
    	
    	//通过Key来遍历Map
    	Set<Integer> set2 = map.keySet();
    	for(Iterator<Integer> iter = set2.iterator();iter.hasNext();)
    	{
    		Integer key = iter.next();
    		System.out.println(key+"***"+map.get(key));
    	}
    }
}
 
class User implements Comparable<User> {
    int id;
    String uname;
    int age;
 
    public User(int id, String uname, int age) {
        this.id = id;
        this.uname = uname;
        this.age = age;
    }
    /**
     * 返回0 表示 this == obj 返回正数表示 this > obj 返回负数表示 this < obj
     */
    @Override
    public int compareTo(User o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }
	@Override
	public String toString() {
		return "id:"+id+",uname:"+uname+",age:"+age;
	}
    
    
}