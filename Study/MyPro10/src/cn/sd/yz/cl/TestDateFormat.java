package cn.sd.yz.cl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的互相转化
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 * @author J
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//将时间对象按照“格式字符串指定的格式”转成相应的字符串
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(new Date(4000000));
		System.out.println(str);
	
		//将字符串按照“格式字符串指定的格式”转成相应的时间对象
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = df2.parse("1983-5-10 10:45:39");
		System.out.println(date);
		
		//测试其他的格式字符
		DateFormat df3 = new SimpleDateFormat("D");  //D表示年中的天数，可以查询API了解DateFormat的相关格式
		String str3 = df3.format(new Date());
		System.out.println(str3);
	}
}
