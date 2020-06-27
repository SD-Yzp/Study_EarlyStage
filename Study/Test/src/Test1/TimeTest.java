package Test1;


/**
 * 测试两种叠加方法占用的时间
 * @author Yin
 *
 */
public class TimeTest {
	public static void main(String[] args) {
		long sum = 0;
		long n = 100000000;
		long date;
		
		long d1 = System.currentTimeMillis();
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		long d2 = System.currentTimeMillis();
		date = d2 - d1;
		System.out.println(date);
		
		long d3 = System.currentTimeMillis();
		sum=n*(n+1)/2;
		long d4 = System.currentTimeMillis();
		date = d4 - d3;
		System.out.println(date);
	}
}
