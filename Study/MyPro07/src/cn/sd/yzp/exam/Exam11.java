package cn.sd.yzp.exam;


/**
 * �����±�̵ڶ���
 * @author Joker
 *
 */
public class Exam11 {
	public static void main(String[] args) {
		int n = 100; //���ò���n
		int m = 0; //���ò�����¼>=60������
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
		
		System.out.println("������Ϊ��"+max);
		System.out.println("��С����Ϊ��"+min);
		System.out.println("����60�����У�"+m+"��");
		
	}
}
