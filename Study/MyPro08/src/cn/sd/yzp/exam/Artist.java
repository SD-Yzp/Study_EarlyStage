package cn.sd.yzp.exam;

/**
 * 艺人类
 * @author Joker
 *
 */
public class Artist implements Showtime{
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void playTeleplay() {
		System.out.println("我能演电视剧");		
	}

	@Override
	public void playMovie() {
		System.out.println("我能演电影");		
	}

	@Override
	public void sing() {
		System.out.println("我会唱歌");
	}
	
}
