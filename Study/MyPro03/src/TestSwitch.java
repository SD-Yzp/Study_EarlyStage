
/**
 * ����Switch���
 * @author Yin
 *
 */
public class TestSwitch {
	public static void main(String[]args) {
		int mouth = (int)(12*Math.random()+1); //�����·�
		switch(mouth) {
		case 1:
			System.out.println("һ�·ݣ�");
			break;
		case 2:
			System.out.println("���·ݣ�");
			break;
		case 3:
			System.out.println("���·ݣ�");
			break;
		case 4:
			System.out.println("���·ݣ�");
			break;
		case 5:
			System.out.println("���·ݣ�");
			break;
		case 6:
			System.out.println("���·ݣ�");
			break;
		case 7:
			System.out.println("���·ݣ�");
			break;
		case 8:
			System.out.println("���·ݣ�");
			break;
		case 9:
			System.out.println("���·ݣ�");
			break;
		case 10:
			System.out.println("ʮ�·ݣ�");
			break;
		case 11:
			System.out.println("ʮһ�·ݣ�");
			break;
		case 12:
			System.out.println("ʮ���·ݣ�");
			break;	
		}
		
		
		
		System.out.println("#############");
		char c = 'a';
		int rand = (int)(26*Math.random());
		char c2 = (char)(c+rand);
		System.out.print(c2+":");
		switch(c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ��");
			break;
		case 'y':
		case 'w':
			System.out.println("��Ԫ��");
			break;
		default:			
			System.out.println("����");
			break;			
		}
		
		
	}
}
