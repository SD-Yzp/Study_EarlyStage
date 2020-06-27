package cn.sd.yz.arr;

import java.util.Arrays;

/**
 * 测试冒泡排序以及优化
 * @author J
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
		int[] a = {1,5,65,8,2,3,47,24,82,69,63,51};
		int temp;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {		
			boolean flag=true;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
			}
				if(flag) {
					break;
				}
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
