package day11.demo07;

/**
 * 测试接口，匿名内部类
 * @author Yin
 *
 */
public class Demo01 
{
	public static void main(String[] args) 
	{
		Hero hero = new Hero("艾希");
		
		Skill skill = new SkillImpl();
		
		hero.setSkill(skill);
		
		hero.attack();
		
		
		System.out.println("============");
		
		Skill skill2 = new Skill()
				{

					@Override
					public void use() 
					{
						System.out.println("Shua~Shua~Shua~");
					}
			
				};    //注意这里有个;
		
		hero.setSkill(skill2);
		
		hero.attack();
		
		System.out.println("============");
		
		hero.setSkill(new Skill()
				{
					public void use() 
					{
						System.out.println("Biu~Biu~Biu~");
					}
				}    //注意这里没有;
		);
		
		hero.attack();
		
	}
}
