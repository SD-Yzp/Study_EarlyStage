
/**
 * ���Ի����������ͣ����ͱ�����
 * @author Yin
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[]args) {
		//�������α���
		int a = 15;
		int b = 015;//��0��ͷ8����
		int c = 0x15;//��0x��ͷΪ16����
		int d = 0b01110011;//��0b��ͷΪ2����
		
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		byte age = 30 ;
		short salary = 30000;
		int population = 2000000000;//���ͳ���Ĭ����int����
		long globalPopulation = 7400000000L;//��߼�l����L��������һ��long���͵����ݣ�һ����L
	}
}
