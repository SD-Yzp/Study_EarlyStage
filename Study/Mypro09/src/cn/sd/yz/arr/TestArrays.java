package cn.sd.yz.arr;

import java.util.Arrays;

/**
 * 测试java.util.Arrays工具类的使用
 * @author Joker
 *
 */
public class TestArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		System.out.println(a);  //打印数组引用的值
		System.out.println(Arrays.toString(a)); //打印数组的内容
		
		System.out.println("------------");
		
		int[] b = {34,455,123,555,126};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.binarySearch(b, 123));  //二分法查找返回索引
		System.out.println(Arrays.binarySearch(a, 123));  //二分法查找返回索引
		
	}
}
