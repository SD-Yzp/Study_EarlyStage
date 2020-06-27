package cn.sd.yz.six;

import java.util.Scanner;

/**
 * µ¥´Ê³¤¶È
 * @author Yin
 *
 */
public class WordLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] words = str.split(" ");
		for(String word:words) 
		{
			if(word.endsWith(".")) 
			{
				word = word.substring(0, word.length()-1);
				System.out.print(word.length());
			}
			else
			{	
				System.out.print(word.length()+" ");
			}
		}
	}
}
