package cn.sd.yzp.exam;

/**
 * Ӱ�Ӹ�
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