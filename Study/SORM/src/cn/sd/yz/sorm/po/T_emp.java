package cn.sd.yz.sorm.po;

import java.sql.*;
import java.util.*;

public class T_emp {

	private String name;
	private Integer id;
	private Double salary;
	private Integer age;


	public String getName()
	{
		return name;
	}
	public Integer getId()
	{
		return id;
	}
	public Double getSalary()
	{
		return salary;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(Integer id)
	{
		this.id=id;
	}
	public void setSalary(Double salary)
	{
		this.salary=salary;
	}
	public void setAge(Integer age)
	{
		this.age=age;
	}
}
