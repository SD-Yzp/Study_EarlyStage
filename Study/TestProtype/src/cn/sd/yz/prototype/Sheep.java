package cn.sd.yz.prototype;

import java.util.Date;

public class Sheep implements Cloneable{
	private String name;
	private Date birthday;
	
	public Sheep() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Sheep(String name, Date birthday) {
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
		// TODO Auto-generated method stub
		return super.clone();
	}
}
