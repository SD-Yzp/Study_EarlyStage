
/**
 * 测试数据溢出
 * @author Yin
 *
 */
public class TestOverflow {
	public static void main(String[]args) {
		int money = 1000000000;  //10亿
		int years = 20;
		int total = money*years;  //返回的total是负数，超过了int的范围
		System.out.println("total="+total);
		long total1 = money*years;  //返回的total仍然是负数。默认是int，因此结果会转成为int值，再转成long。但是已经发生了数据丢失
		System.out.println("total1="+total1);
		long total2 = money*((long)years);  //返回的total2正确：先将一个因子变成long，整个表达式发生提升。全部用long来计算。
		System.out.println("total2="+total2);	
		
		long total3 = 34444444444444L*years;  //为了避免溢出，先将一个数值定为long类型
		System.out.println("total3="+total3);	
		
		int l = 2;  //分不清是L还是1
		long a = 23456l;  //建议使用大写L
		System.out.println(l+1);
			
	}
}
