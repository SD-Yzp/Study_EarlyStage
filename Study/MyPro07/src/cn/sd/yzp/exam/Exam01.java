package cn.sd.yzp.exam;

/**
 * �����±�̵�һ�⣨�����棩
 * @author Joker
 *
 */
public class Exam01 {
	public static void main(String[] args) {
		String[] str1 = new String[10];
		for(int i=0;i<str1.length;i++) {
			str1[i]="a"+i;
		}
		
		//������������
		for(int i=0;i<str1.length;i++) {
			System.out.print(str1[i]+" ");
		}		
		
		String str2 = "a";
		int i=0;
		
		while(true) {
			if(str2.equals(str1[i])) {
				System.out.println("Yes");
				break;
			}else {i++;}

			
			if(i==str1.length) {
				System.out.println("No");
				break;
			}
		}
		
	}	
}	
	



//@Override
//public String toString(String[] str) {
//	StringBuilder sb = new StringBuilder();
//	sb.append("[");
//	for(int i=0;i<str.length;i++) {
//		sb.append(str[i]+",");
//	}
//	sb.indexOf("]", str.length-1);
//	return sb.toString();
//}



