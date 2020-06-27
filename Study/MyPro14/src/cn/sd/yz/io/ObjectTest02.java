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
 * ���Զ�����(д���ļ�)
 * ObjectOutputStream ObjectInputStream
 * 1����д�����ȡ��д��ָ���Ǵӳ���д�����ļ������ݿ�ȣ�
 * 2����ȡ��˳����д����˳��һ��
 * 3���������ж��󶼿������л���ֻ��ʵ��Serializable�ӿڲſ������л�
 * @author Yin
 *
 */
public class ObjectTest02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.ser")));
		//����������������
		oos.writeUTF("����������");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');		
				
		//д����� --->���л�
		oos.writeObject("˭������ζ");
		oos.writeObject(new Date());
		oos.writeObject(new Employee("����",4000));		
		oos.flush();
		oos.close();		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.ser")));
		String str = ois.readUTF();
		int age = ois.readInt();
		boolean flag = ois.readBoolean();
		char ch = ois.readChar();
		System.out.println(age);
		//��������ȡʱ��Ҫ�ж��Ƿ�Ϊĳ�����ʵ��  ---->���ڶ���������ȡ ���Ƿ����л�
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
		ois.close(); // �ļ���������Ҫ�ر�
	}		
}


