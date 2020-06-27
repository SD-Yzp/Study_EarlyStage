package cn.sd.yz.prototype;

import java.util.Date;

/**
 * 浅克隆
 * @author Yin
 *
 */
public class Client01 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(12431241414L);
		Sheep sheep = new Sheep("少利",date);
//		System.out.println(sheep);
//		System.out.println(sheep.getName());
		System.out.println("克隆前："+sheep.getBirthday());
		
		date.setTime(222222223123L);
		sheep.setBirthday(date);
		System.out.println("修改日期，克隆前："+sheep.getBirthday());
		
		Sheep sheep2 = (Sheep) sheep.clone();
//		System.out.println(sheep2.getName());
		System.out.println("修改日期，克隆后："+sheep2.getBirthday());
//		System.out.println(sheep);
	}
}
