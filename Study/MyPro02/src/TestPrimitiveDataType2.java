import java.math.*;
/**
 * ���Ը�����
 * @author Yin
 *
 */
public class TestPrimitiveDataType2 {
	public static void main(String[]args) {
		float a = 3.14F;//Ĭ��Ϊdouble�ͣ���Ҫ��F
		double b = 6.28;
		double c = 628E-2;
		
		System.out.println(c);
		
		//�������ǲ���ȷ�ģ�һ����Ҫ���ڱȽϣ�
		float f = 0.1F;
		double d = 1.0/10;
		System.out.println(f==d);//���Ϊfalse
		
		float d1 = 4234231442F;
		float d2 = d1+1;
		if(d1==d2) {
			System.out.println("d1==d2");
		}else {
			System.out.println("d1!=d2");
		}
		
		System.out.println("###########");
		//ʹ�þ�ȷ�������㣬�Ƽ���BigDecimal
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);//0.5
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);//0.5000000000000001
	
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		
		System.out.println(bd2.equals(bd3));
	
	}
}
