
/**
 * 测试Switch语句
 * @author Yin
 *
 */
public class TestSwitch {
	public static void main(String[]args) {
		int mouth = (int)(12*Math.random()+1); //生成月份
		switch(mouth) {
		case 1:
			System.out.println("一月份！");
			break;
		case 2:
			System.out.println("二月份！");
			break;
		case 3:
			System.out.println("三月份！");
			break;
		case 4:
			System.out.println("四月份！");
			break;
		case 5:
			System.out.println("五月份！");
			break;
		case 6:
			System.out.println("六月份！");
			break;
		case 7:
			System.out.println("七月份！");
			break;
		case 8:
			System.out.println("八月份！");
			break;
		case 9:
			System.out.println("九月份！");
			break;
		case 10:
			System.out.println("十月份！");
			break;
		case 11:
			System.out.println("十一月份！");
			break;
		case 12:
			System.out.println("十二月份！");
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
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:			
			System.out.println("辅音");
			break;			
		}
		
		
	}
}
