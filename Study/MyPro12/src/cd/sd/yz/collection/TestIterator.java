package cd.sd.yz.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {
	public static void main(String[] args) {
//		TestIteratorList();
//		TestIteratorSet();
		TestIteratorMap();
	}
	
	
	public static void TestIteratorList() {
		List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(22);
		list.add(33);
		
		//使用Iterator遍历List
		for(Iterator<Integer> iter = list.iterator();iter.hasNext();) {
			Integer temp = iter.next();
			System.out.println(temp);
		}	
	}
	
	public static void TestIteratorSet() {
		Set<Integer> set = new HashSet<>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		
		//使用Iterator遍历Set
		for(Iterator<Integer> iter = set.iterator();iter.hasNext();) {
			Integer temp = iter.next();
			System.out.println(temp);
		}	
	}
	
	public static void TestIteratorMap() {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		
		//第一种使用Iterator遍历Map的方法
		Set<Entry<Integer,String>> s1 = map.entrySet();
		for(Iterator<Entry<Integer,String>> iter = s1.iterator();iter.hasNext();) {
			Entry<Integer,String> temp = iter.next();
			System.out.println(temp.getKey()+"----"+temp.getValue());
		}
		
		System.out.println("-----------------");
		
		//第二种使用Iterator遍历Map的方法
		Set<Integer> s2 = map.keySet();
		for(Iterator<Integer> iter = s2.iterator();iter.hasNext();) {
			Integer temp = iter.next();
			System.out.println(temp+"----"+map.get(temp));
		}
	}
	
}


