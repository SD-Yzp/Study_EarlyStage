package Test1;

/**
 * ���Եݹ��ӡa-b
 * �ݹ飺�����Լ������Լ�
 * �ݹ�ͷ����ʱ�����ݹ�
 * �ݹ��壺�ظ�����
 * @author Yin
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
		printFigure(1,10);
	}
	
	
	public static void printFigure(int a,int b) {
		if(a>b) {
			throw new RuntimeException("�����ʽΪ��a<=b��");
		}
		
		//�Ż�
		System.out.print(a+"\t");
		if(a==b) {
			return;
		}
		printFigure(a+1,b);
		
		
		
//		if(a==b) {         //�ݹ�ͷ
//			System.out.print(a+"\t");
//		}else {
//			System.out.print(a+"\t");
//			printFigure(a+1,b);         //�ݹ���
//		}
		
	}
	
}
