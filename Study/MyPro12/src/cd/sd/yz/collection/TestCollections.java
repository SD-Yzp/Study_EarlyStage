package cd.sd.yz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试Collections辅助类的使用
 * Collection是接口，Collections是工具类
 * @author Y
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add("y"+i);
		}
		
		System.out.println(list);
		
		Collections.shuffle(list);  //打乱顺序排列
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);   //按照从大到小正序排列
		
		Collections.shuffle(list);  //打乱顺序排列
		Collections.reverse(list);  //直接将排列逆序排列
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "y2"));  //二分法查找元素（要求排列已经是递增排序）
		
	}
}
