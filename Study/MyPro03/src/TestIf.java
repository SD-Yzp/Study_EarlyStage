
/**
 * ����if��ѡ��ṹ
 * @author Yin
 *
 */
public class TestIf {
	public static void main(String[]args) {
		double d = Math.random();  //����0��1�����double�������������������1
		System.out.println(d);
		
/*		int i = (int)(6*Math.random())+1;
		System.out.println(i);
		if(i<=3) {
			System.out.println("С");
		}
*/
		
		System.out.println("##########");
		int i = (int)(6*Math.random())+1;//ͨ��Math.random()���������
		int j = (int)(6*Math.random())+1;
		int k = (int)(6*Math.random())+1;
		int count = i+j+k;
		//�����������֮�ʹ���15������������
		if(count>15) {
			System.out.println("������������");
		}
		//�����������֮����10��15֮�䣬������һ��
		if(count>=10&&count<=15) {
			System.out.println("��������һ��");
		}
		//�����������֮��С��10������������ô��
		if(count<10) {
			System.out.println("������������ô��");
		}
		System.out.println("�������"+count+"��");
	}
}
