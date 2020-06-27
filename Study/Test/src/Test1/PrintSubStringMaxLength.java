package Test1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintSubStringMaxLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] c = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		int start = 0;
		int max = 0;
		int num = 0;
		
//		for(int i=0;i<s.length();i++) {
//			System.out.print(c[i]);
//		}
		
		OUTER:
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				set.add(c[j]);
				num++;
				if(set.size()!=num) {
					if(max<num-1) {						
						max = num-1;
						start = j-max;
					}
					set.clear();
					num=0;
					continue OUTER;
				}
			}
		}
		
		System.out.println(max);
		String str = s.substring(start,start+max);
		System.out.println(str);
	}
}
