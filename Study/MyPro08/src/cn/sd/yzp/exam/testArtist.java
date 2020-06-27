package cn.sd.yzp.exam;

/**
 * 测试艺人接口
 * @author Joker
 *
 */
public class testArtist {
	public static void main(String[] args) {
		Artist a = new Artist();
		a.setName("杨幂");
		System.out.println("大家好，我是"+a.getName());
		a.playMovie();
		a.playTeleplay();
		a.sing();
	}
}
