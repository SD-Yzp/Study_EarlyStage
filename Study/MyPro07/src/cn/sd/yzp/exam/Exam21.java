package cn.sd.yzp.exam;

/**
 * 实现数组逆序操作
 * @author Joker
 *
 */
public class Exam21 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int transit ;  //设置一个过渡数记录数据
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(10*Math.random());  //产生10以内的随机整数
			System.out.print(num[i]+" ");   //顺序输出
		}
		
		System.out.println();
		System.out.println("------我是分割线-------");
		
		//实现逆序操作
		for(int i=0;i<(num.length/2);i++) {
			transit=num[i];
			num[i]=num[num.length-i-1];
			num[num.length-i-1]=transit;
		}
		
		for(int temp:num) {
			System.out.print(temp+" ");
		}
	}
}
