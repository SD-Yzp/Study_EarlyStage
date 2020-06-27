package cd.sd.yz.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ����Collection�еķ���
 * @author Y
 *
 */
public class TestList {
	public static void main(String[] args) {
		test03();
		
		
		
	}
	
	public static void test01() {
		Collection<String> c = new ArrayList<>();
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		c.add("J");
		c.add("K");
		System.out.println(c);
		System.out.println(c.size());

		System.out.println(c.contains("J"));
		
		Object[] obj = c.toArray();
		System.out.println(obj);
		
		c.remove("J");
		System.out.println(c);
		
		c.clear();
		System.out.println(c.size());
		
	}

	public static void test02() {
		
		Collection<String> list01 = new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02 = new ArrayList<>();
		list02.add("aa");
//		list02.add("dd");
//		list02.add("ee");
		
		System.out.println("list01:"+list01);
		
//		list01.addAll(list02);
//		list01.removeAll(list02);
		list01.retainAll(list02);
		
		System.out.println("list01:"+list01);
		
		System.out.println(list01.containsAll(list02));
		
	}

	public static void test03() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		list.add(2, "Joker");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(2, "JJ");
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.add("C");
		list.add("B");
		list.add("A");
		System.out.println(list);
		
		System.out.println(list.indexOf("B"));
		System.out.println(list.indexOf("hhhh"));
		System.out.println(list.lastIndexOf("B"));

	}
}



