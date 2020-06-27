package cn.sd.yz.mycollection;

import java.util.HashMap;
import java.util.Map;

/**
 * 编辑一个基本的HashSet
 * @author Y
 *
 */
public class MyHashSet<E> {
	Map map;
	
	private static final Object PRESENT = new Object();
	
	
	
	public MyHashSet() {
		map = new HashMap();
	}

	public void add(E element) {
		map.put(element, PRESENT);
	}

	@Override
	public String toString() {
		StringBuilder sb =new StringBuilder("[");
		
		for(Object o:map.keySet()) {
			sb.append(o+",");
		}
		
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		MyHashSet<Integer> h1 = new MyHashSet<Integer>();
		
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(20);
		
		System.out.println(h1);
	}
	
}
