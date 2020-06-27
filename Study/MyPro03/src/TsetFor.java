
/**
 * 测试For语句
 * @author Yin
 *
 */
public class TsetFor {
	public static void main(String[]args) {
		int sum = 0;
		for(int i=1;i<=100;i++) {   //计算1到100的累加和
			sum+=i;
		}   //在for语句里定义的i只适用于for语句，在句子外不会被识别
		System.out.println("累加和为："+sum);

		//循环输出9-1之间的数
		for(int i=9;i>=1;i--) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\n##############");
		
		//循环输出90-1之间能被3整除的数
		for(int i=90;i>=1;i-=3) {
			System.out.print(i+"\t");
		}

		System.out.println("\n##############");

		for(int i=1,j=i+10;i<5;i++,j=i*2) {
			System.out.println("i="+i+"j="+j);			
		}
		
		
		for(;;) {
			System.out.println("爱你到永远！！");			
		}
	}
}
