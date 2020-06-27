package cn.sd.yz.cl;

import java.util.Date;

/**
 * 测试Date类
 * @author J
 *
 */
public class TestDate {
	public static void main(String[] args) {
		Date d = new Date(2000);  //CST指的是东八区时间
		System.out.println(d);
		
		System.out.println(d.getTime());
		
		Date d2 = new Date();  //默认为当前时间
		System.out.println(d2.getTime());
		
		System.out.println(d2.after(d));
		
		//带删除线的代表这种方法已经被废除掉了，不推荐使用，遇到日期处理：使用Calender日期类
		Date d3 = new Date(2019-1900,5,6);  //2019年6月6日
		System.out.println(d3);
	}
}
