package cn.sd.yz.composite;

/**
 * 测试组合模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile f1,f2,f3,f4;
		Floder floder1 = new Floder("我的图片");
		Floder floder2 = new Floder("我的影片");
		
		f1 = new ImageFile("大头贴.jpg");
		f2 = new ImageFile("se.jpg");
		floder1.add(f1);
		floder1.add(f2);
		
		floder1.killVirus();
		
		f3 = new ImageFile("Magic.avi");
		f4 = new ImageFile("Science.avi");
		floder2.add(f3);
		floder2.add(f4);
		
		floder2.killVirus();
	}
}
