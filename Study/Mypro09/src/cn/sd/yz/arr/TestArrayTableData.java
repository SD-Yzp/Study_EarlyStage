package cn.sd.yz.arr;

import java.util.Arrays;

/**
 * ʹ�ö�ά����洢�������
 * @author J
 *
 */
public class TestArrayTableData {
	public static void main(String[] args) {
		Object[] a1= {1001,"J",18,"��ʦ","2006-2-14"};
		Object[] a2= {1002,"K",19,"����","2009-8-24"};
		Object[] a3= {1003,"G",17,"����","2010-3-15"};
		
		Object[][] emps = new Object[3][];
		emps[0]=a1;
		emps[1]=a2;
		emps[2]=a3;
		
		for(Object[] temp:emps) {
			System.out.println(Arrays.toString(temp));
		}
		
		
	}
}
