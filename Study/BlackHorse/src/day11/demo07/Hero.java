package day11.demo07;

public class Hero 
{
	private String name;
	private Skill skill;
	
	
	
	public Hero() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hero(String name) 
	{
		super();
		this.name = name;
	}
	
	public Hero(String name, Skill skill) 
	{
		super();
		this.name = name;
		this.skill = skill;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Skill getSkill() 
	{
		return skill;
	}
	public void setSkill(Skill skill) 
	{
		this.skill = skill;
	}
	
	
	public void attack()
	{
		System.out.println("英雄"+name+"正在使用武器攻击敌人！");
		skill.use();
		System.out.println("攻击结束！");
	}
	
	
}
