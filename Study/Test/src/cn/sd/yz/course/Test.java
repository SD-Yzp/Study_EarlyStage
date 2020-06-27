package cn.sd.yz.course;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
    	Map<Integer,String> map = new HashMap<>();
    	map.put(1001, "ׯ����");
    	map.put(1002, "���ٴ���");
    	map.put(1003, "����");
    	//ͨ��Entry������Map
    	Set<Entry<Integer,String>> set = map.entrySet();
    	for(Iterator<Entry<Integer,String>> iter = set.iterator();iter.hasNext();)
    	{
    		Entry<Integer,String> e = iter.next();
    		System.out.println(e.getKey()+"---"+e.getValue());
    	}
    	
    	System.out.println("----���Ƿָ���----");
    	
    	//ͨ��Key������Map
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
     * ����0 ��ʾ this == obj ����������ʾ this > obj ���ظ�����ʾ this < obj
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