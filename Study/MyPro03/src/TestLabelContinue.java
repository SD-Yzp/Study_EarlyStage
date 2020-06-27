
/**
 * 测试带标签的break和continue
 * @author Yin
 *
 */
public class TestLabelContinue {
	public static void main(String[]args) {
		outer:for(int i=101;i<=150;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					continue outer;
				}
			}
			System.out.print(i+" ");
		}
	}
}
