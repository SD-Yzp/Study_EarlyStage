package cd.sd.yz.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ≤‚ ‘Set
 * @author Y
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		
		s1.add("10");
		s1.add("20");
		s1.add("10");
		
		System.out.println(s1);
		s1.remove("10");
		System.out.println(s1);
		
		
		Set<String> s2 = new HashSet<>();
		s2.add("aa");
		s2.addAll(s1);
		System.out.println(s2);
	}
}
