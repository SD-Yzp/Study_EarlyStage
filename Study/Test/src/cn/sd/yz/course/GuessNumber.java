package cn.sd.yz.course;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		//随机生成的数
		int randomNumber = (int)(100*Math.random()+1);
//		System.out.println(randomNumber);
		//我们猜的数
		int guessNumber = 0;
		//猜的次数
		int count = 0;
		Scanner in = new Scanner(System.in);
		while(guessNumber!=randomNumber) {
			guessNumber = in.nextInt();
			count++;
			if(guessNumber<randomNumber) {
				System.out.println("小了");
			}else if(guessNumber>randomNumber){
				System.out.println("大了");
			}			
		}
		System.out.println("猜对了,你用了"+count+"次");
	}
}
