package Test1;

public class TestContinue {
	public static void main(String[] args) {
		int sum = 0;
		
		A:	for(int i=0;i<3;i++) {
				for(int j=i;j<3;j++) {
					sum += j;
					if(j>1) {
						continue A;
					}
				}
			}
	}
}
