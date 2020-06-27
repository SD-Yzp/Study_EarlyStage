package cn.sd.yz.arr;

/**
 * 测试二维数组
 * @author Joker
 *
 */
public class Test2DimensionArray {
	public static void main(String[] args) {
		int[][] a= new int[3][];  //后边的数无法指定
		
		a[0]=new int[] {20,30};
		a[1]=new int[] {10,15,30};
		a[2]=new int[] {50,60};
		
		System.out.println(a[1][2]);
		
		//静态初始化二维数组
		int[][] b = {
				{20,50},
				{50,50,60},
				{40,50,60}
		};
		
		System.out.println(b[1][1]);
		
	}
}
