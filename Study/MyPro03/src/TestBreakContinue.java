
/**
 * ����break��continue���
 * @author Yin
 *
 */
public class TestBreakContinue {
	public static void main(String[]args) {
		
		//����break
		int total = 0;  //���������
		System.out.println("Begin");
		while(true) {
			total++;
			int i = (int)(100*Math.random());
			//��i=88��ʱ���˳�ѭ��
			if(i==88) {
				break;
			}
		}
		//���ѭ���Ĵ���
		System.out.println("����Ϊ��"+total);	
		
		//����continue
		int count = 0;  //���������
		for(int i=100;i<150;i++) {
			if(i%3==0) {
				continue;
			}else {
				System.out.print(i+"��");					
				count++;
			}
			if(count%5==0) {
				System.out.println();						
			}
		}
		
		
	}
}
