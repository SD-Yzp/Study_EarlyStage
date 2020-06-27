package cn.sd.yz.arr;

import java.util.Arrays;

/**
 * 使用二维数组存储表格数据
 * @author J
 *
 */
public class TestArrayTableData {
	public static void main(String[] args) {
		Object[] a1= {1001,"J",18,"教师","2006-2-14"};
		Object[] a2= {1002,"K",19,"助教","2009-8-24"};
		Object[] a3= {1003,"G",17,"秘书","2010-3-15"};
		
		Object[][] emps = new Object[3][];
		emps[0]=a1;
		emps[1]=a2;
		emps[2]=a3;
		
		for(Object[] temp:emps) {
			System.out.println(Arrays.toString(temp));
		}
		
		
	}
}
