package cn.sd.yz.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 深克隆
 * @author Yin
 *
 */
public class Client03 {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Date date = new Date(12431241414L);
		Sheep3 sheep = new Sheep3("少利",date);

		System.out.println("克隆前："+sheep.getBirthday());
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(sheep);
		byte[] datas = baos.toByteArray();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(datas);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Sheep3 sheep2 = (Sheep3) ois.readObject();
		
		System.out.println("修改原型的属性");
		date.setTime(222222223123L);
		sheep.setBirthday(date);
		System.out.println("修改日期，克隆前："+sheep.getBirthday());
		
		
		System.out.println("修改日期，克隆后："+sheep2.getBirthday());
	}
}
