
/**
 * ����Ƕ��ѭ��
 * @author Yin
 *
 */
public class TestWhileQianTao {
	public static void main(String[]args) {
		for(int i=1;i<=5;i++) {    //���һ��ÿ��Ϊ12345�����о���
			for(int j=1;j<=5;j++) {
				System.out.print(j+"\t");
			}
			System.out.print("\n");			
		}
		
		System.out.println("##########");			
		
		for(int i=1;i<=9;i++) {    //9*9�˷���
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.print("\n");			
		}	
		
		
		//��ҵ1��whileѭ���ֱ����100���ڵ�������ż���ĺͣ��������
		int a=1;
		int sum1=0,sum2=0;
		while(a<=100) {
			if(a%2==1) {
				sum1+=a;
				a++;
			}else {
				sum2+=a;
				a++;
			}
		}
		System.out.println("�����ĺ�Ϊ��"+sum1);
		System.out.println("ż���ĺ�Ϊ��"+sum2);
		
		//��whileѭ��������ѭ�����1-1000֮���ܱ�5������������ÿ�����5����		
		for(int i=5;i<=1000;) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+" ");
				i=i+5;
			}
			System.out.println();
		}
	}
}
