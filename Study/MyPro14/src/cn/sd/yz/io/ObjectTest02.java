package cn.sd.yz.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 测试对象流(写入文件)
 * ObjectOutputStream ObjectInputStream
 * 1、先写出后读取（写出指的是从程序写出到文件、数据库等）
 * 2、读取的顺序与写出的顺序一致
 * 3、不是所有对象都可以序列化，只有实现Serializable接口才可以序列化
 * @author Yin
 *
 */
public class ObjectTest02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.ser")));
		//跟数据流内容类似
		oos.writeUTF("编码辛酸泪");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');		
				
		//写入对象 --->序列化
		oos.writeObject("谁解其中味");
		oos.writeObject(new Date());
		oos.writeObject(new Employee("马云",4000));		
		oos.flush();
		oos.close();		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.ser")));
		String str = ois.readUTF();
		int age = ois.readInt();
		boolean flag = ois.readBoolean();
		char ch = ois.readChar();
		System.out.println(age);
		//对象流读取时需要判断是否为某个类的实例  ---->对于对象流，读取 就是反序列化
		Object str2 = ois.readObject();
		Object date = ois.readObject();
		Object emp = ois.readObject();
		
		if(str2 instanceof String) {
			String strObj = (String)str2;
			System.out.println(strObj);
		}
		
		if(date instanceof Date) {
			Date dateObj = (Date)date;
			System.out.println(dateObj);
		}
		
		if(emp instanceof Employee) {
			Employee empObj = (Employee)emp;
			System.out.println(empObj.getName()+"--->"+empObj.getsalary());
		}
		ois.close(); // 文件输入流需要关闭
	}		
}


