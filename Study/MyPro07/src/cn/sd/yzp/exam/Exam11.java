package cn.sd.yzp.exam;


/**
 * 第七章编程第二题
 * @author Joker
 *
 */
public class Exam11 {
	public static void main(String[] args) {
		int n = 100; //设置参数n
		int m = 0; //设置参数记录>=60的数据
		int max = -1;
		int min = -1;
		int[] num = new int[50];
		
		for(int i=0;i<50;i++) {
			num[i] = (int)(n*Math.random());
			if(max==-1) {
				max=num[i];
			}			
			if(min==-1) {
				min=num[i];
			}
			if(num[i]>=60) {
				m++;
			}
			if(num[i]>=max) {
				max = num[i];
			}		
			if(num[i]<=min) {
				min = num[i];
			}
		}
		
		System.out.println("最大的数为："+max);
		System.out.println("最小的数为："+min);
		System.out.println("大于60的数有："+m+"个");
		
	}
}
