
/**
 * ����For���
 * @author Yin
 *
 */
public class TsetFor {
	public static void main(String[]args) {
		int sum = 0;
		for(int i=1;i<=100;i++) {   //����1��100���ۼӺ�
			sum+=i;
		}   //��for����ﶨ���iֻ������for��䣬�ھ����ⲻ�ᱻʶ��
		System.out.println("�ۼӺ�Ϊ��"+sum);

		//ѭ�����9-1֮�����
		for(int i=9;i>=1;i--) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\n##############");
		
		//ѭ�����90-1֮���ܱ�3��������
		for(int i=90;i>=1;i-=3) {
			System.out.print(i+"\t");
		}

		System.out.println("\n##############");

		for(int i=1,j=i+10;i<5;i++,j=i*2) {
			System.out.println("i="+i+"j="+j);			
		}
		
		
		for(;;) {
			System.out.println("���㵽��Զ����");			
		}
	}
}
