package cn.sd.yz.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * ���Զ�����
 * ObjectOutputStream ObjectInputStream
 * 1����д�����ȡ��д��ָ���Ǵӳ���д�����ļ������ݿ�ȣ�
 * 2����ȡ��˳����д����˳��һ��
 * 3���������ж��󶼿������л���ֻ��ʵ��Serializable�ӿڲſ������л�
 * @author Yin
 *
 */
public class ObjectTest01{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();	
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(baos));
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
		byte[] datas = baos.toByteArray();
		ByteArrayInputStream bais = new ByteArrayInputStream(datas);
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(bais));
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
	}		
}

//javabean ���ڷ�װ����
class Employee implements Serializable{
	private transient String name;   //�ؼ���transient  �����ݲ���Ҫ���л��������ñ��˿�����Ϣ
	private double salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(java.lang.String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	
}
