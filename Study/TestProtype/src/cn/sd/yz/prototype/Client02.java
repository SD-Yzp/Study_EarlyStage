package cn.sd.yz.prototype;

import java.util.Date;

/**
 * 深克隆
 * @author Yin
 *
 */
public class Client02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(12431241414L);
		Sheep2 sheep = new Sheep2("少利",date);
		Sheep2 sheep2 = (Sheep2) sheep.clone();
//		System.out.println(sheep);
//		System.out.println(sheep.getName());
		System.out.println("克隆前："+sheep.getBirthday());
		
		date.setTime(222222223123L);
		sheep.setBirthday(date);
		System.out.println("修改日期，克隆前："+sheep.getBirthday());
		
//		System.out.println(sheep2.getName());
		System.out.println("修改日期，克隆后："+sheep2.getBirthday());
//		System.out.println(sheep);
	}
}
