package cn.sd.yz.course;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		//������ɵ���
		int randomNumber = (int)(100*Math.random()+1);
//		System.out.println(randomNumber);
		//���ǲµ���
		int guessNumber = 0;
		//�µĴ���
		int count = 0;
		Scanner in = new Scanner(System.in);
		while(guessNumber!=randomNumber) {
			guessNumber = in.nextInt();
			count++;
			if(guessNumber<randomNumber) {
				System.out.println("С��");
			}else if(guessNumber>randomNumber){
				System.out.println("����");
			}			
		}
		System.out.println("�¶���,������"+count+"��");
	}
}
