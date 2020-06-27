
/**
 * 测试break和continue语句
 * @author Yin
 *
 */
public class TestBreakContinue {
	public static void main(String[]args) {
		
		//测试break
		int total = 0;  //定义计数器
		System.out.println("Begin");
		while(true) {
			total++;
			int i = (int)(100*Math.random());
			//当i=88的时候退出循环
			if(i==88) {
				break;
			}
		}
		//输出循环的次数
		System.out.println("次数为："+total);	
		
		//测试continue
		int count = 0;  //定义计数器
		for(int i=100;i<150;i++) {
			if(i%3==0) {
				continue;
			}else {
				System.out.print(i+"、");					
				count++;
			}
			if(count%5==0) {
				System.out.println();						
			}
		}
		
		
	}
}
