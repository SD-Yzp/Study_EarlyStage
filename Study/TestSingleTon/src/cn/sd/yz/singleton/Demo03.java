package cn.sd.yz.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 通过反序列化破解单例模式
 * @author Yin
 *
 */
public class Demo03 {	
	public static void main(String[] args) throws Exception {
		FileOutputStream fis = new FileOutputStream("f:/myjava/t.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		SingleTon01 instance = SingleTon01.getInstance();
		SingleTon07 instance7 = SingleTon07.getInstance();
		oos.writeObject(instance);
		oos.writeObject(instance7);
		oos.close();
		fis.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:/myjava/t.txt"));
		SingleTon01 instance1 = (SingleTon01) ois.readObject();
		SingleTon07 instance8 = (SingleTon07) ois.readObject();
		System.out.println("使用懒汉式单例模式创建的对象地址为："+instance);
		System.out.println("使用反序列化破解懒汉式单例模式创建的对象地址为："+instance1);
		
		System.out.println("使用懒汉式单例模式创建的对象地址为："+instance7);
		System.out.println("使用反序列化破解懒汉式单例模式创建的对象地址为："+instance8);

	}
}
