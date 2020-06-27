package cn.sd.yzp.exam;

/**
 * ”∞ ”∏Ë
 * @author Joker
 *
 */
public interface Showtime extends Movie,Sing,Teleplay{

}

interface Movie {
	void playMovie();
}

interface Sing {
	void sing();
}

interface Teleplay {
	void playTeleplay();
}