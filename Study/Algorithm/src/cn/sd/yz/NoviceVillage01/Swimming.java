package cn.sd.yz.NoviceVillage01;

import java.util.Scanner;

public class Swimming {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		int hours = c - a;
		int minutes = d - b;
		
		if(minutes<0) {
			hours--;
			minutes += 60;
		}
		if(minutes==60) {
			hours++;
			minutes=0;
		}
		System.out.println(hours+" "+minutes);
	}
}
