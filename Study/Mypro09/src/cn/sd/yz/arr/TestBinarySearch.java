package cn.sd.yz.arr;

import java.util.Arrays;

/**
 * 测试二分法查找
 * @author J
 *
 */
public class TestBinarySearch {
	public static void main(String[] args) {
		int[] a={1,5,65,8,2,3,47,24,82,69,63,51};
		int key=a.length/2;
		int value=47;
		int max=a.length;
		int min=0;
		
		//排序
		Arrays.sort(a);		
		System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<=(a.length/2);i++) {
			if(value==a[key]) {
				System.out.println(key);
				break;
			}else if(value>a[key]){
				min=key;
				key=(max+key)/2;
			}else{
				max=key;
				key=(min+key)/2;
			}
			
			if(i==a.length/2) {
				System.out.println("没有找到！");
			}
		}
	}
}
