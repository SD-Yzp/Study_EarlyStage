package cn.sd.yzp.exam;

/**
 * ≤‚ ‘¿÷ ÷¿‡
 * @author Yin
 *
 */
public class testMusician {
	public static void main(String[] args) {
		Musician m1 = new Musician();
		m1.play(new Erhu());
		Musician m2 = new Musician();
		m2.play(new Piano());
		Musician m3 = new Musician();
		m3.play(new Violin());
	}
}
