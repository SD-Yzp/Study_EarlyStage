package cn.sd.yzp.exam;

/**
 * ʵ�������������
 * @author Joker
 *
 */
public class Exam21 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int transit ;  //����һ����������¼����
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(10*Math.random());  //����10���ڵ��������
			System.out.print(num[i]+" ");   //˳�����
		}
		
		System.out.println();
		System.out.println("------���Ƿָ���-------");
		
		//ʵ���������
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
