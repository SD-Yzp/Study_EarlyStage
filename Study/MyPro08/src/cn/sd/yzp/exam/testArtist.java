package cn.sd.yzp.exam;

/**
 * �������˽ӿ�
 * @author Joker
 *
 */
public class testArtist {
	public static void main(String[] args) {
		Artist a = new Artist();
		a.setName("����");
		System.out.println("��Һã�����"+a.getName());
		a.playMovie();
		a.playTeleplay();
		a.sing();
	}
}
