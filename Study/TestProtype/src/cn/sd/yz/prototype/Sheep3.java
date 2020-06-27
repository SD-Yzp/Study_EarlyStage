package cn.sd.yz.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep3 implements Cloneable, Serializable{
	private String name;
	private Date birthday;
	
	public Sheep3() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Sheep3(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}



	
	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();  
		
		
	}
}
