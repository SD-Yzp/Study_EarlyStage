
/**
 * ����IfElse���
 * @author Yin
 *
 */
public class TestIfElse {
	public static void main(String[]args) {
		double r = 4*Math.random();//����[0,4)�İ뾶����Բ������ܳ�
		double area = Math.PI*Math.pow(r,2);  //Math.pow(r,2)��뾶��ƽ��
		double circle = 2*Math.PI*r; 
		System.out.println("�뾶Ϊ��"+r);
		System.out.println("���Ϊ��"+area);
		System.out.println("�ܳ�Ϊ��"+circle);
		if(area>circle) {
			System.out.println("�����ֵ�����ܳ���");
		}else {
			System.out.println("�ܳ���ֵ���������");
		}
		
	}
}
