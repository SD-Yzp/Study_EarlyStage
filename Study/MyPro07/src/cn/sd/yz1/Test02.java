package cn.sd.yz1;
/**
 * ��������2
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
		
		//for-eachѭ�������ڶ�ȡ����Ԫ�ص�ֵ�������޸�Ԫ�ص�ֵ
		for(int m:arr02) {
			System.out.print(m);
		}
	}
}
