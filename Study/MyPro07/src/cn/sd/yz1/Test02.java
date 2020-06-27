package cn.sd.yz1;
/**
 * 测试数组2
 * @author Yin
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] arr01= {1,2,3};
		
		for(int i=0;i<3;i++) {
			System.out.println(arr01[i]);
		}
		
		int[] arr02= {1,1,1,2,5,7,8};
		
		//for-each循环：用于读取数组元素的值，不能修改元素的值
		for(int m:arr02) {
			System.out.print(m);
		}
	}
}
